package org.elevenfifty.shoppingapplication.controller;

import java.util.Date;

import javax.validation.Valid;

import org.elevenfifty.shoppingapplication.beans.Items;
import org.elevenfifty.shoppingapplication.beans.Lists;
import org.elevenfifty.shoppingapplication.repository.ItemRepository;
import org.elevenfifty.shoppingapplication.repository.ListRepository;
import org.elevenfifty.shoppingapplication.repository.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class IndexController {
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private ItemRepository itemRepo;
	
	@Autowired
	private ListRepository listRepo;
	
	@Autowired
	private NoteRepository noteRepo;
	
	//HOME PAGE / WHERE IT TAKES USER INITIALLY
	
	@GetMapping(path = { "/home", " ", "/" })
	public String home(Model model) {
		model.addAttribute("lists", listRepo.findAll());
		return "home";
	}
	
	//EVERYTHING BELOW IS FOR THE LIST HTMLS!!!	
	
	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("lists", listRepo.findAll());
		return "list";
	}
	
	@GetMapping("/list/{id}")
	public String list(Model model, @PathVariable(name = "id") Integer id) {
		model.addAttribute("id", id);

		Lists u = listRepo.findOne(id);

		model.addAttribute("lists", u);
		return "list_detail";
	}
	
	@GetMapping("/list/create")
	public String listCreate(Model model) {
		model.addAttribute(new Lists());
		return "list_create";
	}

	@PostMapping("/list/create")
	public String listCreate(Model model, @ModelAttribute @Valid Lists list, BindingResult result) {
		list.setCreatedUtc(new Date(System.currentTimeMillis()));
        list.setModifiedUtc(new Date(System.currentTimeMillis()));
        listRepo.save(list);
        return "redirect:/list";
	}
	
	@GetMapping("/list/{id}/delete")
	public String listDelete(Model model, @PathVariable(name = "id") Integer id) {
		model.addAttribute("id", id);
		Lists u = listRepo.findOne(id);
		model.addAttribute("lists", u);
		return "list_delete";
	}
	
	@PostMapping("/list/{id}/delete")
	public String listDeleteSave(@PathVariable(name = "id") Integer id, @ModelAttribute @Valid Lists list,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("list", list);
			return "lists/list";
		} else {
			listRepo.delete(list);
			return "redirect:/list";
		}
	}
	
	//EVERYTHING BELOW IS FOR THE ITEM HTMLS!!
	
	@GetMapping("/item")
	public String item(Model model) {
		model.addAttribute("items", itemRepo.findAll());
		return "item";
	}
	
	@GetMapping("/item/{id}")
	public String item(Model model, @PathVariable(name = "id") Integer id) {
		model.addAttribute("id", id);

		Items u = itemRepo.findOne(id);

		model.addAttribute("items", u);
		return "item_detail";
	}
	
	@GetMapping("/item/create")
	public String itemCreate(Model model) {
		model.addAttribute(new Items());
		return "item_create";
	}

	@PostMapping("/item/create")
	public String itemCreate(@ModelAttribute @Valid Items item, BindingResult result, Model model) {
		
		item.setCreatedUtc(new Date(System.currentTimeMillis()));
        item.setModifiedUtc(new Date(System.currentTimeMillis()));
        itemRepo.save(item);
        return "redirect:/item";

	}
	
	@GetMapping("/item/{id}/delete")
	public String itemDelete(Model model, @PathVariable(name = "id") Integer id) {
		model.addAttribute("id", id);
		Items u = itemRepo.findOne(id);
		model.addAttribute("items", u);
		return "item_delete";
	}
	
	@PostMapping("/item/{id}/delete")
	public String itemDeleteSave(@PathVariable(name = "id") Integer id, @ModelAttribute @Valid Items item,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("item", item);
			return "items/item";
		} else {
			itemRepo.delete(item);
			return "redirect:/item";
		}
	}
	
	
//	----delete all items-----
	
	
	@GetMapping("/item/deleteall")
	//cannot have @PathVariable(name = "id") Integer id or it will give error saying "missing URI template" for id
	//in line below
	//THIS HAS ALL THE ITEMS SHOWING IN A LIST!!! 
	public String itemDeleteAll(Model model) {
		model.addAttribute("id");
		Iterable<Items> u = itemRepo.findAll();
		model.addAttribute("items", u);
		return "delete_all_items";
	}
	
	@PostMapping("/item/deleteall")
	public String itemDeleteAllSave(@ModelAttribute @Valid Items item, BindingResult result, Model model) {
		if (result.hasErrors()) {
			model.addAttribute("item", item);
			return "item";
		} else {
			itemRepo.deleteAll();
			return "redirect:/item";
		}
	}
	
	//---------TRYING TO MAKE CHECKBOXES WORK ---------
	
	
	
	
	
	
}




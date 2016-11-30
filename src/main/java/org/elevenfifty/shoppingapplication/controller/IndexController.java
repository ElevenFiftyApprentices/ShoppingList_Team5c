package org.elevenfifty.shoppingapplication.controller;

import org.elevenfifty.shoppingapplication.repository.ItemRepository;
import org.elevenfifty.shoppingapplication.repository.ListRepository;
import org.elevenfifty.shoppingapplication.repository.NoteRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class IndexController {
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);

	@Autowired
	private ItemRepository itemRepo;
	
	@Autowired
	private ListRepository listRepo;
	
	@Autowired
	private NoteRepository noteRepo;
	
	
	
	
	
}

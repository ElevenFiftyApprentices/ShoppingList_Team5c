insert into shopping_application.lists (user_id, name, color, created_utc, modified_utc) values (1, 'Groceries', 'Black', '12/13/2015', '11/13/2014');

insert into shopping_application.items (shopping_list_id, content, priority, is_checked, created_utc, modified_utc) values (1, 'Food', 1, FALSE, '12/13/2015', '11/13/2014');

insert into shopping_application.notes (shopping_list_item_id, body, created_utc, modified_utc) values (1, 'These foods are really good for you', '12/13/2015', '11/13/2014');

insert into shopping_application.lists (user_id, name, color, created_utc, modified_utc) values (1, 'Grocery List', 'Black', '12/13/2015', '11/13/2014');
insert into shopping_application.lists (user_id, name, color, created_utc, modified_utc) values (2, 'Christmas List', 'Blue', '02/16/2014', '10/11/2016');
insert into shopping_application.lists (user_id, name, color, created_utc, modified_utc) values (3, 'To Do List', 'Red', '06/13/1998', '05/16/1999');
insert into shopping_application.lists (user_id, name, color, created_utc, modified_utc) values (4, 'Wish List', 'Purple', '07/14/2002', '11/19/2007');
insert into shopping_application.lists (user_id, name, color, created_utc, modified_utc) values (5, 'Car List', 'Green', '09/21/2009', '10/17/2010');
insert into shopping_application.lists (user_id, name, color, created_utc, modified_utc) values (6, 'Business List', 'Yellow', '03/09/2014', '01/19/2015');

insert into shopping_application.items (shopping_list_id, contents, priority, is_checked, created_utc, modified_utc) values (1, 'Food', 1, FALSE, '12/13/2015', '11/13/2014');
insert into shopping_application.items (shopping_list_id, contents, priority, is_checked, created_utc, modified_utc) values (2, 'Friends', 2, FALSE, '02/16/2014', '10/11/2016');
insert into shopping_application.items (shopping_list_id, contents, priority, is_checked, created_utc, modified_utc) values (3, 'Colors', 3, FALSE, '06/13/1998', '05/16/1999');
insert into shopping_application.items (shopping_list_id, contents, priority, is_checked, created_utc, modified_utc) values (4, 'Sports', 5, FALSE, '09/21/2009', '10/17/2010');
insert into shopping_application.items (shopping_list_id, contents, priority, is_checked, created_utc, modified_utc) values (5, 'Cars', 4, FALSE, '03/09/2014', '01/19/2015');
insert into shopping_application.items (shopping_list_id, contents, priority, is_checked, created_utc, modified_utc) values (6, 'States', 6, FALSE, '11/27/2003', '03/13/2004');


insert into shopping_application.notes (shopping_list_item_id, body, created_utc, modified_utc) values (1, 'These foods are really good for you', '12/13/2015', '11/13/2014');

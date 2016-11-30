CREATE SCHEMA IF NOT EXISTS shopping_application;
USE shopping_application ;

CREATE TABLE IF NOT EXISTS shoppping_application.lists (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  user_id INT(30) NOT NULL,
  name VARCHAR(50) NOT NULL,
  color VARCHAR(45) NOT NULL,
  created_utc VARCHAR(80) NOT NULL,
  modified_utc VARCHAR(80) NOT NULL,
  PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS shoppping_application.items (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  shopping_list_id INT(30) NOT NULL,
  content VARCHAR(200) NOT NULL,
  priority INT(45) NOT NULL,
  is_checked BOOLEAN(10) NOT NULL,
  created_utc VARCHAR(80) NOT NULL,
  modified_utc VARCHAR(80) NOT NULL,
  PRIMARY KEY (id));
  
CREATE TABLE IF NOT EXISTS shoppping_application.notes (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  shopping_list_item_id INT(30) NOT NULL,
  body VARCHAR(200) NOT NULL,
  created_utc VARCHAR(80) NOT NULL,
  modified_utc VARCHAR(80) NOT NULL,
  PRIMARY KEY (id));
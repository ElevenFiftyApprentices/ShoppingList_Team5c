USE heroku_df4c7db4409cdfa;

CREATE TABLE IF NOT EXISTS heroku_df4c7db4409cdfa.lists (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  color VARCHAR(45) NOT NULL,
  created_utc TIMESTAMP NOT NULL,
  modified_utc TIMESTAMP NOT NULL,
  PRIMARY KEY (id));

CREATE TABLE IF NOT EXISTS heroku_df4c7db4409cdfa.items (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  shopping_list_id INT(30) NOT NULL,
  contents VARCHAR(200) NOT NULL,
  priority INT(45) NOT NULL,
  is_checked tinyint(1) NOT NULL DEFAULT 1,
  created_utc TIMESTAMP NOT NULL,
  modified_utc TIMESTAMP NOT NULL,
  PRIMARY KEY (id));
  
CREATE TABLE IF NOT EXISTS heroku_df4c7db4409cdfa.notes (
  id INT UNSIGNED NOT NULL AUTO_INCREMENT,
  shopping_list_item_id INT NOT NULL,
  body VARCHAR(200) NOT NULL,
  created_utc TIMESTAMP NOT NULL,
  modified_utc TIMESTAMP NOT NULL,
  PRIMARY KEY (id));
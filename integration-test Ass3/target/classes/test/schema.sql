DROP TABLE IF EXISTS PRODUCT_TBL;

CREATE TABLE PRODUCT_TBL (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  quantity INT NOT NULL,
  price INT DEFAULT NULL
);
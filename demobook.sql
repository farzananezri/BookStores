##Create Table
  
CREATE TABLE `bookstore` (
  `id` bigint NOT NULL,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `price` double DEFAULT NULL,
  `publisher` varchar(255) DEFAULT NULL,
  `year` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

##Insert Data
INSERT INTO `demo`.`bookstore`
(`id`,`title`,`author`,`price`,`publisher`,`year`)
VALUES
(3,"Pelukis Jalanan","Teme Abdullah",28,"Iman Shopee","2020"),
(4, "Another Book", "Another Author", 30, "Another Publisher", "2021"),
(5, "Yet Another Book", "Yet Another Author", 25, "Yet Another Publisher", "2022");

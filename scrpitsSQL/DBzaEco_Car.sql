DROP SCHEMA IF EXISTS `eco-car`;

CREATE SCHEMA `eco-car`;

use `eco-car`;

SET foreign_key_checks = 0;

DROP TABLE IF EXISTS `location`;

CREATE TABLE `location` (
  `id`  int NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `latitude` DOUBLE DEFAULT NULL,
  `longitude` DOUBLE DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

DROP TABLE IF EXISTS `company_eco_car`;

CREATE TABLE `company_eco_car` (
  `id` int NOT NULL AUTO_INCREMENT,
  `href` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `location_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_LOCATION_idx` (`location_id`),
  CONSTRAINT `fk_location` FOREIGN KEY (`location_id`) REFERENCES `location`(`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1;

SET FOREIGN_KEY_CHECKS = 1;



CREATE TABLE `company_eco_car_test` (
  `id` varchar(255) PRIMARY KEY,
  `href` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `latitude` DOUBLE DEFAULT NULL,
  `longitude` DOUBLE DEFAULT NULL
  ) ENGINE=InnoDB AUTO_INCREMENT=1;
  
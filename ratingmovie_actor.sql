-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ratingmovie
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actor`
--

DROP TABLE IF EXISTS `actor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `actor` (
  `actorid` bigint(20) NOT NULL AUTO_INCREMENT,
  `actor_name` varchar(255) DEFAULT NULL,
  `biography` varchar(255) DEFAULT NULL,
  `createddate` datetime NOT NULL,
  `date_of_birth` varchar(255) DEFAULT NULL,
  `sex` varchar(255) DEFAULT NULL,
  `updateddate` datetime NOT NULL,
  `movie_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`actorid`),
  UNIQUE KEY `UK_dkimipfspj0wccbiscioib9pn` (`actor_name`),
  KEY `FKj1v8ubnn1t4547r4q725paa8h` (`movie_id`),
  CONSTRAINT `FKj1v8ubnn1t4547r4q725paa8h` FOREIGN KEY (`movie_id`) REFERENCES `movie` (`movieid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actor`
--

LOCK TABLES `actor` WRITE;
/*!40000 ALTER TABLE `actor` DISABLE KEYS */;
INSERT INTO `actor` VALUES (2,'muki','brother','2019-08-16 17:05:20','29/10/1994','MALE','2019-08-16 17:05:20',NULL),(3,'Oliver','Cutest  person and great actor','2019-08-16 17:35:33','1/3/56','Male','2019-08-16 17:35:33',NULL),(5,'Olive','Cutest  person and great actor','2019-08-16 17:44:36','3/5/96','FeMale','2019-08-16 17:44:36',2);
/*!40000 ALTER TABLE `actor` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-18 22:31:40

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
-- Table structure for table `movie`
--

DROP TABLE IF EXISTS `movie`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `movie` (
  `movieid` bigint(20) NOT NULL AUTO_INCREMENT,
  `createddate` datetime NOT NULL,
  `movie_name` varchar(255) DEFAULT NULL,
  `plot` varchar(255) DEFAULT NULL,
  `updateddate` datetime NOT NULL,
  `year_of_release` varchar(255) DEFAULT NULL,
  `actor_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`movieid`),
  UNIQUE KEY `UK_en7tlqhxtmelp1tnh0nh00k7m` (`movie_name`),
  KEY `FKqm7uqiqr4wipni1thpeemawuv` (`actor_id`),
  CONSTRAINT `FKqm7uqiqr4wipni1thpeemawuv` FOREIGN KEY (`actor_id`) REFERENCES `actor` (`actorid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `movie`
--

LOCK TABLES `movie` WRITE;
/*!40000 ALTER TABLE `movie` DISABLE KEYS */;
INSERT INTO `movie` VALUES (2,'2019-08-16 17:07:27','Arrow','Legendary Hero Oliver Queen','2019-08-16 17:07:27','2013',NULL),(3,'2019-08-16 18:02:04','Flash','Super Series','2019-08-16 18:02:04','2015',NULL),(4,'2019-08-16 18:05:56','The 100','Thriller,Drama Series','2019-08-16 18:05:56','2015',2),(5,'2019-08-16 18:08:57','Prison Break','Crime,Drama,Thriller Series','2019-08-16 18:08:57','2006',2),(6,'2019-08-17 01:28:09','Baasha','superstar movie','2019-08-17 01:28:09','1995',5),(7,'2019-08-18 00:00:09','we','ours is strength','2019-08-18 00:00:09','2019',3);
/*!40000 ALTER TABLE `movie` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-08-18 22:31:39

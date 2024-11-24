-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: project
-- ------------------------------------------------------
-- Server version	8.0.39

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `selected_devices`
--

DROP TABLE IF EXISTS `selected_devices`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `selected_devices` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `device_name` varchar(255) NOT NULL,
  `amount` decimal(38,2) DEFAULT NULL,
  `avenue` int NOT NULL,
  `devices` varbinary(255) DEFAULT NULL,
  `number_of_equipments` int NOT NULL,
  `smart_charging_station` int NOT NULL,
  `total_investment` int NOT NULL,
  `year` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `selected_devices`
--

LOCK TABLES `selected_devices` WRITE;
/*!40000 ALTER TABLE `selected_devices` DISABLE KEYS */;
INSERT INTO `selected_devices` VALUES (1,'Smart meters',1000.00,0,NULL,0,0,0,0),(2,'Energy Storage Systems (Batteries)',13000.00,0,NULL,0,0,0,0),(3,'Smart Load Management Systems',3500.00,0,NULL,0,0,0,0),(4,'Smart Grids and Vehicle-to-Grid (V2G) Technology',10000.00,0,NULL,0,0,0,0),(5,'Solar Panels with Smart Integration',20000.00,0,NULL,0,0,0,0),(6,'Smart Payment and Billing Systems',3000.00,0,NULL,0,0,0,0),(7,'Smart Parking Sensors',400.00,0,NULL,0,0,0,0),(8,'Real-Time Monitoring and Diagnostic Tools',4000.00,0,NULL,0,0,0,0),(9,'User Identification Systems',1500.00,0,NULL,0,0,0,0),(10,'Smart Charging Cables',300.00,0,NULL,0,0,0,0),(11,'Smart HVAC Systems for Charging Stations',15000.00,0,NULL,0,0,0,0);
/*!40000 ALTER TABLE `selected_devices` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-24 15:50:51

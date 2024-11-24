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
-- Table structure for table `features`
--

DROP TABLE IF EXISTS `features`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `features` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `amount` decimal(38,2) DEFAULT NULL,
  `ar_navigation` varchar(255) DEFAULT NULL,
  `distance_per_vehicle` int NOT NULL,
  `driver_wages` decimal(38,2) DEFAULT NULL,
  `electric_vehicles` int NOT NULL,
  `electricity_cost` decimal(38,2) DEFAULT NULL,
  `energy_management` varchar(255) DEFAULT NULL,
  `entertainment` varchar(255) DEFAULT NULL,
  `fuel_cost` decimal(38,2) DEFAULT NULL,
  `fuel_vehicles` int NOT NULL,
  `insurance_cost` decimal(38,2) DEFAULT NULL,
  `safety_driver_assist` varchar(255) DEFAULT NULL,
  `security` varchar(255) DEFAULT NULL,
  `total_investment` decimal(38,2) DEFAULT NULL,
  `vehicle_health` varchar(255) DEFAULT NULL,
  `year` int NOT NULL,
  `total_avenue` decimal(38,2) DEFAULT NULL,
  `avenue` decimal(38,2) DEFAULT NULL,
  `device_name` varchar(255) DEFAULT NULL,
  `devices` int NOT NULL,
  `number_of_equipments` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `features`
--

LOCK TABLES `features` WRITE;
/*!40000 ALTER TABLE `features` DISABLE KEYS */;
INSERT INTO `features` VALUES (1,'Safety and Driver Assistance','adas',15000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(2,'Safety and Driver Assistance','collisionAvoidance',5000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(3,'Safety and Driver Assistance','cameraSystem',4000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(4,'Vehicle Health Monitoring','predictiveMaintenance',3000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(5,'Vehicle Health Monitoring','smartDiagnostics',2000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(6,'Smart Energy Management','regenerativeBraking',3500.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(7,'Smart Energy Management','smartBattery',4500.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(8,'Augmented Reality Navigation','arOverlay',2500.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(9,'Augmented Reality Navigation','realTimeTraffic',1000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(10,'Enhanced Entertainment Systems','streaming',1500.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(11,'Enhanced Entertainment Systems','gaming',2500.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(12,'Security and Anti-Theft Devices','smartLocks',1000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(13,'Security and Anti-Theft Devices','gpsTracking',1200.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0),(14,'Advanced Climate Control','Advanced Climate Control with Air Quality Sensors',3000.00,NULL,0,NULL,0,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,NULL,NULL,0,NULL,NULL,NULL,0,0);
/*!40000 ALTER TABLE `features` ENABLE KEYS */;
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

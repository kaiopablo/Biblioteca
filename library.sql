-- MySQL dump 10.13  Distrib 5.7.12, for osx10.9 (x86_64)
--
-- Host: 127.0.0.1    Database: library
-- ------------------------------------------------------
-- Server version	5.7.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Operador`
--

DROP TABLE IF EXISTS `Operador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Operador` (
  `idOperador` int(11) NOT NULL,
  `login` varchar(45) DEFAULT NULL COMMENT '	',
  `senha` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idOperador`),
  UNIQUE KEY `login_UNIQUE` (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Operador`
--

LOCK TABLES `Operador` WRITE;
/*!40000 ALTER TABLE `Operador` DISABLE KEYS */;
/*!40000 ALTER TABLE `Operador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SEQUENCE`
--

DROP TABLE IF EXISTS `SEQUENCE`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SEQUENCE` (
  `SEQ_NAME` varchar(50) NOT NULL,
  `SEQ_COUNT` decimal(38,0) DEFAULT NULL,
  PRIMARY KEY (`SEQ_NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SEQUENCE`
--

LOCK TABLES `SEQUENCE` WRITE;
/*!40000 ALTER TABLE `SEQUENCE` DISABLE KEYS */;
INSERT INTO `SEQUENCE` VALUES ('SEQ_GEN',350);
/*!40000 ALTER TABLE `SEQUENCE` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `associado`
--

DROP TABLE IF EXISTS `associado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `associado` (
  `id_associado` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_associado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `associado`
--

LOCK TABLES `associado` WRITE;
/*!40000 ALTER TABLE `associado` DISABLE KEYS */;
INSERT INTO `associado` VALUES (51,'Vinicius Custodio','42 32380000','vinihcius.custodio@hotmail.com','Rua Pedro Beninca 164'),(206,'Associado 1','1234','associado@google.com','Rua Associado 163');
/*!40000 ALTER TABLE `associado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autor`
--

DROP TABLE IF EXISTS `autor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autor` (
  `id_autor` int(11) NOT NULL,
  `nome` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_autor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autor`
--

LOCK TABLES `autor` WRITE;
/*!40000 ALTER TABLE `autor` DISABLE KEYS */;
INSERT INTO `autor` VALUES (53,'Jose'),(54,'Pedro'),(55,'Paulo');
/*!40000 ALTER TABLE `autor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `autoria`
--

DROP TABLE IF EXISTS `autoria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `autoria` (
  `id_autoria` int(11) NOT NULL,
  `livro_id_livro` int(11) NOT NULL,
  `autor_id_autor` int(11) NOT NULL,
  PRIMARY KEY (`id_autoria`),
  KEY `fk_autor_livro_idx` (`livro_id_livro`),
  KEY `fk_autor_pessoa1_idx` (`autor_id_autor`),
  CONSTRAINT `fk_autor_livro` FOREIGN KEY (`livro_id_livro`) REFERENCES `livro` (`id_livro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_autor_pessoa1` FOREIGN KEY (`autor_id_autor`) REFERENCES `autor` (`id_autor`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autoria`
--

LOCK TABLES `autoria` WRITE;
/*!40000 ALTER TABLE `autoria` DISABLE KEYS */;
INSERT INTO `autoria` VALUES (158,155,54),(160,155,53),(161,155,55),(162,154,53),(163,154,54),(164,154,55),(204,203,53),(304,302,55);
/*!40000 ALTER TABLE `autoria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emprestimo`
--

DROP TABLE IF EXISTS `emprestimo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emprestimo` (
  `id_emprestimo` int(11) NOT NULL,
  `data` datetime DEFAULT NULL,
  `previsao` datetime DEFAULT NULL,
  `devolucao` datetime DEFAULT NULL,
  `livro_id_livro` int(11) NOT NULL,
  `associado_id_associado` int(11) NOT NULL,
  PRIMARY KEY (`id_emprestimo`),
  KEY `fk_emprestimo_livro1_idx` (`livro_id_livro`),
  KEY `fk_emprestimo_associado1_idx` (`associado_id_associado`),
  CONSTRAINT `fk_emprestimo_associado1` FOREIGN KEY (`associado_id_associado`) REFERENCES `associado` (`id_associado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_emprestimo_livro1` FOREIGN KEY (`livro_id_livro`) REFERENCES `livro` (`id_livro`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emprestimo`
--

LOCK TABLES `emprestimo` WRITE;
/*!40000 ALTER TABLE `emprestimo` DISABLE KEYS */;
INSERT INTO `emprestimo` VALUES (101,'2016-10-18 00:00:00','2016-10-28 00:00:00','2016-10-18 00:00:00',2,51),(156,'2016-10-18 00:00:00','2016-10-28 00:00:00','2016-10-18 00:00:00',154,51),(157,'2016-10-18 00:00:00','2016-10-28 00:00:00','2016-10-18 00:00:00',152,51),(205,'2016-10-18 00:00:00','2016-10-28 00:00:00','2016-10-18 00:00:00',203,51),(207,'2016-10-11 00:00:00','2016-10-17 00:00:00','2016-10-18 00:00:00',155,206),(251,'2016-10-18 00:00:00','2016-10-28 00:00:00',NULL,2,51),(252,'2016-10-18 00:00:00','2016-10-28 00:00:00','2016-10-18 00:00:00',203,206),(253,'2016-10-18 00:00:00','2016-10-28 00:00:00','2016-11-01 00:00:00',203,206),(305,'2016-11-01 00:00:00','2016-11-11 00:00:00','2016-11-01 00:00:00',302,206);
/*!40000 ALTER TABLE `emprestimo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `livro`
--

DROP TABLE IF EXISTS `livro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `livro` (
  `id_livro` int(11) NOT NULL,
  `isbn` varchar(45) DEFAULT NULL,
  `editora` varchar(45) DEFAULT NULL,
  `localEdicao` varchar(45) DEFAULT NULL,
  `numeroExemplares` int(11) DEFAULT NULL,
  `titulo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_livro`),
  UNIQUE KEY `isbn_UNIQUE` (`isbn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `livro`
--

LOCK TABLES `livro` WRITE;
/*!40000 ALTER TABLE `livro` DISABLE KEYS */;
INSERT INTO `livro` VALUES (2,'12345','Editora Um','Brasil',10,'Livro Livro'),(152,'99889','Editora Dois','Alemanha',23,'Livro 2'),(154,'34434','Editora Tres','Canada',10,'Livro Livro Livro'),(155,'51234','Editora Quatro','Cuba',10,'4 Livro'),(203,'19987','Editora Cinco','Brasil',1,'Titulo 1'),(302,'89898','Livro Livro','Ponta Grossa',10,'Livro 9');
/*!40000 ALTER TABLE `livro` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-02  9:00:37

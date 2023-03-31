-- Create dataBase sqltestdb and use it
--

CREATE DATABASE IF NOT EXISTS `sql_test_db`;

USE `sql_test_db`;

--
-- Table structure for table `lesson`
--

DROP TABLE IF EXISTS `lesson`;

CREATE TABLE `lesson` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `label` varchar(255) DEFAULT NULL,
  `student_count` int(11) DEFAULT NULL,
  `date` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ;

--
--  data for table `lesson`
--

INSERT INTO `lesson` VALUES
(1,'arrays',5,'21/11/2019'),
(2,'loops',7,'23/11/2019'),
(3,'objects',10,'27/12/2019'),
(4,'html',11,'01/10/2019'),
(5,'mysql',4,'10/12/2019'),
(6,'closures',6,'11/11/2019'),
(7,'oop',5,'15/12/2019'),
(8,'function',6,'07/11/2019'),
(9,'recursion',4,'15/12/2019'),
(10,'callback',3,'06/10/2019');



--
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;

CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
/*
SQLyog Ultimate v8.82 
MySQL - 5.1.45-community : Database - examination
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`examination` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `examination`;

/*Table structure for table `question` */

DROP TABLE IF EXISTS `question`;

CREATE TABLE `question` (
  `QuesNo.` decimal(5,0) NOT NULL,
  `Question` varchar(70) DEFAULT NULL,
  `Topic` varchar(70) DEFAULT NULL,
  `option1` varchar(70) DEFAULT NULL,
  `option2` varchar(70) DEFAULT NULL,
  `option3` varchar(70) DEFAULT NULL,
  `option4` varchar(70) DEFAULT NULL,
  PRIMARY KEY (`QuesNo.`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `question` */

/*Table structure for table `signinvalues` */

DROP TABLE IF EXISTS `signinvalues`;

CREATE TABLE `signinvalues` (
  `UserName` varchar(40) NOT NULL,
  `Password` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`UserName`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `signinvalues` */

insert  into `signinvalues`(`UserName`,`Password`) values ('Vikas','12345');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

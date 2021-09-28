/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : order

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 28/09/2021 20:50:22
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `money` decimal(11,2) DEFAULT NULL,
  `userid` int DEFAULT NULL,
  `address` varchar(255) DEFAULT NULL,
  `createTime` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

SET FOREIGN_KEY_CHECKS = 1;

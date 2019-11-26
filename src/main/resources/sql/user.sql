/*
 Navicat Premium Data Transfer

 Source Server         : zsl
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : 119.23.229.151:3306
 Source Schema         : spring

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 26/11/2019 08:54:05
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for enjoy_user
-- ----------------------------
DROP TABLE IF EXISTS `enjoy_user`;
CREATE TABLE `enjoy_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `passwd` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of enjoy_user
-- ----------------------------
INSERT INTO `enjoy_user` VALUES (1, 'zsl', '123');

SET FOREIGN_KEY_CHECKS = 1;

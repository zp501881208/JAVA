/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50714
Source Host           : 127.0.0.1:3306
Source Database       : magic

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-05-11 20:10:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL AUTO_INCREMENT,
  `admin_name` varchar(50) NOT NULL COMMENT '管理员名称',
  `login_name` varchar(50) NOT NULL COMMENT '登录名',
  `login_password` varchar(255) NOT NULL COMMENT '登录密码',
  `admin_status` int(1) NOT NULL DEFAULT '1' COMMENT '状态:0不可用1可用......',
  `admin_trunk` int(1) NOT NULL DEFAULT '1' COMMENT '分支(预留)',
  PRIMARY KEY (`admin_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='管理员表';

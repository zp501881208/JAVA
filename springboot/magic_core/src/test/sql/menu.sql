/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50714
Source Host           : 127.0.0.1:3306
Source Database       : magic_dev

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-05-17 10:10:14
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` varchar(50) NOT NULL COMMENT '菜单ID/权限',
  `menu_deep` int(20) DEFAULT NULL COMMENT '菜单深度',
  `function_icon` varchar(50) DEFAULT NULL COMMENT '菜单图标',
  `function_name` varchar(10) NOT NULL COMMENT '菜单名称',
  `function_url` varchar(200) DEFAULT NULL COMMENT '菜单访问路径',
  `parent_id` varchar(50) DEFAULT NULL COMMENT '父类ID',
  `order_num` varchar(20) DEFAULT NULL COMMENT '排序号,倒序排列',
  `is_run_menu` varchar(1) DEFAULT NULL COMMENT '是否为可执行菜单',
  `is_enable` varchar(1) DEFAULT NULL COMMENT '是否可使用1-正常 0-关闭',
  `menu_desc` varchar(200) DEFAULT NULL COMMENT '说明',
  PRIMARY KEY (`menu_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='菜单表';

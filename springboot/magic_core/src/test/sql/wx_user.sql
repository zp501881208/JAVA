/*
Navicat MySQL Data Transfer

Source Server         : 127.0.0.1
Source Server Version : 50714
Source Host           : 127.0.0.1:3306
Source Database       : magic_dev

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-05-17 10:10:20
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for wx_user
-- ----------------------------
DROP TABLE IF EXISTS `wx_user`;
CREATE TABLE `wx_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `openid` varchar(50) NOT NULL COMMENT 'openid',
  `nickname` varchar(255) DEFAULT NULL COMMENT '昵称',
  `sex` int(1) DEFAULT NULL COMMENT '性别1男2女0未知',
  `language` varchar(50) DEFAULT NULL COMMENT '语言，简体中文为zh_CN',
  `province` varchar(50) DEFAULT NULL COMMENT '用户所在省份',
  `city` varchar(50) DEFAULT NULL COMMENT '用户所在城市',
  `country` varchar(50) DEFAULT NULL COMMENT '用户所在国家',
  `headimgurl` varchar(500) DEFAULT NULL COMMENT '用户头像',
  `unionid` varchar(50) DEFAULT NULL COMMENT '只有在用户将公众号绑定到微信开放平台帐号后，才会出现该字段',
  `subscribe_time` varchar(50) DEFAULT NULL COMMENT '用户关注时间，为时间戳。如果用户曾多次关注，则取最后关注时间',
  `remark` varchar(50) DEFAULT NULL COMMENT '公众号运营者对粉丝的备注，公众号运营者可在微信公众平台用户管理界面对粉丝添加备注',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实姓名',
  `tel` varchar(20) DEFAULT NULL COMMENT '手机号',
  `user_type` int(2) NOT NULL DEFAULT '1' COMMENT '用户类型',
  `create_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='微信用户表';

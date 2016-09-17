/*
 Navicat MySQL Data Transfer

 Source Server         : 148
 Source Server Version : 50545
 Source Host           : 121.43.101.148
 Source Database       : csw_std_base

 Target Server Version : 50545
 File Encoding         : utf-8

 Date: 09/17/2016 15:07:43 PM
*/

SET NAMES utf8;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `tsys_config`
-- ----------------------------
DROP TABLE IF EXISTS `tsys_config`;
CREATE TABLE `tsys_config` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `to_system` varchar(4) DEFAULT NULL COMMENT '针对系统',
  `ckey` varchar(32) DEFAULT NULL COMMENT 'key值',
  `cvalue` varchar(255) DEFAULT NULL COMMENT '值',
  `note` varchar(255) DEFAULT NULL COMMENT '配置说明',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tsys_dict`
-- ----------------------------
DROP TABLE IF EXISTS `tsys_dict`;
CREATE TABLE `tsys_dict` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '编号（自增长）',
  `to_system` varchar(4) DEFAULT NULL COMMENT '针对系统',
  `type` char(1) DEFAULT NULL COMMENT '类型（第一层/第二层）',
  `parent_key` varchar(32) DEFAULT NULL COMMENT '父key',
  `dkey` varchar(32) DEFAULT NULL COMMENT 'key',
  `dvalue` varchar(255) DEFAULT NULL COMMENT '值',
  `updater` varchar(32) DEFAULT NULL COMMENT '更新人',
  `update_datetime` datetime DEFAULT NULL COMMENT '更新时间',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `tsys_log`
-- ----------------------------
DROP TABLE IF EXISTS `tsys_log`;
CREATE TABLE `tsys_log` (
  `code` varchar(32) NOT NULL COMMENT '编号',
  `to_system` varchar(4) DEFAULT NULL COMMENT '针对系统',
  `to_table` varchar(32) DEFAULT NULL COMMENT '针对表',
  `to_row` varchar(32) DEFAULT NULL COMMENT '针对记录',
  `to_column` varchar(255) DEFAULT NULL COMMENT '针对字段',
  `operate_type` varchar(4) DEFAULT NULL COMMENT '操作类型',
  `pre_value` varchar(255) DEFAULT NULL COMMENT '变更前值',
  `post_value` varchar(255) DEFAULT NULL COMMENT '变更后值',
  `operater` varchar(32) DEFAULT NULL COMMENT '操作人',
  `operate_datetime` datetime DEFAULT NULL COMMENT '操作时间',
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;

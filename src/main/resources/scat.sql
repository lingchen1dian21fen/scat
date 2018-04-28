/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50720
Source Host           : localhost:3306
Source Database       : scat

Target Server Type    : MYSQL
Target Server Version : 50720
File Encoding         : 65001

Date: 2018-04-28 11:43:09
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tb_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_course`;
CREATE TABLE `tb_course` (
  `course_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(100) NOT NULL,
  `course_grade` varchar(20) NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime DEFAULT NULL,
  `course_state` int(11) unsigned zerofill NOT NULL,
  PRIMARY KEY (`course_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_course
-- ----------------------------

-- ----------------------------
-- Table structure for tb_dictionaries
-- ----------------------------
DROP TABLE IF EXISTS `tb_dictionaries`;
CREATE TABLE `tb_dictionaries` (
  `dic_id` int(11) NOT NULL,
  `dic_key` varchar(255) NOT NULL,
  `dic_value` varchar(255) NOT NULL,
  `dic_type` varchar(255) NOT NULL,
  `dic_remark` varchar(255) DEFAULT NULL,
  `dic_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`dic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_dictionaries
-- ----------------------------
INSERT INTO `tb_dictionaries` VALUES ('1', '一年级', '1', '一年级', 'grade', '用于记录年级及约定的数值');
INSERT INTO `tb_dictionaries` VALUES ('2', '二年级', '2', '二年级', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('3', '三年级', '3', '三年级', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('4', '四年级', '4', '四年级', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('5', '五年级', '5', '五年级', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('6', '六年级', '6', '六年级', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('7', '初一', '7', '初一', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('8', '初二', '8', '初二', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('9', '初三', '9', '初三', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('10', '高一', '10', '高一', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('11', '高二', '11', '高二', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('12', '高三', '12', '高三', 'grade', '');
INSERT INTO `tb_dictionaries` VALUES ('13', '数学', '1', '数学', 'course', '用于记录已开设课程');
INSERT INTO `tb_dictionaries` VALUES ('14', '物理', '2', '物理', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('15', '化学', '3', '化学', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('16', '生物', '4', '生物', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('17', '英语', '5', '英语', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('18', '语文', '6', '语文', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('19', '政治', '7', '政治', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('20', '历史', '8', '历史', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('21', '地理', '9', '地理', 'course', '');
INSERT INTO `tb_dictionaries` VALUES ('22', '自习', '10', '自习', 'course', '');

-- ----------------------------
-- Table structure for tb_sign
-- ----------------------------
DROP TABLE IF EXISTS `tb_sign`;
CREATE TABLE `tb_sign` (
  `sign_id` int(11) NOT NULL AUTO_INCREMENT,
  `course_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `user_name` varchar(100) DEFAULT NULL,
  `user_type` int(11) NOT NULL,
  `user_no` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sign_id`),
  KEY `course_sign_fk` (`course_id`),
  CONSTRAINT `course_sign_fk` FOREIGN KEY (`course_id`) REFERENCES `tb_course` (`course_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_sign
-- ----------------------------

-- ----------------------------
-- Table structure for tb_student
-- ----------------------------
DROP TABLE IF EXISTS `tb_student`;
CREATE TABLE `tb_student` (
  `stu_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_no` varchar(255) NOT NULL,
  `stu_name` varchar(255) NOT NULL,
  `stu_sex` varchar(10) DEFAULT NULL,
  `stu_age` int(11) unsigned zerofill DEFAULT NULL,
  `stu_phone` varchar(100) DEFAULT NULL,
  `register_time` datetime NOT NULL,
  `stu_grade` int(11) unsigned zerofill NOT NULL,
  `stu_address` varchar(255) DEFAULT NULL,
  `stu_remark` varchar(400) DEFAULT NULL,
  `stu_school` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`stu_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_student
-- ----------------------------
INSERT INTO `tb_student` VALUES ('1', 'aaa', '张三', null, '00000000000', null, '2018-04-21 17:58:55', '00000000007', null, null, null);
INSERT INTO `tb_student` VALUES ('2', 'bbb', '李四', null, '00000000000', null, '2018-04-21 18:04:20', '00000000007', null, null, null);

-- ----------------------------
-- Table structure for tb_student_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_student_course`;
CREATE TABLE `tb_student_course` (
  `stu_course_id` int(11) NOT NULL,
  `stu_id` int(11) NOT NULL,
  `course_name` varchar(255) NOT NULL,
  `total_hour` float(10,2) NOT NULL,
  `used_hour` float(10,2) NOT NULL,
  `hour_price` float(10,2) DEFAULT NULL,
  `total_cost` float(10,2) DEFAULT NULL,
  `has_cost` float(10,2) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `school_year` int(11) NOT NULL,
  PRIMARY KEY (`stu_course_id`),
  KEY `stu_course_fk` (`stu_id`) USING BTREE,
  CONSTRAINT `stu_course_fk` FOREIGN KEY (`stu_id`) REFERENCES `tb_student` (`stu_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_student_course
-- ----------------------------

-- ----------------------------
-- Table structure for tb_teacher
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher`;
CREATE TABLE `tb_teacher` (
  `tea_id` int(11) NOT NULL AUTO_INCREMENT,
  `tea_no` varchar(255) NOT NULL,
  `tea_name` varchar(255) NOT NULL,
  `tea_phone` varchar(100) DEFAULT NULL,
  `tea_sex` varchar(10) DEFAULT NULL,
  `register_time` datetime NOT NULL,
  `tea_address` varchar(255) DEFAULT NULL,
  `tea_remark` varchar(255) DEFAULT NULL,
  `tea_age` int(11) DEFAULT NULL,
  PRIMARY KEY (`tea_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_teacher
-- ----------------------------

-- ----------------------------
-- Table structure for tb_teacher_course
-- ----------------------------
DROP TABLE IF EXISTS `tb_teacher_course`;
CREATE TABLE `tb_teacher_course` (
  `tea_course_id` int(11) NOT NULL,
  `tea_id` int(11) NOT NULL,
  `course_name` varchar(255) DEFAULT NULL,
  `course_grade` varchar(20) DEFAULT NULL,
  `course_price` float(10,2) DEFAULT NULL,
  `float_price` float(10,2) DEFAULT NULL,
  PRIMARY KEY (`tea_course_id`),
  KEY `tar_course_fk` (`tea_id`),
  CONSTRAINT `tar_course_fk` FOREIGN KEY (`tea_id`) REFERENCES `tb_teacher` (`tea_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tb_teacher_course
-- ----------------------------

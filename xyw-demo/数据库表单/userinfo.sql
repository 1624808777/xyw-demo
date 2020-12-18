
SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for userinfo
-- ----------------------------
DROP TABLE IF EXISTS `userinfo`;
CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL COMMENT '时间',
  `ipaddr` varchar(255) DEFAULT NULL COMMENT 'ip地址',
  `browser` varchar(255) DEFAULT NULL COMMENT '浏览器',
  `way` varchar(255) DEFAULT NULL COMMENT '登录方式',
  `equipment` varchar(255) DEFAULT NULL COMMENT '设备',
  `uid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of userinfo
-- ----------------------------
INSERT INTO `userinfo` VALUES ('1', '2020-12-18 13:18:55', '127.0.0.1', '火狐', '扫码', '电脑', '1');

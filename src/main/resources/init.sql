-- CREATE DATABASE coderz;

USE coderz;

ALTER TABLE c_class_instructor DROP FOREIGN KEY FK_InsClass;
ALTER TABLE c_class_registration DROP FOREIGN KEY FK_RegClass;
ALTER TABLE c_class_registration DROP FOREIGN KEY FK_RegUser;
ALTER TABLE c_class_assignment DROP FOREIGN KEY FK_AssignClass;
ALTER TABLE c_class_submission DROP FOREIGN KEY FK_SubmitReg;
ALTER TABLE c_class_submission DROP FOREIGN KEY FK_SubmitAssign;

DROP TABLE IF EXISTS user;
CREATE TABLE IF NOT EXISTS `user` (
  `user_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
  `user_name` varchar(255) NOT NULL UNIQUE,
  `pass` varchar(512) NOT NULL,
  `created_ts` datetime NOT NULL DEFAULT current_timestamp()
);


DROP TABLE IF EXISTS c_class;
CREATE TABLE IF NOT EXISTS `c_class` (
  `class_id` int NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `term` varchar(25) NOT NULL COMMENT 'e.g. fall2012',
  `class_name` varchar(50) NOT NULL COMMENT 'name of class',
  `section` varchar(25) NOT NULL DEFAULT '1' COMMENT 'section number',
  `instructor` varchar(255) NOT NULL COMMENT 'instructor username',
  `lang` varchar(25) NOT NULL DEFAULT 'cpp' COMMENT 'e.g. cpp, java, c',
  `passcode` varchar(25) NOT NULL DEFAULT 'codeboard',
  `active` tinyint(1) NOT NULL DEFAULT '1',
  `created_ts` datetime NOT NULL DEFAULT current_timestamp()
);

DROP TABLE IF EXISTS c_class_instructor;
CREATE TABLE IF NOT EXISTS `c_class_instructor` (
  `id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `class_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `owner` tinyint(1) NOT NULL,
  `created_ts` datetime NOT NULL DEFAULT current_timestamp(),
  CONSTRAINT FK_InsClass FOREIGN KEY (class_id) REFERENCES c_class(class_id)
);

DROP TABLE IF EXISTS c_class_registration;
CREATE TABLE IF NOT EXISTS `c_class_registration` (
  `reg_id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `user_id` int(11) NOT NULL,
  `class_id` int(11) NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT 1,
  `created_ts` datetime NOT NULL DEFAULT current_timestamp(),
  CONSTRAINT FK_RegClass FOREIGN KEY (class_id) REFERENCES c_class(class_id),
  CONSTRAINT FK_RegUser FOREIGN KEY (user_id) REFERENCES user(user_id)
);

DROP TABLE IF EXISTS c_class_assignment;
CREATE TABLE IF NOT EXISTS `c_class_assignment` (
  `assignment_id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `class_id` int(11) NOT NULL,
  `name` varchar(512) NOT NULL,
  `active` tinyint(1) NOT NULL DEFAULT 1,
  `start` datetime,
  `end` datetime,
  `updated` datetime NOT NULL DEFAULT current_timestamp(),
  `updated_by` int,
  `created_ts` datetime NOT NULL DEFAULT current_timestamp(),
  CONSTRAINT FK_AssignClass FOREIGN KEY (class_id) REFERENCES c_class(class_id)
);

DROP TABLE IF EXISTS c_class_submission;
CREATE TABLE IF NOT EXISTS `c_class_submission` (
  `submission_id` int(11) NOT NULL AUTO_INCREMENT PRIMARY KEY ,
  `reg_id` int(11) NOT NULL,
  `assignment_id` int(11) NOT NULL,
  `status` varchar(50) NOT NULL,
  `created_ts` datetime NOT NULL DEFAULT current_timestamp(),
  CONSTRAINT FK_SubmitReg FOREIGN KEY (reg_id) REFERENCES c_class_registration(reg_id),
  CONSTRAINT FK_SubmitAssign FOREIGN KEY (assignment_id) REFERENCES c_class_assignment(assignment_id)
);

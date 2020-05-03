-- CREATE DATABASE coderz;

USE coderz;

INSERT INTO user (user_name, pass) VALUE ('user1', 'pass');
INSERT INTO user (user_name, pass) VALUE ('user2', 'pass');
INSERT INTO user (user_name, pass) VALUE ('user3', 'pass');
INSERT INTO user (user_name, pass) VALUE ('user4', 'pass');
INSERT INTO user (user_name, pass) VALUE ('user5', 'pass');

INSERT INTO c_class (term, class_name, section, instructor, lang, passcode, active) VALUES ('spring2015', 'java1', '001', 'John Jones', 'java', 'java', 1);
INSERT INTO c_class (term, class_name, section, instructor, lang, passcode, active) VALUES ('spring2015', 'java1', '002', 'John Doe', 'java', 'java', 1);
INSERT INTO c_class (term, class_name, section, instructor, lang, passcode, active) VALUES ('spring2015', 'python1', '001', 'Julia Jones', 'python', 'python', 1);

SELECT * FROM user;
SELECT * FROM c_class;

INSERT INTO c_class_instructor (class_id, user_id, owner) VALUES (1, 1, 1);
INSERT INTO c_class_instructor (class_id, user_id, owner) VALUES (2, 2, 1);
INSERT INTO c_class_instructor (class_id, user_id, owner) VALUES (3, 3, 1);

SELECT * FROM c_class_instructor;

INSERT INTO c_class_registration (reg_id, user_id, class_id, active) VALUES (1, 4, 1, 1);
INSERT INTO c_class_registration (reg_id, user_id, class_id, active) VALUES (2, 4, 2, 1);
INSERT INTO c_class_registration (reg_id, user_id, class_id, active) VALUES (3, 4, 3, 1);
INSERT INTO c_class_registration (reg_id, user_id, class_id, active) VALUES (4, 5, 1, 1);
INSERT INTO c_class_registration (reg_id, user_id, class_id, active) VALUES (5, 5, 2, 1);
INSERT INTO c_class_registration (reg_id, user_id, class_id, active) VALUES (6, 5, 3, 1);

SELECT * FROM c_class_registration;

INSERT INTO c_class_assignment (class_id, name, active) VALUES (1, 'Assignment 1', 1);
INSERT INTO c_class_assignment (class_id, name, active) VALUES (1, 'Assignment 2', 1);
INSERT INTO c_class_assignment (class_id, name, active) VALUES (2, 'Assignment 1', 1);
INSERT INTO c_class_assignment (class_id, name, active) VALUES (2, 'Assignment 2', 1);
INSERT INTO c_class_assignment (class_id, name, active) VALUES (3, 'Assignment 1', 1);
INSERT INTO c_class_assignment (class_id, name, active) VALUES (3, 'Assignment 2', 1);

SELECT * FROM c_class_assignment;

INSERT INTO c_class_submission (reg_id, assignment_id, status) VALUES (1, 1, 'STARTED');
INSERT INTO c_class_submission (reg_id, assignment_id, status) VALUES (1, 2, 'DONE');
INSERT INTO c_class_submission (reg_id, assignment_id, status) VALUES (4, 1, 'DONE');

SELECT * FROM c_class_submission;
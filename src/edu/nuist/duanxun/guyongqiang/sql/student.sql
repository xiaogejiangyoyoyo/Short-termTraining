drop table if EXISTS students;
CREATE TABLE students(
id int PRIMARY KEY auto_increment,
account VARCHAR (32),
name VARCHAR (32),
password VARCHAR (32),
study_number VARCHAR (32),
gender boolean,
phone varchar(16),
email VARCHAR (32),
birthday DATE,
interest VARCHAR (32),
birth_place VARCHAR (2),
introduction text
)engine=innodb,charset=utf8;

INSERT into students VALUES (1,'zhangsan','zhangsan','123','NO-01',TRUE ,'123456','1234@qq.com','1994-1-1','sing,dance','11','I am good!');
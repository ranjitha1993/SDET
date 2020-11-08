create database Sdet4_ranjitha;

CREATE TABLE salesman (
    salesman_id int primary key,
    sname varchar(32),
    city varchar(32),
    commission int
);
INSERT INTO salesman VALUES(5001, 'James Hoog', 'New York', 15);
INSERT INTO salesman VALUES
    (5002, 'Nail Knite', 'Paris', 13),
    (5005, 'Pit Alex', 'London', 11), 
    (5006, 'McLyon', 'Paris', 14), 
    (5007, 'Paul Adam', 'Rome', 13),
    (5003, 'Lauson Hen', 'San Jose', 12);
SELECT * FROM salesman WHERE city='Paris';
SELECT salesman_id, city FROM salesman;
SELECT salesman_id, commission FROM salesman WHERE sname='Paul Adam';
ALTER TABLE salesman ADD grade int;
UPDATE salesman SET grade=100;
SELECT * FROM salesman;
UPDATE salesman SET grade=200 WHERE city='Rome';
UPDATE salesman SET grade=300 WHERE sname='James Hoog';
UPDATE salesman SET sname='Pierre' WHERE sname='McLyon';


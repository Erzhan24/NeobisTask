CREATE DATABASE week4;
USE week4;

CREATE TABLE CarStore(
    id int AUTO_INCREMENT PRIMARY KEY,
    car_id int,
    customer_id int,
    saleDate date
    );

CREATE TABLE Cars(
    id int AUTO_INCREMENT PRIMARY KEY,
    mark varchar(55),
    model varchar(55),
    yearOfDate date,
    capasity float,
    color varchar(55),
    price float
);

CREATE TABLE Customers(
    id int AUTO_INCREMENT PRIMARY KEY,
    email varchar(55),
    name varchar(255),
    number int(10),
    address varchar(255)
);

ALTER TABLE carstore
ADD CONSTRAINT FK_car_id
FOREIGN KEY (car_id) REFERENCES Cars(id);

ALTER TABLE carstore
ADD CONSTRAINT FK_customer_id
FOREIGN KEY (customer_id) REFERENCES customers(id);

INSERT INTO cars
VALUES(1, "MB", "210", "2000-01-01", 2.2, "blue", 3456.1),
	  (2, "Toyota", "fourunner", "2004-01-01", 2.6, "black", 25000.9),
      (3, "Honda", "civic", "2003-01-01", 1.6, "grey", 4000.5),
      (4, "Nissan", "gtr", "2018-01-01", 5.0, "white", 50000.4),
      (5, "Porshe", "911", "2020-01-01", 3.5, "black", 9000.7);

INSERT INTO carstore
VALUES(1, 1, 1, "2019-02-01"),
      (2, 2, 1, "2018-02-01"),
      (3, 3, 2, "2017-02-01"),
      (4, 4, 3, "2018-02-01"),
      (5, 5, 4, "2012-02-01");

INSERT INTO customers
VALUES(1, "yabar@gmail.com", "Farhad", 0990909090, "Abaya 32"),
	  (2, "sydykov@gmail.com", "Kantemir", 0990909000, "Abaya 65"),
      (3, "ibragimov@gmail.com", "Maksat", 0772909090, "Abaya 76"),
      (4, "batiev@gmail.com", "Nurik", 0772909059, "Abaya 56"),
      (5, "nazarov@gmail.com", "Ibragim", 0888909090, "Abaya 67");


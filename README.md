CREATE DATABASE ExampleDB;

CREATE TABLE User (
     id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
     nombre VARCHAR(50),
     apellido VARCHAR(50),
     email VARCHAR(50),
     password BINARY(50),
   );
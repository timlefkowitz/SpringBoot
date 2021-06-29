CREATE DATABASE IF NOT EXISTS springboot_db;

CREATE USER Springboot_user@localhost IDENTIFIED BY 'codeup';
GRANT ALL ON springboot_db.* TO Springboot_user@localhost;
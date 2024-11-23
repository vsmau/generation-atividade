CREATE DATABASE db_rh;

USE db_rh;

SET SQL_SAFE_UPDATES = 0;

CREATE TABLE tb_pessoas (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
nome VARCHAR(100),
cargo VARCHAR(100),
salario DECIMAL(10,2) NOT NULL,
idade INT);

INSERT INTO tb_pessoas (nome, cargo, salario, idade)
VALUES 	("Vinicius", "Estagiário", 2000.00, 25),
		("Pedro", "Dev Junior", 4000.00, 22),
		("Julia", "Dev Pleno", 7000.00, 25),
		("Aline", "Dev Senior", 10000.00, 25),
		("Vivian", "Tech Lead", 13000.00, 24),
		("Naiara", "Manager", 13000.00, 29);

SELECT * FROM tb_pessoas WHERE salario > 2000;


SELECT * FROM tb_pessoas WHERE salario < 2000;

UPDATE tb_pessoas SET salario = 15000 WHERE cargo = "Manager";

SELECT * FROM tb_pessoas;
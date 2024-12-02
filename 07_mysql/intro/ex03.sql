CREATE DATABASE db_escola;

USE db_escola;

CREATE TABLE tb_estudantes (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    idade INT,
    nota DECIMAL(2,1) NOT NULL,
    turma VARCHAR(4),
    ano INT);
    
INSERT INTO tb_estudantes (nome, idade, nota, turma, ano)
VALUES 	("Vinicius", 15, 4.1, "A", 2),
		("Julia", 15, 7.0, "B", 2),
        ("Caio", 15, 1.1, "C", 2),
        ("Aline", 16, 6.9, "C", 3),
        ("Pedro", 16, 8.2, "A", 3),
        ("Paulo", 16, 5.5, "B", 3),
        ("Robert", 14, 3.6, "A", 1),
        ("Vivian", 14, 9.1, "B", 1),
        ("Lorena", 14, 7.5, "C", 1);

SELECT * FROM tb_estudantes WHERE nota > 7;

SELECT * FROM tb_estudantes WHERE nota < 7;

UPDATE tb_estudantes SET nota = 8.9 WHERE id = 7;    
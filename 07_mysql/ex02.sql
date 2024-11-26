CREATE DATABASE db_ecommerce;

USE db_ecommerce;

SET SQL_SAFE_UPDATES = 0;

CREATE TABLE tb_produtos (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    categoria VARCHAR (100),
    nome VARCHAR (100),
    marca VARCHAR (100),
    quantidade INT,
    preco DECIMAL (10,2)
    );
    
INSERT INTO tb_produtos (categoria, nome, marca, quantidade, preco)
VALUES 	("Celular", "iPhone 15", "Apple", 2, 6000),
		("Celular", "iPhone 14", "Apple", 4, 4000),
        ("Video Game", "Xbox Series S", "Microsoft", 5, 2000),
        ("Video Game", "Super Nintendo RB", "Raspberry", 1, 390),
        ("Mouse", "G502", "Logitech", 6, 310),
        ("Teclado", "Ergo  k860", "Logitech", 3, 300),
        ("Controle", "One X", "Microsoft", 6, 400),
        ("Placa de Video", "GTX1050", "Asus", 2, 700),
        ("Placa de Video", "RTX4070", "Gigabyte", 2, 6000),
        ("Monitor", "Hero 27", "AOC", 3, 680),
        ("Monitor", "G9", "Samsung", 1, 6000);
        
SELECT * FROM tb_produtos WHERE preco > 500;

SELECT * FROM tb_produtos WHERE preco < 500;

UPDATE tb_produtos SET preco = 4500 WHERE nome = "iPhone 14";
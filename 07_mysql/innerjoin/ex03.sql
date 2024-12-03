-- Crie um banco de dados para um serviço de uma Farmácia. 
-- O nome do Banco de dados deverá ter o seguinte nome db_farmacia_bem_estar. 
-- O sistema trabalhará com as informações dos produtos comercializados pela empresa. 
-- O sistema trabalhará com 2 tabelas tb_produtos e tb_categorias, que deverão estar relacionadas.

CREATE DATABASE db_farmacia_bem_estar;
USE db_farmacia_bem_estar;

CREATE TABLE tb_categorias (
	id_categorias BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_categorias VARCHAR(100),
    descricao VARCHAR(100)
);

CREATE TABLE tb_produtos (
	id_produtos BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_produtos VARCHAR (100),
    marca VARCHAR(100),
    preco DECIMAL (8,2),
    quantidade INT,
    categorias_id BIGINT,
    FOREIGN KEY (categorias_id) REFERENCES tb_categorias(id_categorias)
);

INSERT INTO tb_categorias(nome_categorias, descricao)
VALUES 	("Medicamentos", "Produtos para tratamento de doenças"),
		("Cosméticos", "Produtos de beleza e cuidado pessoal"),
        ("Suplementos", "Produtos de suplementação alimentar"),
        ("Higiene", "Produtos de higiene pessoas"),
        ("Infantil", "Produtos para bebês e crianças")
        ;

INSERT INTO tb_produtos (nome_produtos, marca, preco, quantidade, categorias_id)
VALUES 	("Paracetamol", "Tesco", 25.00, 100, 1),
		("Neusadina", "Neusa", 15.00, 50, 1),
        ("Shampoo", "Aucie", 35.00, 30, 2),
        ("Condicionador", "WePink", 45.00, 75, 2),
        ("B12", "Growth", 150.00, 200, 3),
        ("Whey", "Max", 20.00, 40, 3),
        ("Papel higiênico", "Neve", 10.00, 100, 4),
        ("Lenço humidecido", "Fofinhos", 65.00, 30, 4),
        ("Chupeta", "ToyCare", 15.00, 50, 5),
        ("NAN", "Nestle", 55.00, 60, 5);
        
-- produtos abaixo de 50        
SELECT * FROM tb_produtos WHERE preco > 50;
-- produtos entre 5 e 60 reais
SELECT * FROM tb_produtos WHERE preco BETWEEN 5 AND 60;

-- produtos que tem a letra C no nome
SELECT * FROM tb_produtos WHERE nome_produtos LIKE "%c%";

-- inner join entre os dados da tabela produtos e categorias
SELECT nome_produtos, marca, preco, quantidade, tb_categorias.nome_categorias
FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categorias_id = tb_categorias.id_categorias;

-- inner join filtrando pela categoria infantil da tabela categoria
SELECT nome_produtos, marca, preco, quantidade, tb_categorias.nome_categorias
FROM tb_produtos INNER JOIN tb_categorias
ON tb_produtos.categorias_id = tb_categorias.id_categorias
WHERE tb_categorias.nome_categorias = "Infantil";
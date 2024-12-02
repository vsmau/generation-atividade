-- Crie um banco de dados para um serviço de uma Pizzaria. 
-- O nome do Banco de dados deverá ter o seguinte nome db_pizzaria_legal. 
-- O sistema trabalhará com as informações dos produtos comercializados pela empresa. 
-- O sistema trabalhará com 2 tabelas tb_pizzas e tb_categorias, que deverão estar relacionadas.

CREATE DATABASE db_pizzaria_legal;
USE db_pizzaria_legal;

CREATE TABLE tb_categorias (
	id_categoria INT AUTO_INCREMENT PRIMARY KEY,
    nome_categoria VARCHAR (100) NOT NULL,
    descricao VARCHAR (100)
);
	
CREATE TABLE tb_pizzas (
	id_pizza INT AUTO_INCREMENT PRIMARY KEY,
    nome_pizza VARCHAR(100),
	tamanho VARCHAR(100),
    preco DECIMAL(6,2),
    ingredientes VARCHAR(500),
    id_categoria INT,
    FOREIGN KEY (id_categoria) REFERENCES tb_categorias(id_categoria)
    );
    
-- Inserir 5 registros na tabela categorias
INSERT INTO tb_categorias (nome_categoria, descricao)
VALUES 	("Tradicionais", "Sabores clássicos"),
		("Especiais", "Combinações únicas"),
        ("Vegetarianas", "Sem carnes, com queijo e/ou ovos"),
        ("Doces", "Ingredientes doces"),
        ("Premium", "Ingredientes caros fio");
        
-- Inserir 10 registros na tabela categorias
INSERT INTO tb_pizzas (nome_pizza, tamanho, preco, ingredientes, id_categoria)
VALUES 	("Calabresa", "Pequena", 30.00, "Calabresa, queijo e molho de tomate", 1),
		("12 queijos", "Média", 50.00, "Queijo, muuuuuito queijo", 1),
        ("Cachorro quente", "Média", 55.00, "Dogão na massa", 2),
        ("Strogonoff", "Grande", 70.00, "Uma verdadeira massa russa", 2),
        ("Brócolís", "Pequena", 50.00, "Queijo, muuuuuito queijo e brólis sz", 3),
        ("Queijo frescal", "Grande", 40.00, "Queijo, muuuuuito queijo frescal", 3),
        ("Morango com chocolate", "Média", 50.00, "Bouluu de murangu em pizza", 4),
        ("Banana com doce de leite e canela", "Pequena", 35.00, "Banananananananana", 4),
        ("Camarão com cream cheese", "Grande", 80.00, "Camaraaaaaa", 5),
        ("Presunto parma e mozzarela de búfala", "Grande", 90.00, "Mi nombre iz franchesco virguliní", 5);

-- Pizzas acima de 45 reais
SELECT * FROM tb_pizzas WHERE preco > 45;

-- Pizzas entre 50 e 100 reais
SELECT * FROM tb_pizzas WHERE preco BETWEEN 50 AND 100;

-- Todas as pizzas que possuam M no nome
SELECT * FROM tb_pizzas WHERE nome_pizza LIKE "%M%";
    
-- Innerjoin
SELECT nome_pizza, tamanho, preco, ingredientes, tb_categorias.nome_categoria
FROM tb_pizzas INNER JOIN tb_categorias
ON tb_pizzas.id_categoria = tb_categorias.id_categoria;

-- Innerjoin apenas pizzas que são doces
SELECT nome_pizza, tamanho, preco, ingredientes, tb_categorias.nome_categoria
FROM tb_pizzas INNER JOIN tb_categorias
ON tb_pizzas.id_categoria = tb_categorias.id_categoria
WHERE tb_categorias.nome_categoria = "Doces";
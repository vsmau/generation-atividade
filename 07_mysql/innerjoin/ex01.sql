-- Crie um banco de dados para um serviço de um Games Online. 
-- O nome do Banco de dados deverá ter o seguinte nome db_generation_game_online. 
-- O sistema trabalhará com as informações dos personagens do jogo. 
-- O sistema trabalhará com 2 tabelas tb_personagens e tb_classes, que deverão estar relacionadas.

CREATE DATABASE db_generation_games_online;

USE db_generation_games_online;

CREATE TABLE tb_classe (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    categoria VARCHAR(100),
    habilidade_especial VARCHAR(100)
    );
    
CREATE TABLE tb_personagens (
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    vida BIGINT,
    ataque BIGINT,
    defesa BIGINT,
    classe_id BIGINT,
    FOREIGN KEY (classe_id) REFERENCES tb_classe(id)
    );
    
INSERT INTO tb_classe(categoria, habilidade_especial)
VALUES 	("Guerreiro","Força Bruta"),
		("Mago","Magia"),
        ("Lançador","Precisão"),
		("Médico","Cura"),
        ("Ladrão","Furtividade");

INSERT INTO tb_personagens(classe_id, nome, vida, ataque, defesa)
VALUES	(1,"Arthur", 4000, 3000, 600),
		(1,"Darius", 4000, 2400, 1200),
        (2,"Gandalf", 4500, 1500, 1800),
        (2,"Minerva", 4500, 1800, 1500),
        (3,"Davi", 3000, 1800, 2400),
        (4,"Angel", 5000, 1500, 1500),
        (5,"Robin Hood", 3500, 2100, 1800);
    
-- Personagens com ataque maior que 2000
SELECT * FROM tb_personagens WHERE ataque > 2000;

-- Personagens com defesa entre 1000 e 2000
SELECT * FROM tb_personagens WHERE defesa BETWEEN 1000 AND 2000;

-- Personagens com a letra D no nome
SELECT * FROM tb_personagens WHERE nome LIKE "%d%";

-- Unindo personagens e classes
SELECT nome, vida, ataque, defesa, tb_classe.categoria
FROM tb_personagens INNER JOIN tb_classe
ON tb_personagens.classe_id = tb_classe.id;

-- Personagens da classe Mago
SELECT nome, vida, ataque, defesa, tb_classe.categoria
FROM tb_personagens INNER JOIN tb_classe
ON tb_personagens.classe_id = tb_classe.id
WHERE tb_classe.categoria = "Mago";
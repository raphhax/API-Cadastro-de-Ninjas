-- Tracos duplos sao comentarios.
-- V2: Migrations para add coluna de RANK na tabela de cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);
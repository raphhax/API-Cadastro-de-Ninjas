-- V3: Migrations para adicionar coluna com url de imagem no banco de dados

ALTER TABLE tb_cadastro
ADD COLUMN img_url VARCHAR(255)
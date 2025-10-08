-- V2: Migrations para adicionar a coluna de profissão na tabela de cadastros

ALTER TABLE tb_cadastro
ADD COLUMN profissão VARCHAR (255);


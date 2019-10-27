INSERT INTO tb_usuario (usuario, senha) VALUES ('111','admin');
INSERT INTO tb_usuario (usuario, senha) VALUES ('123','admin');
INSERT INTO tb_usuario (usuario, senha) VALUES ('antoniofelix','123123');

INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Rua Jose',666, 'apt 23', 'Alphaville', '0812126', 'São Paulo', 'SP');

INSERT INTO tb_contato (email, celular) 
VALUES ('luiz@bol.com', '(11)98582825');

INSERT INTO tb_contato (email, celular) 
VALUES ('antonio@gmail.com', '(11)960252423');

INSERT INTO tb_nota(bimestre_1, bimestre_2, bimestre_3, bimestre_4) 
VALUES(10, 9.0, 8.0, 7.0);

INSERT INTO tb_curso(nome, descricao, id_nota) 
VALUES('Informática', 'Manutenção desktops', 1);

INSERT INTO tb_aluno (nome, cpf, dt_nasc, id_usuario, id_end, id_contato, id_curso) VALUES ('Carioca','55555555', '11/12/2000', 2, 1, 1, 1);
INSERT INTO tb_aluno (nome, cpf, dt_nasc, id_usuario, id_end, id_contato, id_curso) VALUES ('Antônio Felix da Silva Junior','12312345612', '01/10/1996', 3, 1, 1, 1);

INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Rua Jose',666, 'apt 23', 'Alphaville', '0812126', 'São Paulo', 'SP');


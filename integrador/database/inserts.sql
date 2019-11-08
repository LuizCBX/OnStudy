INSERT INTO tb_usuario (usuario, senha) VALUES ('111','admin');
INSERT INTO tb_usuario (usuario, senha) VALUES ('123','admin');
INSERT INTO tb_usuario (usuario, senha) VALUES ('antoniofelix','123123');

INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade, uf) 
VALUES ('Rua Paulo',666, 'apt 23', 'Anguera', '0812126', 'Bahia', 'SP');

INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade, uf) 
VALUES ('Rua Paulo',777, 'apt 32', 'Teste', '08151', 'Rio de Janeiro', 'SP');

INSERT INTO tb_contato (email, celular) 
VALUES ('antonio@bol.com', '(11)959595');

INSERT INTO tb_contato (email, celular) 
VALUES ('antonio@gmail.com', '(11)960252423');

INSERT INTO tb_aluno (ra, nome, cpf, dt_nasc, id_usuario, id_end, id_contato) VALUES (30100,'Luiz','55555555', '2000-12-01', 1, 1, 1);
INSERT INTO tb_aluno (ra, nome, cpf, dt_nasc, id_usuario, id_end, id_contato) VALUES (30102, 'Antônio','12345612', '1996-10-01', 2, 2, 2);


INSERT INTO tb_curso(nome, descricao, nota_minima) 
VALUES('Lógica de programação', '5 aulas', 7.0);

INSERT INTO tb_curso(nome, descricao, nota_minima) 
VALUES('Java', '5 aulas', 7.0);

INSERT INTO tb_curso(nome, descricao, nota_minima) 
VALUES('Excel Avançado', '7 aulas', 7.0);

INSERT INTO tb_aula(nome, descricao, id_curso) 
VALUES('Algoritmos', 'Estrutura Básica', 1);

INSERT INTO tb_aula(nome, descricao, id_curso) 
VALUES('Matemática Aplicada', 'Estrutura Básica', 1);

INSERT INTO tb_aula(nome, descricao, id_curso) 
VALUES('Lógica com Python', 'Estrutura Básica', 1);

INSERT INTO tb_aula(nome, descricao, id_curso) 
VALUES('POO', 'Estrutura Básica', 2);


INSERT INTO tb_matricula(id_aluno, id_curso) 
VALUES(1, 1);

INSERT INTO tb_matricula(id_aluno, id_curso) 
VALUES(1, 2);

INSERT INTO tb_matricula(id_aluno, id_curso) 
VALUES(1, 3);

INSERT INTO tb_questao(questao, id_curso) 
VALUES("2+2x2", 1);

INSERT INTO tb_alternativa(at_1, at_2, at_3, at_4, at_correta, id_questao) 
VALUES('5','2','4','6','6', 1);

INSERT INTO tb_avaliacao( nota_final, id_aluno, id_curso) 
VALUES(8.8, 1, 1);







INSERT INTO tb_usuario (usuario, senha) VALUES ('111','admin');
INSERT INTO tb_usuario (usuario, senha) VALUES ('123','admin');
INSERT INTO tb_usuario (usuario, senha) VALUES ('antoniofelix','123123');

INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Rua Paulo',666, 'apt 23', 'Anguera', '0812126', 'Bahia', 'SP');
INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Rua Ângelo Pedroso',132, 'apt 12', 'Guaianases', '08460345', 'São Paulo', 'SP');

INSERT INTO tb_contato (email, celular) 
VALUES ('antonio@bol.com', '(11)959595');

INSERT INTO tb_contato (email, celular) 
VALUES ('antonio@gmail.com', '(11)960252423');

INSERT INTO tb_aluno (ra, nome, cpf, dt_nasc, id_usuario, id_end, id_contato) VALUES (30100,'Luiz','55555555', '2000-12-01', 1, 1, 1);
INSERT INTO tb_aluno (ra, nome, cpf, dt_nasc, id_usuario, id_end, id_contato) VALUES (30101, 'Antônio','12345612', '1996-10-01', 2, 2, 2);


INSERT INTO tb_curso(nome, descricao, nota_minima) 
VALUES('Lógica de programação', '5 aulas', 7.0);

INSERT INTO tb_curso(nome, descricao, nota_minima) 
VALUES('Java', '5 aulas', 7.0);

INSERT INTO tb_aula(nome, descricao, id_curso) 
VALUES('Algoritmos', 'Estrutura Básica', 1);

INSERT INTO tb_aula(nome, descricao, id_curso) 
VALUES('POO', 'Estrutura Básica', 2);


INSERT INTO tb_matricula(id_aluno, id_curso) 
VALUES(1, 1);

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, 
alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2+2x2", 1, '5','2','4','0','6', 'e');

INSERT INTO tb_avaliacao( nota_final, id_aluno, id_curso, id_questao) 
VALUES(8.8, 1, 1, 1);


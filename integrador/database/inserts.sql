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

INSERT INTO tb_aula(nome, descricao, url_video, id_curso) 
VALUES('Lógica', 
	   'Estrutura Básica',
       '<iframe width="560" height="315" src="https://www.youtube.com/embed/h1FiBei6plo" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       1
      );


INSERT INTO tb_aula(nome, descricao, id_curso, url_video, url_pdf) 
VALUES('Lógica com Python', 'Estrutura Básica', 1);

INSERT INTO tb_aula(nome, descricao, id_curso) 
VALUES('POO', 'Estrutura Básica', 2);


INSERT INTO tb_matricula(id_aluno, id_curso) 
VALUES(1, 1);

INSERT INTO tb_matricula(id_aluno, id_curso) 
VALUES(1, 2);

INSERT INTO tb_matricula(id_aluno, id_curso) 
VALUES(1, 3);

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2+2x2", 1, '5','2','4','6','7', "D");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2-3", 1, '-1','2','4','6','7', "A");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("100 / 0", 1, '5','2','4','6','Nenhuma das alternativas.', "5");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2+2+2", 1, '5','2','4','6','7', "C");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("10x2", 1, '5','2','6','1','20', "E");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2+0", 1, '5','2','4','6','7', "B");

INSERT INTO tb_questoes_avaliacao( id_avaliacao, id_questao) 
VALUES(1, 1),
	  (1, 2),
      (1, 3),
	  (1, 4),
	  (1, 5);

INSERT INTO tb_avaliacao( nota_final, id_aluno, id_curso, id_questao) 
VALUES(8.8, 1, 1, 1);








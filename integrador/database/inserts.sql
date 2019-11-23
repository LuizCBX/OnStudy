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

INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Algoritmos', 
		'Estrutura Básica',
        '<iframe width="650" height="315" src="https://www.youtube.com/embed/8mei6uVttho" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe src="https://www.dca.ufrn.br/~affonso/DCA800/pdf/algoritmos_parte1.pdf" width="650" height="500" style="border: none;"></iframe>',
        1);

INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('JavaScript', 
	   'Estrutura Básica',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/h1FiBei6plo" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe src="http://conteudo.icmc.usp.br/CMS/Arquivos/arquivos_enviados/BIBLIOTECA_113_ND_72.pdf" width="650" height="670" style="border: none;"></iframe>',
       1
      );


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
VALUES("2+4", 1, '5','2','4','6','7', "D");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("50+1", 1, '5','2','51','50','1', "c");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2+0", 1, '5','2','4','6','7', "B");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2+0", 1, '5','2','4','6','7', "B");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("2+3", 1, '5','2','4','6','7', "A");


INSERT INTO tb_avaliacao( nota_final, id_aluno, id_curso) 
VALUES(8.8, 1, 1);

INSERT INTO tb_questoes_avaliacao( id_avaliacao, id_questao) 
VALUES(1, 1),
	  (1, 2),
      (1, 3),
	  (1, 4),
	  (1, 5);







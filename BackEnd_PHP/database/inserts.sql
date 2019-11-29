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
VALUES('Programação Web', '5 aulas', 7.0);


INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Algoritmos', 
		'O Curso Online de Lógica de Programação é o primeiro treinamento para quem deseja ingressar no mundo da TI. Na verdade, você utiliza a lógica para tudo em seu dia-a-dia. Quando prepara o seu café, você utiliza lógica. Quando você vai à escola, utiliza lógica. 
        E até para investir em um curso na Becode você utiliza lógica.',
        '<iframe class="video" width="650" height="315" src="https://www.youtube.com/embed/8mei6uVttho" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video" src="https://www.dca.ufrn.br/~affonso/DCA800/pdf/algoritmos_parte1.pdf" width="650" height="500" style="border: none;"></iframe>',
        1);
      
INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Primeiro Algoritmo', 
	   'Esta aula tem como objetivo capacitar o aluno a participar do desenvolvimento de soluções por meio da aplicação da lógica, segundo o paradigma de orientação a objetos, de modo a permitir a criação de softwares amigáveis, seguros e funcionais, independente da linguagem a ser usada na programação.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/M2Af7gkbbro" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="https://www.feg.unesp.br/Home/Pesquisa23/inovee/oficinatecnologica/apostila---introducao-a-logica-de-programacao.compressed.pdf" width="650" height="670" style="border: none;"></iframe>',
       1
      );
      
INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Comando de Entrada e Operadores', 
	   'Esta aula tem como objetivo capacitar o aluno a participar do desenvolvimento de soluções por meio da aplicação da lógica, segundo o paradigma de orientação a objetos, de modo a permitir a criação de softwares amigáveis, seguros e funcionais, independente da linguagem a ser usada na programação.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/RDrfZ-7WE8c" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="http://biblioteca.virtual.ufpb.br/files/introduaao_a_programaaao_1463150047.pdf" width="650" height="670" style="border: none;"></iframe>',
       1
      );

INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Operadores Lógicos e Relacionais', 
	   'Esta aula tem como objetivo capacitar o aluno a participar do desenvolvimento de soluções por meio da aplicação da lógica, segundo o paradigma de orientação a objetos, de modo a permitir a criação de softwares amigáveis, seguros e funcionais, independente da linguagem a ser usada na programação.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/Ig4QZNpVZYs" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="https://www.feg.unesp.br/Home/Pesquisa23/inovee/oficinatecnologica/apostila---introducao-a-logica-de-programacao.compressed.pdf" width="650" height="670" style="border: none;"></iframe>',
       1
      );
INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Introdução ao Scratch', 
	   'Esta aula tem como objetivo capacitar o aluno a participar do desenvolvimento de soluções por meio da aplicação da lógica, segundo o paradigma de orientação a objetos, de modo a permitir a criação de softwares amigáveis, seguros e funcionais, independente da linguagem a ser usada na programação.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/GrPkuk1ezyo" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="http://www.ams.eti.br/livros/Sandra_Puga.pdf" width="650" height="670" style="border: none;"></iframe>',
       1
      );
      
      
-- CURSO 2
INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Introdução JavaScript', 
	   'JavaScript é uma linguagem de programação front-end, isto é, uma linguagem que interpretada diretamente no cliente (navegador). Nos últimos anos, JavaScript vem se destacando como a linguagem preferida entre todos os programadores web, por isso é tão importante estudá-la.
       Neste curso, você aprenderá os conceitos básicos da linguagem JavaScript.',
       '<iframe class="video" width="650" height="315" src="https://www.youtube.com/embed/h1FiBei6plo" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="http://conteudo.icmc.usp.br/CMS/Arquivos/arquivos_enviados/BIBLIOTECA_113_ND_72.pdf" width="650" height="670" style="border: none;"></iframe>',
       2
      );
      
INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Hello World JavaScript', 
	   'Aprenda JavaScript de forma prática e divertida desenvolvendo aplicativos, jogos e muito mais. Este curso também ensina lógica de programação e é ponto de partida à todos que desejam ser desenvolvedores WEB.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/3RGC11qNgCM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="http://docente.ifsc.edu.br/vilson.junior/pi/04_Introducao_JavaScript.pdf" width="650" height="670" style="border: none;"></iframe>',
       2
      );

INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Inserir documento externo .js nas páginas HTML', 
	   'Aprenda JavaScript de forma prática e divertida desenvolvendo aplicativos, jogos e muito mais. Este curso também ensina lógica de programação e é ponto de partida à todos que desejam ser desenvolvedores WEB.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/iAVWC_yHlLI" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="https://lrodrigo.sgs.lncc.br/wp/wp-content/uploads/2016/04/apostila-javascript.2005.03.22.pdf" width="650" height="670" style="border: none;"></iframe>',
       2
      );
      
INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Criando e executando uma função', 
	   'Aprenda JavaScript de forma prática e divertida desenvolvendo aplicativos, jogos e muito mais. Este curso também ensina lógica de programação e é ponto de partida à todos que desejam ser desenvolvedores WEB.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/qlRvwDCfRgM" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="https://statics-submarino.b2w.io/sherlock/books/firstChapter/112167569.pdf" width="650" height="670" style="border: none;"></iframe>',
       2
      );
      
INSERT INTO tb_aula(nome, descricao, url_video, url_pdf, id_curso) 
VALUES('Aplicativo Calculadora FLEX Parte 1/2', 
	   'Aprenda JavaScript de forma prática e divertida desenvolvendo aplicativos, jogos e muito mais. Este curso também ensina lógica de programação e é ponto de partida à todos que desejam ser desenvolvedores WEB.',
       '<iframe width="650" height="315" src="https://www.youtube.com/embed/20P-MvGaZuQ" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>',
       '<iframe class="video"src="http://conteudo.icmc.usp.br/CMS/Arquivos/arquivos_enviados/BIBLIOTECA_113_ND_72.pdf" width="650" height="670" style="border: none;"></iframe>',
       2
      );
      

	INSERT INTO tb_matricula(id_aluno, id_curso) 
	VALUES(1, 1);

	INSERT INTO tb_matricula(id_aluno, id_curso) 
	VALUES(1, 2);

	-- INSERT INTO tb_matricula(id_aluno, id_curso) 
	-- VALUES(1, 3);
    
    
-- CURSO 1
INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Um algoritmo é", 
		1, 
        'uma sequência finita de ações executáveis',
        'uma abstração visual de um problema computacional',
        'um mapeamento de sistemas nãomensuráveis.',
        'uma herança lógica de um problema real, traduzido para linguagem demáquina.',
        'prever mudanças mais que estimar um prazo.', 
        "A");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("É um dos valores do manifesto ágil para o desenvolvimento de software:", 
		1, 
        'indivíduos einterações mais que processos e ferramentas.',
        'prever mudanças mais que estimar um prazo',
        'software documentado mais que software otimizado.',
        'uma herança lógica de um problema real, traduzido para linguagem demáquina.',
        'entregas rápidas mais que contratose negociações.', 
        "A");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("O algoritmo comumente aplicado a problemas de otimização combinatória, cuja aplicação consiste em criar uma solução inicial e depois efetuar uma busca local para melhorar a qualidade da solução é chamado de:", 
		1, 
        'RETURN.',
        'ATOMIC',
        'ACID.',
        'GRASP. ',
        'HTML', 
        "D");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Uso de classes, nos quais objetos são cópias de outros objetos, não instâncias de classes, são chamados de:", 
		1, 
        'métodos. ',
        'protótipos',
        'heranças',
        'abstratos',
        'consultas', 
        "B");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Após desenvolver algo em Java, esse código é transformado em um bytecode, que por sua vez, é interpretado por uma:", 
		1, 
        'JDP',
        'JVP.',
        'JDM',
        'JKM.',
        'JVM.', 
        "E");
        
INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Em HTML 5, o elemento usado para definir a fonte de vídeo ou áudio é: ",
		1, 
        'insert. ',
        'media.',
        'source.',
        'playit',
        'execute.', 
        "C");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Assinale a alternativa que explica o conceito de interface, sob a ótica de orientação a objetos.",
		1, 
        'É a plataforma lógica sobre a qual se desenvolvem os compiladores.',
        'É a mecânica semântica aplicada no processo de tradução da linguagem homem-máquina.',
        'É um aglomerado de informações complexas quem auxiliam exclusivamente o cálculo lógico das instruções enviadas ao processador.',
        'É uma referência à característica que permite a construção de elementos que isolem do mundo exterior os detalhes de implementação de componentes de software.',
        'associar o elemento da página a um ftp',
        "D");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("O algoritmo que possui a característica de invocar a si mesmo repetidamente até que certa condição seja satisfeita é chamado de: ", 
		1, 
        'lógico.',
        'recursivo. ',
        'serial.',
        'condicionado.',
        'main', 
        "B");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("SQL-Server e MySQL são exemplos de: ", 
		1, 
        'BDRA.',
        'SMBD. ',
        'SGBD.',
        'RDBS.',
        'CMD', 
        "C");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("O comando que esvazia imediatamente todo o conteúdo de uma tabela ou objeto que contenha dados é o: ", 
		1, 
        'DELETE.',
        'TRUNCATE. ',
        'REMOVO.',
        'EXCLUDE.',
        'APAGAR', 
        "B");

-- CURSO 2

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Analise as afirmações sobre as linguagens de programação.

I. O mecanismo de herança em Java ocorre em tempo de compilação, ou seja, todo reaproveitamento de código realizado por herança é imutável em tempo de execução.

II. A linguagem C++ possui herança múltipla, Java possui somente herança simples para classes concretas e abstratas, mas possui herança múltipla para a interface, já Javascript não possui herança como funcionalidade nativa.

III. C++ é uma linguagem compilada, Java é compilada para uma linguagem de máquina intermediária chamada de bytecodes, sendo esta interpretada e Javascript é interpretada.

É correto afirmar que:", 

		2, 
        'somente a afirmativa II é verdadeira.',
        'somente as afirmativas I e III são verdadeiras.',
        'somente as afirmativas I e II são verdadeiras.',
        'somente a afirmativa III é verdadeira.',
        'as afirmativas I, II e III são verdadeiras.',
        "B");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("O nome dado à biblioteca JavaScript cross-browser desenvolvida para simplificar os scripts executados no lado do cliente e que interagem com o HTML é
AJSP.
",
		2, 
        'JSP.',
        'J2ME.',
        'standard actions. ',
        'J2EE.',
        'JQuery.',
        "E");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Muitas vezes quando um campo perde o foco é necessário verificar alguma validação em seu conteúdo por meio de scripts JavaScript. O atributo de uma tag que permite chamar um script JavaScript que será executado quando o campo perder o foco é o:",
		2, 
        'onblur. ',
        'onkeyup. ',
        'onchange. ',
        'onlostfocus. ',
        'onmouseout. ',
        "A");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Com base nas informações e nos códigos-fonte apresentados é correto afirmar que: ",
		2, 
        'ao clicar no botão Salvar do formulário, os valores digitados nos campos do formulário serão enviados à classe Controle001 no servidor, sem passarem pela validação contida na função JavaScript validar().',
        'se for digitado o valor 100 no campo id será exibida a mensagem. "O valor do ID digitado é inválido".',
        'se for digitado o valor 100,00 no campo renda será exibida a mensagem "O valor da renda digitada é inválido".',
        'se a função JavaScript validar() retornar o valor false, os dados digitados no formulário serão enviados ao arquivo Controle001 que está no servidor. ',
        'se for digitado o valor 45-33 no campo id e o valor 1576.67 no campo renda, os dados digitados no formulário serão enviados à classe Controle001 que executa no servidor.',
        "C");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES	("Os valores INSERT são exemplos de: ",
		2, 
        'SQL',
        'Java',
        'HTML ',
        'CSS ',
        'validation scriptlets. ',
        "A");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Variáveis JavaScript contêm:",
		2, 
        'um identiﬁcador, escopo e um tipo de dados especíﬁco.',
        'um contextualizador, localizador e um tipo de dados especíﬁco.',
        'um identiﬁcador, parâmetro e um tipo de escopo.',
        'um delimitador, escopo e um referenciador.',
        'um identiﬁcador, extensão e um ponteiro.',
        "A");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Nas tecnologias PHP, PostgreSQL, XML, CSS, JavaScript e Java:",
		2, 
        'códigos escritos em JavaScript, quaisquer que sejam eles, são necessariamente executados em um browser, e não podem ser executados "fora" de um browser.',
        'dados podem ser armazenados no PostgreSQL e serializados em XML para transferência.',
        'o uso de Java é incompatível com CSS e exige PHP para aplicações web.',
        'o uso de PHP é necessário em páginas web dinâmicas.',
        'HTML é uma linguagem de programação.',
        "B");
        
INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Comumente, uma chave primária é conhecida também como: ",
		2, 
        'SU',
        'CP',
        'PS',
        'FK',
        'PK', 
        "E");

INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("A área do conhecimento que estuda como tratar, analisar e obter informações a partir de conjuntos de dados grandes demais para serem analisados por sistemas tradicionais é conhecida como:",
		2, 
        'Big Data.',
        'Data Lake.',
        'Data Warehouse.',
        'Data Mart.',
        'DATA De Hoje', 
        "A");
        
INSERT INTO tb_questao(descricao, id_curso, alternativa_a, alternativa_b, alternativa_c, alternativa_d, alternativa_e, alternativa_correta) 
VALUES("Em Java, o método em que se inicia o programa é o:  ",
		2, 
        'principal',
        'main',
        'start',
        'run',
        'começar', 
        "B");

INSERT INTO tb_avaliacao(nota_final, id_aluno, id_curso) 
VALUES(8.8, 1, 1);

INSERT INTO tb_questoes_avaliacao( id_avaliacao, id_questao) 
VALUES(1, 1),
	  (1, 2),
      (1, 3),
	  (1, 4),
	  (1, 5);







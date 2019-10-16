create database db_ead;
use db_ead;

CREATE TABLE tb_usuario(
  id_usuario INT NOT NULL AUTO_INCREMENT,
  usuario VARCHAR(200) NOT NULL,
  senha VARCHAR(32) NOT NULL,
  PRIMARY KEY (id_usuario));
  
INSERT INTO tb_usuario (usuario, senha) VALUES ('111','admin');
INSERT INTO tb_usuario (usuario, senha) VALUES ('123','admin');
select * from tb_usuario;


create table tb_aluno(
	ra int auto_increment primary key,
    nome varchar(100) not null,
    cpf varchar(15) not null,
    dt_nasc varchar (20) not null,
    id_usuario int not null unique,
    id_end int not null,
    id_contato int not null,
    id_curso int not null,
    constraint fk_usuario_pk_ra foreign key (id_usuario) references tb_usuario(id_usuario),
	constraint fk_end_pk_ra foreign key (id_end) references tb_endereco(id_end),
    constraint fk_ct_pk_ra foreign key (id_contato) references tb_contato(id_contato),
	constraint fk_curso_pk_ra foreign key (id_curso) references tb_curso(id_curso)
);
INSERT INTO tb_aluno (nome, cpf, dt_nasc, id_usuario, id_end, id_contato) VALUES ('Lenadro','55555555', '11/12/2000', 2);
INSERT INTO tb_aluno (nome, cpf, dt_nasc, id_usuario, id_end, id_contato, id_curso) VALUES ('Luiz','4444444', '11/12/1998', 1, 1, 1, 1);
select * from tb_aluno;

    
create table tb_endereco(
	id_end int auto_increment primary key,
    logradouro varchar(40),
    numero int,
    complemento varchar(40),
    bairro varchar(50),
    cep varchar(15),
    cidade varchar(50),
    estado varchar(50)
);
INSERT INTO tb_endereco (logradouro, numero, complemento, bairro, cep, cidade, estado) 
VALUES ('Rua Jose',666, 'apt 23', 'Alphaville', '0812126', 'São Paulo', 'SP');
select * from tb_endereco;


create table tb_contato(
	id_contato int auto_increment primary key,
    email varchar(50),
    celular varchar(30)
);
INSERT INTO tb_contato (email, celular) 
VALUES ('luiz@bol.com', '(11)98582825');


create table tb_curso(
	id_curso int auto_increment,
    nome varchar(70) not null,
    descricao varchar(200),
    PRIMARY KEY(id_curso)
);
INSERT INTO tb_curso(nome, descricao) 
VALUES('Inglês', 'Nossos cursos são personalizados de acordo com seus objetivos e níveis.');
select * from tb_curso;


DROP DATABASE IF EXISTS `db_ead`;
CREATE DATABASE db_ead;
USE db_ead;

DROP TABLE IF EXISTS `tb_usuario`;
CREATE TABLE tb_usuario(
  id_usuario INT NOT NULL AUTO_INCREMENT,
  usuario VARCHAR(200) NOT NULL,
  senha VARCHAR(32) NOT NULL,
  PRIMARY KEY (id_usuario)
);

DROP TABLE IF EXISTS `tb_endereco`;    
CREATE TABLE tb_endereco(
	id_end int auto_increment primary key,
    logradouro varchar(40),
    numero int,
    complemento varchar(40),
    bairro varchar(50),
    cep varchar(15),
    cidade varchar(50),
    estado varchar(50)
);

DROP TABLE IF EXISTS `tb_contato`;
CREATE TABLE tb_contato(
	id_contato int auto_increment primary key,
    email varchar(50),
    celular varchar(30)
);

DROP TABLE IF EXISTS `tb_curso`;
CREATE TABLE tb_curso(
	id_curso int auto_increment,
    nome varchar(70) not null,
    descricao varchar(200),
    id_nota int not null,
    PRIMARY KEY(id_curso)
);

DROP TABLE IF EXISTS `tb_aluno`;
CREATE TABLE tb_aluno(
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

DROP TABLE IF EXISTS `tb_nota`;
CREATE TABLE tb_nota(
	id_nota int auto_increment,
    bimestre_1 decimal (5,2), 
    bimestre_2 decimal (5,2),
    bimestre_3 decimal (5,2),
    bimestre_4 decimal (5,2),
    PRIMARY KEY(id_nota)
);


-- Estrutura da tabela `events`

DROP TABLE IF EXISTS `events`;
CREATE TABLE IF NOT EXISTS `events` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(220) DEFAULT NULL,
  `color` varchar(10) DEFAULT NULL,
  `start` datetime DEFAULT NULL,
  `end` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
--
-- Extraindo dados da tabela `events`
--

INSERT INTO `events` (`id`, `title`, `color`, `start`, `end`) VALUES
(1, 'Tutorial PagSeguro', '#FFD700', '2019-05-21 15:00:00', '2019-05-21 16:00:00'),
(2, 'Tutorial FullCalendar editar detalhes do evento', '#0071c5', '2019-05-30 15:00:00', '2019-05-30 00:00:00'),
(3, 'Tutorial FullCalendar Visualizar detalhes do evento', '#0071c5', '2019-05-23 15:00:00', '2019-05-23 16:00:00'),
(4, 'Reuniao 3', '#40e0d0', '2019-05-17 17:00:00', '2019-05-17 18:00:00'),
(5, 'Reuniao 4', '#0071c5', '2019-05-17 15:00:00', '2019-05-17 16:00:00'),
(6, 'Reuniao 5', '#FFD700', '2019-05-17 13:00:00', '2019-05-17 14:00:00'),
(7, 'Reuniao 6', '#0071c5', '2019-05-17 11:00:00', '2019-05-17 12:00:00'),
(8, 'Reuniao 7', '#40e0d0', '2019-05-17 09:00:00', '2019-05-17 10:00:00'),
(9, 'Tutorial', '#228B22', '2019-09-12 00:00:00', '2019-09-13 00:00:00'),
(10, 'Tutorial 2', '#FF4500', '2019-09-13 15:10:10', '2019-09-13 17:15:15');
COMMIT;

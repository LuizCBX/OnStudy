select * from tb_usuario;
select * from tb_aluno;
select * from tb_curso;
select * from tb_endereco;
select * from tb_contato;
select * from tb_matricula;
select * from tb_aula;
select * from tb_questao;
select * from tb_alternativa;


select us.usuario, al.nome from tb_usuario us inner join tb_aluno al on us.id_usuario=al.ra where usuario = '12345';


select u.id, u.usuario,a.nome, a.ra from tb_usuario u inner join tb_aluno a on u.id=a.id_usuario where u.usuario = '{$usuario}' and senha = '{$senha}';


SELECT c.nome as curso, c.descricao, a.id, a.nome as aula, a.descricao from tb_aula a INNER JOIN tb_curso c on a.id_curso=c.id where c.id=1; 

select c.nome,c.descricao,c.nota_minima from tb_aluno a inner join tb_matricula m on a.id=m.id_aluno inner join tb_curso c on c.id=m.id_curso where a.id_usuario=1;


select * from tb_usuario;
select * from tb_aluno;
select * from tb_curso;
select * from tb_nota;
select * from tb_endereco;

select us.usuario, al.nome from tb_usuario us inner join tb_aluno al on us.id_usuario=al.ra where usuario = '12345';



SELECT u.usuario, a.nome, a.ra, c.nome, c.descricao FROM tb_usuario AS u 
INNER JOIN tb_aluno AS a ON a.id = u.id 
INNER JOIN tb_curso AS c ON c.id = u.id;
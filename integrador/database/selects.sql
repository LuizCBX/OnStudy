select * from tb_usuario;
select * from tb_aluno;
select * from tb_curso;
select * from tb_nota;
select * from events;
select * from tb_endereco;

select us.usuario, al.nome from tb_usuario us inner join tb_aluno al on us.id_usuario=al.ra where usuario = '12345';

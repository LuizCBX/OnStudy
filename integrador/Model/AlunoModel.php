<?php

require_once 'Conexao.php';

class AlunoModel extends Conexao
{
    public function getAlunoByRA($id)
    {
        $query = "SELECT * FROM tb_aluno WHERE ra = $id";
        $result = mysqli_query($this->getConexao(), $query);
        return mysqli_fetch_object($result);
    }

    public function getCursoPorId($id)
    {
        $query = "select c.id,c.nome, c.descricao, c.nota_minima from tb_aluno a inner join tb_matricula m on a.id=m.id_aluno inner join tb_curso c on c.id=m.id_curso where a.id_usuario=$id;";
        $result = mysqli_query($this->getConexao(), $query);
        return $result;
    }

    public function getAulaPorCurso($id)
    {
        $query = "SELECT c.nome 'curso', c.descricao, a.id, a.nome 'aula', a.descricao from tb_aula a INNER JOIN tb_curso c on a.id_curso=c.id where c.id=$id;";
        $result = mysqli_query($this->getConexao(), $query);
        return $result;
    }


}



?>
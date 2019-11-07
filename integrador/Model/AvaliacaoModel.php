<?php

require_once 'Conexao.php';

class AvaliacaoModel extends Conexao
{
    public function getAvaliacaoById($id)
    {
        $query = "SELECT * FROM tb_avaliacao WHERE id = $id";
        $result = mysqli_query($this->getConexao(), $query);
        return mysqli_fetch_object($result);
    }
    
    public function getAvaliacaoByAlunoCurso($id_aluno, $id_curso)
    {
        $query = "SELECT * FROM tb_avaliacao WHERE id_curso = $id_aluno AND id_curso = $id_curso ORDER BY data_av ";
        $result = mysqli_query($this->getConexao(), $query);
        return mysqli_fetch_object($result);
    }
}
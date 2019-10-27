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
}

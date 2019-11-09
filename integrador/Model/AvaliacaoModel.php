<?php

require_once 'Conexao.php';

class AvaliacaoModel extends Conexao
{
    public function getAvaliacaoById($id)
    {
        $query = "SELECT * FROM tb_questao WHERE id = $id";
        $result = mysqli_query($this->getConexao(), $query);
        return mysqli_fetch_object($result);
    }
    
    public function getAvaliacaoByAlunoCurso($id_aluno, $id_curso)
    {
        $query = "SELECT * FROM tb_avaliacao WHERE id_aluno = $id_aluno AND id_curso = $id_curso ORDER BY data_av ";
        $result = mysqli_query($this->getConexao(), $query);
        return mysqli_fetch_object($result);
    }

    public function getQuestoes($id_avaliacao)
    {
        $query = "SELECT id_questao FROM tb_questoes_avaliacao WHERE id_avaliacao = $id_avaliacao ";
        $result = mysqli_query($this->getConexao(), $query);
        $result = mysqli_fetch_all($result);
        $listQuestoes =[];
        foreach($result as $res) {
            array_push($listQuestoes,$res[0]);
        }
        $query = "SELECT * FROM tb_questao WHERE id IN (".implode(",",$listQuestoes).") ";
        $result = mysqli_query($this->getConexao(), $query);
        $result = mysqli_fetch_all($result, MYSQLI_ASSOC);

        return $result;
    }
}
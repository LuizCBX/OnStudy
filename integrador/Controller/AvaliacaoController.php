<?php

require_once __DIR__.'/../Model/AvaliacaoModel.php';

class AvaliacaoController
{
    private $data_av;
    private $id_curso;
    private $id_avaliacao;

    public function iniciarAvaliacao($ra, $id_curso)
    {
        $avaliacaoModel = new AvaliacaoModel();
        $avaliacaoModelObj = $avaliacaoModel->getAvaliacaoByAlunoCurso($ra, $id_curso);
        $this->id_curso = $avaliacaoModelObj->id_curso;
        $this->data_av = $avaliacaoModelObj->data_av;
        $this->id_avaliacao = $avaliacaoModelObj->id;

        $questoes = $avaliacaoModel->getQuestoes($this->id_avaliacao);
        
        return $questoes;
    }

    public function finalizarAvaliacao()
    {

    }

    /**
     * Get the value of id_curso
     */ 
    public function getId_curso()
    {
        return $this->id_curso;
    }

    /**
     * Set the value of id_curso
     *
     * @return  self
     */ 
    public function setId_curso($id_curso)
    {
        $this->id_curso = $id_curso;

        return $this;
    }

    /**
     * Get the value of descricao
     */ 
    public function getDescricao()
    {
        return $this->descricao;
    }

    /**
     * Set the value of descricao
     *
     * @return  self
     */ 
    public function setDescricao($descricao)
    {
        $this->descricao = $descricao;

        return $this;
    }

    /**
     * Get the value of a
     */ 
    public function getA()
    {
        return $this->a;
    }

    /**
     * Set the value of a
     *
     * @return  self
     */ 
    public function setA($a)
    {
        $this->a = $a;

        return $this;
    }

    /**
     * Get the value of b
     */ 
    public function getB()
    {
        return $this->b;
    }

    /**
     * Set the value of b
     *
     * @return  self
     */ 
    public function setB($b)
    {
        $this->b = $b;

        return $this;
    }

    /**
     * Get the value of c
     */ 
    public function getC()
    {
        return $this->c;
    }

    /**
     * Set the value of c
     *
     * @return  self
     */ 
    public function setC($c)
    {
        $this->c = $c;

        return $this;
    }

    /**
     * Get the value of d
     */ 
    public function getD()
    {
        return $this->d;
    }

    /**
     * Set the value of d
     *
     * @return  self
     */ 
    public function setD($d)
    {
        $this->d = $d;

        return $this;
    }

    /**
     * Get the value of e
     */ 
    public function getE()
    {
        return $this->e;
    }

    /**
     * Set the value of e
     *
     * @return  self
     */ 
    public function setE($e)
    {
        $this->e = $e;

        return $this;
    }

    /**
     * Get the value of data_av
     */ 
    public function getData_av()
    {
        return $this->data_av;
    }

    /**
     * Set the value of data_av
     *
     * @return  self
     */ 
    public function setData_av($data_av)
    {
        $this->data_av = $data_av;

        return $this;
    }
}

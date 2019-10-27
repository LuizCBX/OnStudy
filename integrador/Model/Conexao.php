<?php

class Conexao
{
    private $conexao;

    public function getConexao()
    {
        return $this->conexao;
    }

    public function __construct()
    {
        define('SERVERNAME', 'localhost');
        define('USUARIO', 'root');
        define('SENHA', '');
        define('DB', 'db_ead');
        $this->conexao = $this->abrirConexao();
    }
    
    public function abrirConexao()
    {
        $conn = mysqli_connect(SERVERNAME, USUARIO, SENHA, DB) or die ('Não foi possível conectar');
        mysqli_set_charset($conn, "utf8");
        return $conn;
    }
}

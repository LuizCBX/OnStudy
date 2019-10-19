<?php
define('SERVERNAME', 'localhost');
define('USUARIO', 'root');
define('SENHA', '');
define('DB', 'db_ead');

$conexao = mysqli_connect(SERVERNAME, USUARIO, SENHA, DB) or die ('Não foi possível conectar');
<?php
session_start();
include('conexao.php');

if(empty($_POST['usuario']) || empty($_POST['senha'])) {
	header('Location: index.php');
	exit();
}

$usuario = mysqli_real_escape_string($conexao, $_POST['usuario']);
$senha = mysqli_real_escape_string($conexao, $_POST['senha']);

$query = "SELECT u.usuario, a.nome FROM tb_usuario AS u INNER JOIN tb_aluno AS a ON a.id_usuario = u.id_usuario where usuario = '{$usuario}' and senha = '{$senha}'";

$result = mysqli_query($conexao, $query);

$retorno_login = mysqli_fetch_array($result);

$row = mysqli_num_rows($result);

if($row == 1) {
	$_SESSION['nome'] = $retorno_login['nome'];
	$_SESSION['usuario'] = $retorno_login['usuario'];
	header('Location: welcome.php');
	
	exit();
} else {
	$_SESSION['nao_autenticado'] = true;
	header('Location: index.php');
	exit();
}
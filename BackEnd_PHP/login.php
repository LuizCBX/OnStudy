<?php
session_start();
include('Model/Conexao.php');

$conexaoIns = new Conexao();
$conexao = $conexaoIns->getConexao();


if(empty($_POST['usuario']) || empty($_POST['senha'])) {
	header('Location: index.php');
	exit();
}

$usuario = mysqli_real_escape_string($conexao, $_POST['usuario']);
$senha = mysqli_real_escape_string($conexao, $_POST['senha']);


$query = "select u.id, u.usuario,a.nome, a.id as 'aid', a.ra from tb_usuario u inner join tb_aluno a on u.id=a.id_usuario where u.usuario = '{$usuario}' and senha = '{$senha}'";

// $query = "SELECT u.usuario, a.nome, a.ra, c.nome, c.descricao FROM tb_usuario AS u 
// INNER JOIN tb_aluno AS a ON a.id = u.id 
// INNER JOIN tb_curso AS c ON c.id = u.id where usuario = '{$usuario}' and senha = '{$senha}'";

$result = mysqli_query($conexao, $query);

$retorno_login = mysqli_fetch_array($result);

$row = mysqli_num_rows($result);

if($row == 1) {
	$_SESSION['id_usuario'] = $retorno_login['id']; /* Ta puxando o id do usuário*/
	$_SESSION['usuario'] = $retorno_login['usuario']; /* Ta puxando o nome do usuário*/
	$_SESSION['nome_aluno'] = $retorno_login['nome']; /* Ta puxando o nome do aluno*/
	$_SESSION['ra'] = $retorno_login['ra'];
	$_SESSION['id'] = $retorno_login['aid']; //ID ALUNO
	
	header('Location: welcome.php');
	exit();
} else {
	$_SESSION['nao_autenticado'] = true;
	header('Location: index.php');
	exit();
}
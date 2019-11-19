<?php include 'header.php'; 

echo "<br>primeira resposta -> ".$_POST['questao1'];
echo "<br>segunda resposta -> ".$_POST['questao2'];
echo "<br>terceira resposta -> ".$_POST['questao3'];
echo "<br>quarta resposta -> ".$_POST['questao4'];
echo "<br>quinta resposta -> ".$_POST['questao5'];
echo "<br>sexta resposta -> ".$_POST['questao6'];


$q1 = $_POST['questao1'];
$q2 = $_POST['questao2'];
$q3 = $_POST['questao3'];
$q4 = $_POST['questao4'];
$q5 = $_POST['questao5'];
$q6 = $_POST['questao6'];


$atc1 = $_POST['alternativa_correta1'];
$atc2 = $_POST['alternativa_correta2'];
$atc3 = $_POST['alternativa_correta3'];
$atc4 = $_POST['alternativa_correta4'];
$atc5 = $_POST['alternativa_correta5'];
$atc6 = $_POST['alternativa_correta6'];

echo "<br>Alternativas corretas<br>";

echo "<br>".$atc1;
echo "<br>".$atc2;
echo "<br>".$atc3;
echo "<br>".$atc4;
echo "<br>".$atc5;
echo "<br>".$atc6;



$nota=0;

if($q1==$atc1){
    $nota++;
}
if($q2==$atc2){
    $nota++;
}

if($q3==$atc3){
    $nota++;
}

if($q4==$atc4){
    $nota++;
}

if($q5==$atc5){
    $nota++;
}

if($q6==$atc6){
    $nota++;
}

echo "<br><br>Nota do aluno: ".$nota;
?>




<?php include 'footer.php'; ?>
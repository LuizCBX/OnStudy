<?php include 'header.php'; 


$idcurso = $_POST['id_curso'];
$idaluno = $_SESSION['id'];

?>
    <div class="back">Correção avaliação</div>
    
<?php

echo "<br><label class=nota>Suas respostas</label><br>";
echo "<div class=\"nota\">";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao1']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao2']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao3']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao4']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao5']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao6']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao7']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao8']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao9']."</button>";
echo "<button type=\"button\" class=\"btn btn-secondary\">".$_POST['questao10']."</button>";

echo "</div>";



$q1 = $_POST['questao1'];
$q2 = $_POST['questao2'];
$q3 = $_POST['questao3'];
$q4 = $_POST['questao4'];
$q5 = $_POST['questao5'];
$q6 = $_POST['questao6'];
$q7 = $_POST['questao7'];
$q8 = $_POST['questao8'];
$q9 = $_POST['questao9'];
$q10 = $_POST['questao10'];


$atc1 = $_POST['alternativa_correta1'];
$atc2 = $_POST['alternativa_correta2'];
$atc3 = $_POST['alternativa_correta3'];
$atc4 = $_POST['alternativa_correta4'];
$atc5 = $_POST['alternativa_correta5'];
$atc6 = $_POST['alternativa_correta6'];
$atc7 = $_POST['alternativa_correta7'];
$atc8 = $_POST['alternativa_correta8'];
$atc9 = $_POST['alternativa_correta9'];
$atc10 = $_POST['alternativa_correta10'];




echo "<br><br><hr><label class=nota>Respostas certas</label><br>";
$nota=0;

echo "<div class=\"nota\">";
if($q1==$atc1){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc1."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc1."</button>";
}

if($q2==$atc2){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc2."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc2."</button>";
}

if($q3==$atc3){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc3."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc3."</button>";
}

if($q4==$atc4){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc4."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc4."</button>";
}

if($q5==$atc5){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc5."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc5."</button>";
}

if($q6==$atc6){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc6."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc6."</button>";
}

if($q7==$atc7){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc7."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc7."</button>";
}

if($q8==$atc8){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc8."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc8."</button>";
}

if($q9==$atc9){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc9."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc9."</button>";
}

if($q10==$atc10){
    echo "<button type=\"button\" class=\"btn btn-success\">".$atc10."</button>";
    $nota++;
}else{
    echo "<button type=\"button\" class=\"btn btn-danger\">".$atc10."</button>";
}

echo "</div>";


$media=7;

if($nota >= 7){ //TESTE
    echo "<br><br><hr><label class='prova_a'> Você foi aprovado!</label>";
} else {
    echo "<br><br><hr><label class='prova_r'> Você foi reprovado!</label>";
}

echo "<br><label class='nota'>Nota do aluno: ".$nota."</label>";
?>

<div class='col-12 text-center mt-5'>
    <a href="painel.php"><button id='enviar' class='btn btn-info'>Voltar para home</button></a>
</div>

<?php
//INSERT
$alunos->setNota($nota, $idaluno,$idcurso);
?>



<?php include 'footer.php'; ?>
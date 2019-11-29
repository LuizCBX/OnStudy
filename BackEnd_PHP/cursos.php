<?php include 'header.php';
$cursoDoAluno = $alunos->getCursoPorId($_SESSION['id_usuario']);
?>

<div class="back">Cursos</div>


<div class="cards-list">


    <?php    while($linha = mysqli_fetch_assoc($cursoDoAluno))   {   ?>

    <a href=aula.php?id_curso=<?php echo $linha['id']?> >
    <div class="card 1">
        <div class="card_image"><img src="imagens/Bgcard.png"> </div>
        <div class="card_title title-white">
            <h1 class="h1_"><?php echo $linha['nome'] ?></h1>
            <p class="p_"><?php echo $linha['descricao'] ?></p>
            <p class="p_">Nota mínima: <?php echo $linha['nota_minima'] ?></p>
        </div>
    </div>
    </a>
    
    <?php
    }
    ?>


<?php include 'footer.php'; ?>
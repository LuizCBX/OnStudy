<?php include 'header.php';
$cursoDoAluno = $alunos->getAulaPorCurso($_GET['id_curso']);
?>

<div class="back">

    id do curso <?php echo $_GET['id_curso']; ?>
   
</div>
    <?php
        echo "<ol>";
            while($linha = mysqli_fetch_assoc($cursoDoAluno))   { 
            
                echo "<li>".$linha['aula']."</li>";

            }

        echo "</ol>";
    ?>
    


<?php include 'footer.php';?>

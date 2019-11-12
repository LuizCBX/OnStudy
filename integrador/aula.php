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
    
    <div>
        .card
	    .card-play
	    .card-video
		iframe#video(src="https://www.youtube.com/embed/JE9z-gy4De4?enablejsapi=1&html5=1&iv_load_policy=3&rel=0&showinfo=0", frameborder="0", allowfullscreen)
    <div>

<?php include 'footer.php';?>

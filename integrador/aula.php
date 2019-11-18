<?php include 'header.php';
$cursoDoAluno = $alunos->getAulaPorCurso($_GET['id_curso']);
?>


<script>
    function abrir(identificador){
        document.getElementById(identificador).style.display="block";
    }

    function fecharAula(fechada){
        document.getElementById(fechada).style.display="none";
    }

    

</script>



<div class="back">

    id do curso <?php echo $_GET['id_curso']; ?>
   
</div>
    <?php
        echo "<ol>";
            while($linha = mysqli_fetch_assoc($cursoDoAluno))   { 
    ?>          
                <br>
                <?php
                echo "<li><button class='btn btn-primary' onclick=abrir('aula".$linha['id']."');>".$linha['aula']
                
                ."</button></li>";

                
                echo "<div class='teste' id=aula".$linha['id']." style=\"display:none\">";
                echo $linha['descricao'];
                ?>

                <br>
                <?php
                echo $linha['url_video'];
                echo "</div>";

                
            

            }

        echo "</ol>";
    ?>




    <div>

        <!-- .card
	    .card-play
	    .card-video
		iframe#video(src="https://www.youtube.com/embed/JE9z-gy4De4?enablejsapi=1&html5=1&iv_load_policy=3&rel=0&showinfo=0", frameborder="0", allowfullscreen) -->
    <div>

<?php include 'footer.php';?>

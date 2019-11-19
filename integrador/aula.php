<?php include 'header.php';
$cursoDoAluno = $alunos->getAulaPorCurso($_GET['id_curso']);
?>

<style>

.teste{
    display:none;
    
}

</style>

<script>
    function abrir(identificador){
       var elemento = document.getElementById(identificador);

       if(elemento.style.display=="block"){
           elemento.style.display="none";
           
       }
       else{
            elemento.style.display="block";
           
       }
    }

    // function fecharAula(fechada){
    //     document.getElementById(fechada).style.display="none";
    // }

    

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

                
                echo "<div class='teste' id=aula".$linha['id'].">";
                echo $linha['descricao'];
                ?>

                <br>
                <?php
                echo $linha['url_video'];
                echo "</div>";

                
            

            }

        echo "</ol>";
    ?>


            <p>

            <a href=prova.php?id_curso=<?php echo $_GET['id_curso']; ?>>
            Realizar prova
            </a>

            </p>

    <div>

        <!-- .card
	    .card-play
	    .card-video
		iframe#video(src="https://www.youtube.com/embed/JE9z-gy4De4?enablejsapi=1&html5=1&iv_load_policy=3&rel=0&showinfo=0", frameborder="0", allowfullscreen) -->
    <div>

<?php include 'footer.php';?>

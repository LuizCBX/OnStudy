<?php include 'header.php';
$cursoDoAluno = $alunos->getAulaPorCurso($_GET['id_curso']);
$tituloCurso = $alunos->getCurso($_GET['id_curso']);
?>

<style>

.conteudo_curso{
    display:none;
    text-align: center;
}

p{
    text-align: justify;
    font-size: 1.5em;
    
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
   

</script>



<div class="back">

    <?php
        $curso = mysqli_fetch_assoc($tituloCurso);
        echo $curso['nome'];
    ?>
   
</div>
    <br>
    <p>
        <b>O curso está estruturado em N (N) aulas e cada aula é composta por 1 (um) conteúdo e 1 (um) vídeo.
        Após a realização das aulas, você poderá realizar a prova que será composto por 10 (dez) questões objetivas.
        Para aprovação sua nota precisar ser igual ou maior que 7,0 (sete).</b>
    </p>
    <?php
        echo "<ol>";
            while($linha = mysqli_fetch_assoc($cursoDoAluno))   { 
    ?>          

        <br>
        <?php
        echo "<li><button class='btn btn-primary' onclick=abrir('aula".$linha['id']."');>Aula ".$linha['aula']
        
        ."</button></li>";

        echo "<div class='conteudo_curso' id=aula".$linha['id'].">";
        echo $linha['descricao']."<br><hr> ";

        
        echo $linha['url_video']."<br><hr>";
        

        echo $linha['url_pdf'];


        echo "</div>";


        }

        echo "</ol>";
    ?>
        </a>

        <div class='col-12 text-center mt-5'>
            <a href=prova.php?id_curso=<?php echo $_GET['id_curso']; ?>>
                <button class="btn btn-success">Realizar avaliação</button>
        </div>
        

<?php include 'footer.php';?>

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
    /* o bloco abaixo modifica o comportamento do CSS para telas
com tamanho de até 480px */
@media screen and (max-width: 480px){
    .conteudo_curso{
        display:none;
        text-align: center;
    }

    p{
        text-align: justify;
        font-size: 15px;
    }
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
        echo "<br><hr><b><p>Descrição</b><br>".$linha['descricao']."</p><br><hr> ";

        
        echo "<p><b>Vídeo Aula</b><br></p>".$linha['url_video']."<br><hr>";
        

        echo "<p><b>Web Aula</b><br></p>".$linha['url_pdf']."<br><hr>";


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

<?php include 'header.php';
$tituloCurso = $alunos->getCurso($_GET['id_curso']);
$questoesAlternativas = $alunos->getQuestoes($_GET['id_curso']);
?>
<style>
#borda {
  border-radius: 25px;
  background: #73AD21;
  padding: 20px;
  width: 200px;
  height: 150px;
}
</style>

<div class="back">

    <?php
   
    $linha = mysqli_fetch_assoc($tituloCurso);
    echo "Avaliação de ".$linha['nome'];

    ?>

</div>

    <form action="corrigir.php" method="POST">
        <?php
            $questao = 1;
            echo "<ol>";
            while($linha = mysqli_fetch_assoc($questoesAlternativas)){
                echo "<br><li> ) ";
                echo $linha['descricao'];
                echo "</li>";

                echo "a. <input type=radio name=questao".$questao." value='a'> ".$linha['alternativa_a']."<br>";
              

                echo "b. <input type=radio name=questao".$questao." value='b'> ".$linha['alternativa_b']."<br>";
               

                echo "c. <input type=radio name=questao".$questao." value='c' required> ".$linha['alternativa_c']."<br>";
               
               
                echo "d. <input type=radio name=questao".$questao." value='d'> ".$linha['alternativa_d']."<br>";
             
             
                echo "e. <input type=radio name=questao".$questao." value='e'> ".$linha['alternativa_e']."<br>";
               
               
                echo "<input type=hidden name=alternativa_correta".$questao." value=".$linha['alternativa_correta']."><br>";
              
              
                echo "<hr>";
                
                echo "<input type=hidden name=id_curso value=".$linha['id_curso']."><br>";



                $questao++;
            }
            echo "</ol>";

                
        ?>  
        <div class='col-12 text-center mt-5'>
            <button id='enviar' class='btn btn-info'>Enviar avaliação</button>
        </div>
                   
    </form>

    <!-- <script src="jquery-2.1.4.min.js"></script>
    <script src="jquery.validate.min.js"></script>
    <script>
            $(function(){
                $("#enviar").validate();
            });
    </script> -->





    <script>
    
    // let alternativa = null
    // const totalQuestoes = $(['questao']).length


    // $(".alternativa").click(function(elements) {

    // const parents = $(elements.target).parents("[questao]")
    // $(parents).find("button").removeClass("alternativa-escolhida")
    // e = elements.target
    // e.classList.add("alternativa-escolhida")
    // alternativa = e.innerText;

    // })

    // $("#enviar").click(function(event) {
    //     event.preventDefault()

    //     totalQuestoesResp = $(".alternativa-escolhida").length
    //     if (totalQuestoes == totalQuestoesResp) {

    //         $("[questao]")
    //         $.post( "prova.php", { name: "John", time: "2pm" })
    //         .done(function( data ) {
    //             alert( "Data Loaded: " + data );
    //         });
    //     }
    //     else {
    //         alert("RESPONDA TODAS AS QUESTOES")
    //     }
    // })

    </script>



<?php include 'footer.php';?>

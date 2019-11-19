<?php include 'header.php';
$tituloCurso = $alunos->getCurso($_GET['id_curso']);
$questoesAlternativas = $alunos->getQuestoes($_GET['id_curso']);
?>


<div class="back">

    <?php
   
    $linha = mysqli_fetch_assoc($tituloCurso);
    echo $linha['nome'];

    ?>

</div>

    <form action="corrigir.php" method="POST">
        <?php
            $questao = 1;
            echo "<ol>";
            while($linha = mysqli_fetch_assoc($questoesAlternativas)){
                echo "<li> ) ";
                echo $linha['descricao'];
                echo "</li>";
                echo "a. <input type=radio name=questao".$questao." value='a'> ".$linha['alternativa_a']."<br>";
                echo "b. <input type=radio name=questao".$questao." value='b'> ".$linha['alternativa_b']."<br>";
                echo "c. <input type=radio name=questao".$questao." value='c'> ".$linha['alternativa_c']."<br>";
                echo "d. <input type=radio name=questao".$questao." value='d'> ".$linha['alternativa_d']."<br>";
                echo "e. <input type=radio name=questao".$questao." value='e'> ".$linha['alternativa_e']."<br>";
                echo "<input type=hidden name=alternativa_correta".$questao." value=".$linha['alternativa_correta']."><br>";
                echo "<hr>";
                $questao++;
            }
            echo "</ol>";

                
        ?>  
        <div class='col-12 text-center mt-5'>
                <button id='enviar' class='btn btn-info'>Enviar</button>
            </div>
                   
    </form>



    <script>
    
    // let alt_a = $linha['alternativa_a'], alt_b = $linha['alternativa_b'], alt_c = $linha['alternativa_c'], alt_d = $linha['alternativa_d'], alt_e = $linha['alternativa_e']; 

    // $("#enviar").click(function(event) {
    //     event.preventDefault()






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

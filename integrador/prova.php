<?php

include_once 'header.php';
include_once 'Controller/AvaliacaoController.php';



var_dump($_POST);

$nAvaliacao = $_GET['avaliacao']?? $_GET['avaliacao'];
$avaliacaoC = new AvaliacaoController();
if (!empty($nAvaliacao)) {
    $id = $_SESSION['id_usuario'];
    $res = $avaliacaoC->iniciarAvaliacao($id, $nAvaliacao);
    
    $cont = 1;
}
else {

}

?>
<h2>Prova de :: <?= $avaliacaoC->getData_av() ?></h2>

<style>
    .alternativa-descricao {
        color: black;
    }

    .alternativa {
        width: 50px;
        height: 50px;
        display: block;
    }

    .alternativa:hover, .alternativa-escolhida {
        color: white;
        border: none;
        background-color: green !important;
    }

</style>
<hr>
<form action="" method="POST">
    <?php foreach($res as $questao): ?>
    <section class="mt-5">
        <div>
        
            <span id="" class="m-3"><strong>Questão <?= $cont ?></strong></span>
            <p class="m-3">
                <?= $questao['descricao'] ?>
            </p>
            
        </div>
        <div questao="<?= $cont ?>" >
            <div class="input-group col-12 mt-3">

                <div class="input-group-text">            
                    <input type="radio" name="questao-<?= $cont ?>" value="A" required> A
                </div>
                <div class="">
                    <p class="alternativa-descricao  col-12">
                        <?= $questao['alternativa_a'] ?>
                    </p>
                </div>
                
            </div>
            <div class="input-group col-12 mt-2">

                <div class="input-group-text">            
                    <input type="radio" name="questao-<?= $cont ?>" value="B"> B
                </div>
                <div class="">
                    <p class="alternativa-descricao  col-12">
                        <?= $questao['alternativa_b'] ?>
                    </p>
                </div>

            </div>
            <div class="input-group col-12 mt-2">

                <div class="input-group-text">            
                    <input type="radio" name="questao-<?= $cont ?>" value="C"> C
                </div>
                <div class="">
                    <p class="alternativa-descricao  col-12">
                        <?= $questao['alternativa_c'] ?>
                    </p>
                </div>
                
            </div>
            <div class="input-group col-12 mt-2">

                <div class="input-group-text">            
                    <input type="radio" name="questao-<?= $cont ?>" value="D"> D
                </div>
                <div class="">
                    <p class="alternativa-descricao  col-12">
                        <?= $questao['alternativa_d'] ?>
                    </p>
                </div>
                
            </div>
            <div class="input-group col-12 mt-2">

                <div class="input-group-text">            
                    <input type="radio" name="questao-<?= $cont ?>" value="E"> E
                </div>
                <div class="">
                    <p class="alternativa-descricao  col-12">
                        <?= $questao['alternativa_e'] ?>
                    </p>
                </div>
                
            </div>
        
        </div>
    </section>
    <?php 

    $cont++;

    endforeach; 
    ?>

    <div class="col-12 text-center mt-5">
        <button id="enviar" class="btn btn-info">Enviar</button>
    </div>
</form>



<?php include 'footer.php'; ?>

<script>
    
    let alternativa = null
    const totalQuestoes = $("[questao]").length


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


    $(".alternativa").click(function(elements) {

        const parents = $(elements.target).parents("[questao]")
        $(parents).find("button").removeClass("alternativa-escolhida")
        e = elements.target
        e.classList.add("alternativa-escolhida")
        alternativa = e.innerText;
        
    })




</script>

<?php include 'header.php'; ?>

<h1>Prova de :: 6/2019</h1>

<style>
    .alternativa-descricao {
        color: black;
        background-color: white !important;
        pointer-events: none;
        touch-action: none;
    }

    .alternativa {
        width: 50px;
        display: block;
    }

    .alternativa:hover, .alternativa-escolhida {
        color: white;
        border: none;
        background-color: green !important;
    }

</style>
<hr>
<section>
    <span id="" class="m-3"><strong>Questão - 1</strong></span>
    <p class="m-3">
        O que é Lorem Ipsum?
    </p>
    <div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-a" class="input-group-text alternativa">A</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao " aria-label="Input text com bot�o radio " value="ALTERNATIVA A">
            
        </div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-b" class="input-group-text alternativa">B</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao" aria-label="Input text com bot�o radio " value="       ">

        </div>
        <div class="input-group col-12">

            <div class="input-group col-2">
                <button id="alternativa-c" class="input-group-text alternativa">C</button>
            </div>
            <div class="col-6">
                <p class="alternativa-descricao">
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Est, laudantium doloremque 
        laboriosam nam architecto, mollitia cum tempore odit numquam illo temporibus corrupti 
        cupiditate aperiam velit veniam tempora rerum doloribus nesciunt.
                </p>
            </div>

        </div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-d" class="input-group-text alternativa">D</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao" aria-label="Input text com bot�o radio " value="ALTERNATIVA D">

        </div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-b" class="input-group-text alternativa">E</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao" aria-label="Input text com bot�o radio " value="ALTERNATIVA E">

        </div>
    </div>
</section>

<nav class="col-12 text-center mt-5">
    <button id="anterior" class="btn btn-info">Anterior</button>
    <button id="proxima" class="btn btn-info">Próxima</button>
</nav>



<?php include 'footer.php'; ?>

<script>
    
    let alternativa = null

    const numQuestaoAtual = 1
    const numTotalQuestao = 10
    
    $(document).ready(function () {
        if (numQuestaoAtual == 1) {
            $("#anterior").prop("disabled", true)
        }

        if (numQuestaoAtual == numTotalQuestao) {
            $("#proxima").prop("disabled", true)
        }

    })
        


    $(".alternativa").click(function(elements) {

        $(".alternativa").removeClass("alternativa-escolhida")
        e = elements.target
        e.classList.add("alternativa-escolhida")
        alternativa = e.innerText;
        
    })




</script>

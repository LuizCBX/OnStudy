<?php //include 'header.php'; ?>
<h1>Prova de :: 6/2019</h1>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<style>
    .alternativa-descricao {
        color: black;
        background-color: white !important;
        display: black;        
        pointer-events: none;
        touch-action: none;
    }

    .alternativa {
        width: 50px;
        display: block;
    }

    .alternativa:hover {
        color: white;
        border: none;
        background-color: green;
    }

    /* section > div > div  * {
        color: white;
        border: none;
        background-color: green !important;
    } */
</style>
<hr>
<section>
    <span class="m-3"><strong>Questão - 1</strong></span>
    <p class="m-3">
        Lorem ipsum dolor sit amet consectetur adipisicing elit. Est, laudantium doloremque 
        laboriosam nam architecto, mollitia cum tempore odit numquam illo temporibus corrupti 
        cupiditate aperiam velit veniam tempora rerum doloribus nesciunt.
    </p>
    <div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-a" class="input-group-text alternativa">A</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao " aria-label="Input text com botão radio " value="ALTERNATIVA A">
            
        </div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-b" class="input-group-text alternativa">B</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao" aria-label="Input text com botão radio " value="ALTERNATIVA B">

        </div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-c" class="input-group-text alternativa">C</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao" aria-label="Input text com botão radio " value="ALTERNATIVA C">

        </div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-d" class="input-group-text alternativa">D</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao" aria-label="Input text com botão radio " value="ALTERNATIVA D">

        </div>
        <div class="input-group col-12">

            <div class="input-group-prepend">
                <button id="alternativa-b" class="input-group-text alternativa">E</button>
            </div>
            <input type="text" readonly class="form-control alternativa-descricao" aria-label="Input text com botão radio " value="ALTERNATIVA E">

        </div>
    </div>
</section>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
<script>

</script>
<?php include 'footer.php'; ?>

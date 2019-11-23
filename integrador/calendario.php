<?php include 'header.php';?>


    <div class="back">Calendário/Eventos</div>

    <div class="custom-control custom-radio">
  <input type="radio" id="customRadio1" name="customRadio" class="custom-control-input">
  <label class="custom-control-label" for="customRadio1">Toggle this custom radio</label>
</div>
<div class="custom-control custom-radio">
  <input type="radio" id="customRadio2" name="customRadio" class="custom-control-input">
  <label class="custom-control-label" for="customRadio2">Or toggle this other custom radio</label>
</div>  
<span class="badge badge-secondary">New</span>


<div class="list-group">
  <a href="#" class="list-group-item">First item</a>
  <a href="#" class="list-group-item">Second item</a>
  <a href="#" class="list-group-item">Third item</a>
</div>



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

<?php include 'footer.php';?>
<?php include 'header.php';?>  

<div class="back">Cursos</div>


<div class="cards-list">
  
    <a href="aula.php">
    <div class="card 1">
        <div class="card_image">  </div>
        <div class="card_title title-white">
            <h1><?php echo $_SESSION['nome'] ?></h1>
            <p><?php echo $_SESSION['descricao'] ?></p>
        </div>
    </div>
    </a>
    
    <a href="aula.php">
    <div class="card 1">
        <div class="card_image">  </div>
        <div class="card_title title-white">
            <h1><?php echo $_SESSION['nome'] ?></h1>
            <p><?php echo $_SESSION['descricao'] ?></p>
        </div>
    </div>
    </a>
</div>



<?php include 'footer.php'; ?>
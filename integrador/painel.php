<?php
session_start();
include('conexao.php');

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
    <link rel="stylesheet" href="css/nav.css">  
    <title>Home - OnStudyOff</title>
</head>
<body>

    <div id="wrapper" class="active">  
        <!-- Sidebar -->
                <!-- Sidebar -->
        <div id="sidebar-wrapper">
            <ul id="sidebar_menu" class="sidebar-nav">
                <li class="sidebar-brand"><a id="menu-toggle" href="#">Menu<span id="main_icon" class="glyphicon glyphicon-home"></span></a></li>

            </ul>
            <ul class="sidebar-nav" id="sidebar">
                <li><a href="#">Cursos<span class="glyphicon glyphicon-briefcase"></span></a></li>
                <li><a href="#">Provas<span class="glyphicon glyphicon-calendar"></span></a></li>
                <li><a href="#">Notas<span class="glyphicon glyphicon-signal"></span></a></li>
                <li><a href="logout.php">Sair<span class="glyphicon glyphicon-off"></span></a></li>
            </ul>
        </div>
            
        <!-- Page content -->
        <div id="page-content-wrapper">
            <!-- Keep all page content within the page-content inset div! -->
            <div class="page-content inset">
                <div class="row">
                <div class="col-md-12">
                <p class="well lead">Cadastro de Cliente</p>
                <div class="container">
                    <div class="row"> <!-- div da esquerda -->
                    <h2>Olá, <?php echo $_SESSION['usuario'];?></h2>
                        <h2><a href="logout.php">Sair</a></h2>
                    </div>
                        
 
                        </div> <!-- fim div da direita -->
                    </div> <!-- fim div da esquerda -->
                </div>

                </div>
            </div>
            </div>
        </div>
        
    </div>




    
    <script src="js/nav.js">
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>
</html>


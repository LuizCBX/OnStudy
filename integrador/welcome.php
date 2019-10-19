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
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <meta http-equiv="refresh" content="5 ;url=painel.php"> <!-- Vai para outra tela apos 5 segundos-->
    <link rel="stylesheet" type="text/css" href="css/style.css">

    <title>Bem vindo!</title>
    <style>
        .imgHome {
            width: 100%;
            text-align: center;
        }

        .titulo {
            margin-top: 40px;
            text-align: center;
            color: blue;
        }
        .logo{
            text-align: center;
            font-size: 10.0em;
        }
    </style>

</head>

<body>
    <div class="container">
        <h1 class="titulo">Bem vindo, <?php echo $_SESSION ['usuario']; ?></h1>
        <h2 class="titulo">Aproveite a cada momento!</h2>


        <div class="imgHome">
            <img src="imagens/loading1.gif">
        </div>

        <h1 class="logo">OnStudyOff</h1>
    </div>



    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
</body>

</html>
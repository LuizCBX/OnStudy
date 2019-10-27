<?php

if (!isset($_SESSION['usuario']) && !isset($_SESSION['nome'])) {
    header('Location: index.php');
    die();
} 
<?php

$numero = $_GET['numero'];

for($i = 1; $i <=10; $i++){
    $resultado = $numero * $i;
    echo "$numero X $i = $resultado<br>";
}

?>
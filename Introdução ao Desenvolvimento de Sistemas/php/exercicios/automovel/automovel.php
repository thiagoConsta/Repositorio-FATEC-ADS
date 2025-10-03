<?php
$distancia = $_GET['distancia'];
$combustivel = $_GET['combustivel'];

$consumoMedio = $distancia / $combustivel;

echo $consumoMedio;

?>
<?php
$distanciaCombustivel = $_GET['distanciaCombustivel'];
$combustivelCarro = $_GET['combustivelCarro'];

$consumoMedio = $distanciaCombustivel / $combustivelCarro;

echo "O consumo médio do carro é: " . $consumoMedio;

?>
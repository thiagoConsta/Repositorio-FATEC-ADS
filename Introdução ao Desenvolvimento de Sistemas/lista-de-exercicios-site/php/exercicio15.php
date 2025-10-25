<?php
$largura = $_GET["largura"];
$comprimento = $_GET["comprimento"];

$area = $largura * $comprimento;
$potencia = $area * 18;

echo "Sua área é: " . $area . "<br>"; 
echo "Sua poência é: " . $potencia;
?>
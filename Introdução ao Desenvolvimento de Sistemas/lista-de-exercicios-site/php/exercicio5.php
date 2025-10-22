<?php
$salarioAtual = $_GET["salarioAtual"];
$percentualAumento = $_GET["percentualAumento"];

$salarioReajuste = $salarioAtual * ($percentualAumento / 100);
$novoSalario = $salarioAtual + $salarioReajuste;

echo "Seu novo salário é: " . $novoSalario;
?>
<?php
$h = $_GET["h"];
$salarioMin = $_GET["salarioMin"];

$valorHora = $salarioMin /2;
$salarioBruto = $h * $valorHora;
$imposto = $salarioBruto * 0.03;
$s = $salarioBruto - $imposto;

echo "Salário a receber: " ."R$".$s . ".";

?>
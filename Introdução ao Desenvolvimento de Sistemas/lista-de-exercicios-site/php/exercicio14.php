<?php
$salario = (float) $_GET["salario"];
$conta1 = (float) $_GET["conta1"];
$conta2 = (float) $_GET["conta2"];

$resto = $salario - ($conta1*1.02 + $conta2*1.02);
echo "O resto do seu salário é: " . $resto;

?>
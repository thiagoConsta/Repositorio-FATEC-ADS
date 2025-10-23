<?php
$custo = $_GET["custo"];
$convite = $_GET['convite'];

$qtde = $custo / $convite;

echo "A quantidade de convites que devem ser vendidos para alcançar o custo do espetáculo é: " . $qtde;
?>
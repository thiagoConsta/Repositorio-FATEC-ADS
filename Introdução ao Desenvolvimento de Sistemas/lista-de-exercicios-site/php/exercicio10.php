<?php
$peso = (float) $_GET["peso"];
$consumo1 = (float) $_GET["consumo1"];
$consumo2 = (float) $_GET["consumo2"];

$pesoG = $peso * 1000;

$consumoTotal = 5*($consumo1 + $consumo2);

$resto = $pesoG - $consumoTotal;

echo "O consumo de ambos os gatos por dia foi " . $consumoTotal." gramas, " . "sobrando " . $resto . " gramas no saco de ração.";

?>
<?php
$peso = (float) $_GET["peso"];

$pesoengordar = $peso + ($peso * 0.15);
$pesoemagrecer = $peso - ($peso * 0.20);

echo "Seu peso se você engordar 15%: " . $pesoengordar . "<br>";
echo "Seu peso se você emagrecer 20% sobre o peso digitado: " . $pesoemagrecer;
?>
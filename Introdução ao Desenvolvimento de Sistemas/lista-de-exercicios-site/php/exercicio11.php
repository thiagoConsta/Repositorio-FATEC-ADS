<?php
$n1 = $_GET["n1"];
$n2 = $_GET["n2"];
$n3 = $_GET["n3"];

$m = (2*$n1 + 3*$n2 + 5*$n3) / (2+3+5);

echo "A média desse aluno é: " . $m;
?>
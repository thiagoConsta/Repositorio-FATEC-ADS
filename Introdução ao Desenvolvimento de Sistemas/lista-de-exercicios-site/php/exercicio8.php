<?php
$c1 = $_GET["c1"];
$c2 = $_GET["c2"];

$hip = ($c1 * $c1 + $c2 * $c2) ** (1/2);

echo "Hipotenusa: " . $hip;
?>
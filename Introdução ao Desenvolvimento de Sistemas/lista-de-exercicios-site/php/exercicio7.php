<?php
$segundos = (int) $_GET["segundos"];

$minutos = intdiv($segundos, 60);
$seg = $segundos % 60;

echo "Minutos = ". $minutos . "<br>";
echo "Segundos = ". $seg;
?>
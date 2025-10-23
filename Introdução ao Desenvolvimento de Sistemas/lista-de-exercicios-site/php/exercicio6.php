<?php
$anoAtual = $_GET["anoAtual"];
$anoNascimento = $_GET["anoNascimento"];

$idadeh = $anoAtual - $anoNascimento;
$idadef = 2025 - $anoNascimento;

echo "Sua idade atualmente é: " . $idadeh . "<br>";
echo "Em 2025 a você terá: " . $idadef;
?>
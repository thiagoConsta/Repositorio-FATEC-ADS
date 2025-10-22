<?php
$tamanhoArquivo = $_GET["tamanhoArquivo"];
$velocidadeConexao = $_GET["velocidadeConexao"];

$download = $tamanhoArquivo / $velocidadeConexao;

echo "Tempo de download necessário: " . $download;

?>
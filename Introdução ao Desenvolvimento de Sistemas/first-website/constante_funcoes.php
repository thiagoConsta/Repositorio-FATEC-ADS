<?php

// constante diferente da variavel, para declarar ela é necessário usar "define("")"
// como forma de paronizar as constantes sao declaradas em MAISCULO

// define("NOME_DA_CONSTANTE_EM_MAISCULO"), "Valor da constante"
define("NOME", "Thiago");

// para imprimir uma constante basta colocar seu nome no comando de saída
echo NOME;

const SOBRENOME = "Ribeiro";

echo "<br>" . SOBRENOME;

// declarando uma função (sem paramêtro)
function dizerOla(){
    echo "<br>" . "Olá, mundo";
}

// chamando a função
dizerOla();

echo "<br><br>";


// declarando uma função (c/ paramêtro)
function saudacao($nome){
    echo "Olá, $nome!";
}
// chamando a funcao com passagem de parâmetro
saudacao("Iae caramba");
saudacao("Boa pa nois");

echo "<br><br>";

// declarar uma função que retorna um valor
function soma($num1, $num2){
    return $num1 + $num2;
}

// funcoes que tem retorno de valor tem que abrigar dentro de uma variavel
$resultado = soma(1,9);

echo "A soma da função é: $resultado";

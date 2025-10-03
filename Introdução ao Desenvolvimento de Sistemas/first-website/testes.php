<?php

    //Recuperando as informações eviadas pelo formulário

    //1° Declara a várivel
    //$num1
    //2° Informar qual é o method de emnvio GET ou POST
    //GET['Informar o campo name do formulário']

    $num1 = $_GET['num1'];
    $num2 = $_GET['num2'];
    $operacao = $_GET['operacao'];

    if($operacao == "sum"){
        $resultado = $num1 + $num2;
        echo $resultado;
    }
    elseif ($operacao == "mult") {
        $resultado = $num1 * $num2;
        echo $resultado;
    }
    elseif ($operacao == "div") {
        $resultado = $num1 / $num2;
        echo $resultado;
    }
    elseif ($operacao == "sub") {
        $resultado = $num1 - $num2;
        echo $resultado;
    }
    else{
        echo "Deu erro!";
    }






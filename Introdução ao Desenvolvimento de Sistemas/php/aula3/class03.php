<?php

// laços de repetição

// maneiras de usar o for, com o final "endfor" ou usando chaves

// for($i = 1; $i <= 10; $i++):
// echo $i;


// endfor;

// for($i = 1; $i <= 10; $i++){
//     echo $i . "<br>";
// }


// for($i = 1; $i <= 10; $i++){
//     echo $i . "<br>"; 
//     // concatenar vc ".". para mencionar tags do html sempre colocar dentro de um ""
// }
// echo "<br><br>";

// usando while vc deve inicializar a variavel antes do laço

// declarando variável
// $i = 0;

// while ($i <=10){
//     $i++;
//     echo $i . "<br>"; 
// }

$numero = $_GET['numero'];

for($i = 1; $i <=10; $i++){
    $resultado = $numero * $i;
    echo "$numero X $i = $resultado<br>";
}

// for($i = 1; $i <=10; $i++){
//     $resultado = $i * $i;
//     echo "$i x $i = $resultado<br>";
// }


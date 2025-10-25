<?php include("php/header.php") ?>
<div class="jumbotron text-center">
    <h1>Exercícios PHP</h1>
    <p>Pagina criada para treinar boas práticas e praticar linguagem PHP</p>
</div>

<div class="row">
    <div class="col-sm-4">
        <form action="php/exercicio1.php" method="get">
            <p>Exercicío 1 - Criar um algoritmo Para calcular o valor de Y como função de X, segunda a função y(x)=3x+2, em um domínio real.</p>
            <div class="form-group">
                <label for="valorX">Insira o valor do X:</label>
                <input class="form-control" type="text" name="valorX" id="valorX">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular função">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio2.php" method="get">
            <p>Exercicío 2 - Dados o tamanho de um arquivo (em bits), bem como a velocidade da conexão (em bits por segundo), informe o tempo necessário para o download do arquivo.</p>
            <div class="form-group">
                <label for="tamanhoArquivo">Entre com o tamanho do arquivo: </label>
                <input class="form-control" type="text" name="tamanhoArquivo" id="tamanhoArquivo">
            </div>
            <div class="form-group">
                <label for="velocidadeConexao">Entre com a velocidade de conexão: </label>
                <input class="form-control" type="text" name="velocidadeConexao" id="velocidadeConexao">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Verificar a velocidade do arquivo">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio3.php" method="get">
            <p>Exercicío 3 - Informe o consumo médio de um automóvel (medido em km/1), dado que são conhecidos a distância total percorrida e o volume de combustìvel para percorrê-la (medido em litros).</p>
            <div class="form-group">
                <label for="combustivelCarro">Informe o valor do combustível do automóvel: </label>
                <input class="form-control" type="text" name="combustivelCarro" id="combustivelCarro">
            </div>
            <div class="form-group">
                <label for="velocidadeCombustivel">Informe a velocidade do automóvel: </label>
                <input class="form-control" type="text" name="distanciaCombustivel" id="velocidadeCombustivel">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Verificar o consumo do automóvel">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio4.php" method="get">
            <p>Exercicío 4 - Criar um algoritmo que leia o saldo de uma aplicação e imprimir o novo saldo, considerando um reajuste de 15%.</p>
            <div class="form-group">
                <label for="saldo">Informe o saldo da sua aplicação para reber um reajuste: </label>
                <input class="form-control" type="text" name="saldo" id="saldo">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Realizar reajuste">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio5.php" method="get">
            <p>Exercicío 5 - Criar um algoritmo que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.</p>
            <div class="form-group">
                <label for="salarioAtual">Informe o seu salário: </label>
                <input class="form-control" type="text" name="salarioAtual" id="salarioAtual">
            </div>
            <div class="form-group">
                <label for="percentualAumento">Informe o seu percentual de aumento: </label>
                <input class="form-control" type="text" name="percentualAumento" id="percentualAumento">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular novo salário">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio6.php" method="get">
            <p>Exercicío 6 - Criar um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: <br> - A idade desta pessoa hoje; <br> - A idade desta pessoa em 2025;</p>
            <div class="form-group">
                <label for="anoAtual">Informe o ano atualmente: </label>
                <input class="form-control" type="text" name="anoAtual" id="anoAtual">
            </div>
            <div class="form-group">
                <label for="anoNascimento">Informe o seu ano de nascimento: </label>
                <input class="form-control" type="text" name="anoNascimento" id="anoNascimento">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio7.php" method="get">
            <p>Exercicío 7 - Criar um algoritmo que converta em minutos e segundos.</p>
            <div class="form-group">
                <label for="anoAtual">Informe o tempo em segundos: </label>
                <input class="form-control" type="text" name="segundos" id="segundos">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Converter">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio8.php" method="get">
            <p>Exercicío 8 - Criar um algoritmo que dadis dius kadis de um triângulo retÂngulo calcule e exiba a respectiva hipotenusa.</p>
            <div class="form-group">
                <label for="c1">Cateto oposto: </label>
                <input class="form-control" type="text" name="c1" id="c1">
            </div>
            <div class="form-group">
                <label for="c2">Cateto adjacente: </label>
                <input class="form-control" type="text" name="c2" id="c2">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular hipotenusa">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio9.php" method="get">
            <p>Exercicío 9 - Criar um algoritmo que receba o npumero de horas trabalhadas e o valor do salário mínimo. Calcule e mostre o salário a receber seguindo as regras do documento que o professor mandou.</p>
            <div class="form-group">
                <label for="h">Apresente o número de horas trabalhadas: </label>
                <input class="form-control" type="text" name="h" id="h">
            </div>
            <div class="form-group">
                <label for="salarioMin">Apresente o salário mínimo: </label>
                <input class="form-control" type="text" name="salarioMin" id="salarioMin">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular salário a receber">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio10.php" method="get">
            <p>Exercicío 10 - Pedro comprou um saco de ração em quilos. Pedro possui dois gatos para quais fornece - resto do exercício no documento do professor (...)</p>
            <div class="form-group">
                <label for="peso">Coloque o peso do saco da ração: </label>
                <input class="form-control" type="text" name="peso" id="peso">
            </div>
            <div class="form-group">
                <label for="consumo1">Quantidade fornecidade para gato 1 por dia: </label>
                <input class="form-control" type="text" name="consumo1" id="consumo1">
            </div>
            <div class="form-group">
                <label for="consumo2">Quantidade fornecidade para gato 2 por dia: </label>
                <input class="form-control" type="text" name="consumo2" id="consumo2">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Sobra da ração em 5 dias">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio11.php" method="get">
            <p>Exercicío 11 - Faça um algoritmo que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é pondera e que o peso das notas é: 2, 3 e 5, respectivamente.</p>
            <div class="form-group">
                <label for="n1">Coloque a primeira nota: </label>
                <input class="form-control" type="text" name="n1" id="n1">
            </div>
            <div class="form-group">
                <label for="n2">Coloque a segunda nota: </label>
                <input class="form-control" type="text" name="n2" id="n2">
            </div>
            <div class="form-group">
                <label for="n3">Coloque a terceira nota: </label>
                <input class="form-control" type="text" name="n3" id="n3">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular média final">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio12.php" method="get">
            <p>Exercicío 12 - Faça um algoritmo que receba o custo de um espetáculo teatral e o preço do cinte deste espetáculo.</p>
            <div class="form-group">
                <label for="custo">Apresente o custo deste espetáculo: </label>
                <input class="form-control" type="text" name="custo" id="custo">
            </div>
            <div class="form-group">
                <label for="convite">Apresente o preço dos convites: </label>
                <input class="form-control" type="text" name="convite" id="convite">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular custo">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio13.php" method="get">
            <p>Exercicío 13 - Faça um algoritmo que receba o peso de uma pessoa em quilos. <br> Calcule e mostre: <br> a. O novo se a pessoa engordar 15% sobre o peso digitado. <br> b. O novo peso se a pessoa emagrecer 20% sobre o peso digitado.</p>
            <div class="form-group">
                <label for="custo">Digite seu peso em quilos: </label>
                <input class="form-control" type="text" name="peso" id="peso">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular pesos">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio14.php" method="get">
            <p>Exercicío 14 - João recebeu seu salário e precisa pagar duas contas que estão atrasadas, como as contas estão atrasadas, João terá que pagar a multa de 2% sobre cada conta. Faça um algoritmo que calcule e mostre o quanto restará do salário do João.</p>
            <div class="form-group">
                <label for="salario">Digite seu salário: </label>
                <input class="form-control" type="text" name="salario" id="salario">
            </div>
            <div class="form-group">
                <label for="conta1">Conta 1: </label>
                <input class="form-control" type="text" name="conta1" id="conta1">
            </div>
            <div class="form-group">
                <label for="conta2">Conta 2: </label>
                <input class="form-control" type="text" name="conta2" id="conta2">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular resto salário">
                </div>
            </div>
        </form>
    </div>

    <div class="col-sm-4">
        <form action="php/exercicio15.php" method="get">
            <p>Exercicío 15 - Sabe-se que para iluminar de maneira correta os cômodos de uma casa, para cada metro quadrado, deve-se usar 18W de potência. Faça um algoritmo que receba as duas dimensões de um cômodo (em metros). Calcule e mostre a sua área (em m2) e a potência de iluminação que deverá ser utilizada.</p>
            <div class="form-group">
                <label for="largura">Largura: </label>
                <input class="form-control" type="text" name="largura" id="largura">
            </div>
            <div class="form-group">
                <label for="comprimento">Comprimento: </label>
                <input class="form-control" type="text" name="comprimento" id="comprimento">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular potência de iluminação">
                </div>
            </div>
        </form>
    </div>



</div>
</div>


<?php include("php/footer.php") ?>
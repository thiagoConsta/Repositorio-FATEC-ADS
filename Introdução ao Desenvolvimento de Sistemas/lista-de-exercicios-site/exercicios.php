<?php include("php/header.php") ?>
<div class="jumbotron text-center">
    <h1>My First Bootstrap Page</h1>
    <p>Resize this responsive page to see the effect!</p>
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
        <form action="php/exercicio5.php" method="get">
            <p>Exercicío 6 - Criar um algoritmo que receba o ano de nascimento de uma pessoa e o ano atual, calcule e mostre: <br> - A idade desta pessoa hoje; <br> - A idade desta pessoa em 2025;</p>
            <div class="form-group">
                <label for="idade">Informe a sua idade atualmente: </label>
                <input class="form-control" type="text" name="idadeNascimento" id="idadeNascimento">
            </div>
            <div class="form-group">
                <label for="anoNascimento">Informe o seu ano de nascimento: </label>
                <input class="form-control" type="text" name="anoNascimento" id="anoNascimento">
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="submit" value="Calcular idade">
                </div>
            </div>
        </form>
    </div>

    



</div>
</div>


<?php include("php/footer.php") ?>
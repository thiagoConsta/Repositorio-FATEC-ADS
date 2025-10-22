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

    


</div>
</div>


<?php include("php/footer.php") ?>
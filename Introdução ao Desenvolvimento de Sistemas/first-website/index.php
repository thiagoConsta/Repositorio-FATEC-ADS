<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h1>Calculadora XXX TRENTATION</h1>
    <form action="testes.php" method="get">
        <label for="num1">Número 1: </label>
        <input type="text" name="num1" id="num1"><br><br>
        <label for="num2">Número 2</label>
        <input type="text" name="num2" id="num2"><br><br>

        <label for="operacao">Selecione a operação matemática</label>
        <select name="operacao" id="operacao">
            <option value="sum">Somar</option>
            <option value="sub">Subtração</option>
            <option value="mult">Multiplicação</option>
            <option value="div">Divisão</option>
        </select>

        <input type="submit" value="Calcular">
    </form>
</body>
</html>
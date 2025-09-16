#4. Faça um algoritmo que determine o grau de obesidade de uma pessoa, 
# sendo fornecido o peso e a altura da pessoa. O grau de obesidade é determinado
# pelo índice da massa corpórea (Massa = Peso / Altura2 ), conforme ilustrado na tabela abaixo.

peso = float (input("Digite o seu peso: "))
altura = float (input("Digite a sua altura: "))
massa = peso/altura**2

print(massa)

if massa < 26:
    print("Peso normal em relação ao peso e altura")
elif 26>massa<30:
    print("Peso obeso em relação ao peso e altura")
else:
    print("Peso obeso mórbido em relação ao peso e altura")
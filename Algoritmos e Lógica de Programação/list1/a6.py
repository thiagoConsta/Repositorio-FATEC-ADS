# Faça um algoritmo que leia o peso e a altura de uma pessoa, calcule o indice de massa corporal (IMC) e exiba o resultado. 
# Para calcular, use a fórmula: peso/(altura * altura). Em seguida, faça a codificação em Python.

peso = float (input("Digite o seu peso: "))
altura = float (input("Digite a sua altura: "))

imc = peso/(altura * altura)

print("O seu indice de massa corporal (IMC) é: ",imc)
#2. Faça um algoritmo que leia um número inteiro e mostre uma mensagem indicando se este
# número é par ou ímpar e se é positivo ou negativo.

n1 = int(input("Digite algum número para saber se o mesmo é ímpar ou par "))

if n1 % 2:
    print(n1,"é impar.")
else:
    print(n1,"é par.")
    
if n1 >= 0:
    print(n1,"é positivo.")
else:
    print(n1," é negativo.")
#1. Faça um algoritmo que leia dois números e apresente-os em ordem crescente. 
# Use estrutura de desvio condicional simples.
print("Apresente dois números pra saber a ordem crescente")
n1 = int(input("Digite o primeiro número:"))
n2 = int(input("Digite o segundo número:"))

if n1 >= n2:
    print("A ordem crescente é: ",n1,n2)
else:
    print("A ordem crescente é: ",n2,",",n1)
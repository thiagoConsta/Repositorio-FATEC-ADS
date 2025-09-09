#Acrescentar no algoritmo anterior uma verificação se a média é maior ou igual a 6 e 
# mostrar uma das mensagens: aprovado, reprovado. Em seguida, faça a codificação em Python.

n1 = float (input("Informe o primeiro número:"))
n2 = float (input("Informe o segundo número:"))
media = (n1+n2)/2

if media >= 6:
    print("Aprovado")
else:
    print("Reprovado")
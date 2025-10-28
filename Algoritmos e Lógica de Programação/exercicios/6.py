# 6. Ler um número inteiro e positivo e apresentar o seu fatorial (exemplo: o fatorial de 5! = 1*2*3*4*5 = 120).

numero = int (input("Apresente um número para saber "))
fatorial = 1

for i in range(1, numero + 1):
    fatorial *= i
    

print(f"O fatorial de {numero} é {fatorial}")
    
#3. Faça um algoritmo que calcule a média aritmética das 3 notas de um aluno e mostre, 
# além do valor da média, uma mensagem de "Aprovado", caso a média seja igual ou 
# superior a 6, ou a mensagem "Reprovado", caso contrário.

print('Digite dois números para saber a média aritmética e saber se o aluno foi aprovado ou não')
n1 = float (input("Informe o primeiro número:"))
n2 = float (input("Informe o segundo número:"))
n3 = float (input("Informe o terceiro número:"))
media = (n1+n2+n3)/3

if media >= 6:
    print("Aluno acima da média, aprovado!")
else:
    print("Aluno abaixo da média, reprovado!")
    
print("A média do aluno é: ",media)
#1. Faça um algoritmo que leia as 3 notas (N1, N2 e N3) de um aluno e calcule 
# a média final (MF) deste aluno. Considerar que a média é ponderada e que o 
# peso das notas é: 2, 3 e 5, respectivamente. Ou seja, MF = N1 * 0,2 + N2 * 0,3 + N3 *0,5.

n1 = int(input("Digite o primeiro número: "))
n2 = int(input("Digite o segundo número: "))
n3 = int(input("Digite o terceiro número: "))

mf = n1*0.2 + n2*0.3 + n3*0.5

print(mf)


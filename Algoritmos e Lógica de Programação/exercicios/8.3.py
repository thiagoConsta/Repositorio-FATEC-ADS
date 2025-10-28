# Crie um algoritmo que calcule o salário líquido de um funcionário, considerado:

# a) os dados do funcionário: nome, RG e telefone.

# b) salário bruto de R$ 6700,00

# c) descontos de R$ 500,00

nome = str(input("Digite o seu nome: "))
rg = int(input("Digite o seu RG: "))
telefone = int(input("Digite seu telefone: "))
salario = 6700
descontos = 500
salarioLiquido = salario - descontos

print("Nome: ", nome)
print("RG: ", rg)
print("Telefone: ", telefone)
print("Salário Liquido: ", salarioLiquido)
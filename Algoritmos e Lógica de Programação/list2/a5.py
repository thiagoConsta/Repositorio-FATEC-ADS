# 5. Na lanchonete “DeliciososLanches”, o atendente precisa anotar o nome dos 
# clientes e a quantidade de cada item do menu (vide tabela abaixo) que ele vai pedir. 
# Faça um programa que o auxilie, ler os dados necessários e que exiba o nome do cliente e o total da compra.

quantidade = 0
preco = 0
total = 0.0
total_geral = 0.0

nomes = []

nome = input("Bem vindo ao ParaLanches, digite seu nome: ")

parada = 1
while parada != 0:    
    print("Código 1: Hot dog R$ 11,20")
    print("Código 2: Hamburguer R$ 16,60")
    print("Código 3: Cheeseburguer R$ 22,00")
    print("Código 4: Refrigerante em lata R$ 8,00")
    print("Código 5: Batatas fritas R$ 32,50")
    print("Código 6: Misto quente R$ 13,00")
    print("Código 7: Sucos naturais R$ 8,00")

    cod = int(input("Digite o código do item: \n"))
    match cod:
        case 1:
            preco = 11.20
        case 2:
            preco = 16.60
        case 3:
            preco = 22.00
        case 4:
            preco = 8.00
        case 5:
            preco = 32.50
        case 6:
            preco = 13.00
        case 7:
            preco = 8.00
        case _:
            print("Código inválido.")
            preco = 0.0  
            continue
            
    quantidade = int(input("Digite a quantidade: "))
    total = preco * quantidade
    total_geral += total
      
    parada = int(input("Deseja adicionar mais um produto?\nSim - 1\nNão - 0\n"))

print("Compra total: ", total_geral)

# 5. Na lanchonete “DeliciososLanches”, o atendente precisa anotar o nome dos 
# clientes e a quantidade de cada item do menu (vide tabela abaixo) que ele vai pedir. 
# Faça um programa que o auxilie, ler os dados necessários e que exiba o nome do cliente
# e o total da compra.

print("Bem vindo ao DeliciososLanches, digite seu nome")
nome = str(input("Nome: "))
quantidade = float
preco = float
total = 0.0
total_geral = 0.0

print("Olá,",nome)

while True:    
    
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
                quantidade = int(input("Digite a quantidade: "))
            case 2:
                preco = 16.60
                quantidade = int(input("Digite a quantidade: "))
            case 3:
                preco = 22.00
                quantidade = int(input("Digite a quantidade: "))
            case 4:
                preco = 8.00
                quantidade = int(input("Digite a quantidade: "))
            case 5:
                preco = 32.50
                quantidade = int(input("Digite a quantidade: "))
            case 6:
                preco = 13.00
                quantidade = int(input("Digite a quantidade: "))
            case 7:
                preco = 8.00
                quantidade = int(input("Digite a quantidade: "))
            case _:
                print("Código inválido.")
                item = None
                preco = 0.0  
                continue     
        saida = int(input("Para finalizar o programa digite 0\nPara continuar digite 1\n"))
        if saida == 0:
            break                  
 
 
total = preco * quantidade 
total_geral += total          

print("Compra total: ",total_geral)
        




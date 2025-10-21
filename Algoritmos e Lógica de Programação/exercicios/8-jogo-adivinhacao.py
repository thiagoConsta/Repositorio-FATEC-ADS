
numero = int (input("Jogador um: escolha um número entre 1 e 10:\n"))
tentativas = 1

chute = int(input("Jogador dois: tente adivinhar o número escolhido pelo jogador um: \n"))

while chute != numero:
    tentativas += 1
    print("Número errado!")
    chute = int(input("Jogador dois: tente novamente: \n"))
    
    if numero == chute:
        print("Parabéns, você acertou o número", numero, "em", tentativas, "tentativas.")


                
    

            
  
            

        
            
    

    

    


    
    
    
    
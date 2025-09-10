import random

numero_secreto = random.randint(1,100)
tentativas = 0
chances = 10

print("Bem vindo o jogo de advinhação de número!")
print("Tente a sorte advinhando de 1 a 100.")

while True:
    palpite = int(input("Seu palpite: "))
    tentativas += 1    
    chances -= 1
    
    
    if palpite < numero_secreto:
        print("Muito baixo!")
    elif palpite > numero_secreto:
        print("Muito alto!")
    elif chances >= 7 and chances <= 10:
        print(f"Parabéns! Você acertou o número secreto em {tentativas} tentativas.")
        print("Nivel: Noob (10 - 7 tentativas)")
    elif chances >= 5 and chances <= 6:
        print(f"Parabéns! Você acertou o número secreto em {tentativas} tentativas.")
        print("Nivel: Intermediário (5 - 6 tentativas)")
    elif chances >= 2 and chances <= 4:
        print(f"Parabéns! Você acertou o número secreto em {tentativas} tentativas.")
        print("Nivel: Expert (2 - 4 tentativas)")
    elif  tentativas == 1:
        print("VocÊ é EXTREMAMENTE SORTUDO")
    else:
        print("VocÊ é um perdedor, acabou suas tentativas. Tente novamente!")
        break
    
    
    
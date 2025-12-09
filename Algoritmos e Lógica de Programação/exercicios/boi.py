import time

quantBois = int (input("Qual a quantidade de bois? "))
somaPesos = 0
boiGordo = 0
boiMagro = 0

start = time.time()
print(time.time() )

for i in range (quantBois):
    somaPesos = 0
    
    pesoBoi = float(input(f"Digite o peso do boi {i +1}: "))
    somaPesos = pesoBoi + somaPesos
    
    if i == 0:
        boiMagro = pesoBoi
        boiGordo = pesoBoi
    else:
        if pesoBoi < boiMagro:
            boiMagro = pesoBoi
        if pesoBoi > boiGordo:
            boiGordo = pesoBoi
    
    mediaBoi = somaPesos / quantBois
      
print("Boi mais magro: ", boiMagro)
print("Boi mais gordo: ", boiGordo)
print("Média Boi: ", mediaBoi)


print(time.time() )

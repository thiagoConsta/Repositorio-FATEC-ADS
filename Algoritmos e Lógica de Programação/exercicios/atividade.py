parada = 1

while parada != 0:

    idadeNadador = int(input("Coloque sua idade: "))

    if 5 <= idadeNadador <= 7:
        print("Infantil A")
    elif 8 <= idadeNadador <= 10:
        print("Infantil B")
    elif 11 <= idadeNadador <= 13:
        print("Juvenil A")
    elif 14 <= idadeNadador <= 17:
        print("Juvenil B")
    else:
        print("Adulto")


    parada = int(input('Digite "0" para encerrar ou "1" para continuar: '))

nomes = []

while True:
    nome = input(("Digite um nome (ou 'sair' para cancelar o programa)"))
    if nome == "sair":
        break
    nomes = nomes + [nome]

for nome in nomes:
    print("-",nome)

print('Alunos - Escola')


num_alunos = 2
alunos = []

for i in range(num_alunos):

    aluno_info = {} 
    
    print(f"\n--- Cadastro do {i+1}º Aluno ---")
    

    nome = input("Informe o nome do aluno: ")
    n1 = float(input("Informe a primeira nota: "))
    n2 = float(input("Informe a segunda nota: "))
    
    media = (n1 + n2) / 2
    

    aluno_info['nome'] = nome
    aluno_info['nota1'] = n1
    aluno_info['nota2'] = n2
    aluno_info['media'] = media
    

    alunos.append(aluno_info)



print("\n Alunos Cadastrados:")
for aluno in alunos:

    print(aluno['nome'])
    print(aluno['media'])
    
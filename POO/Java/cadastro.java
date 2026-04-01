import java.util.Scanner;


public class cadastro {


    public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);

      
    Aluno a1 = new Aluno();
    //a1 é a classe
    //Aluno é o nome do objeto
    //new Aluno() estou avisando ao compilador para reservar um espaço na memória -> instanciar objeto
    System.out.println("Digite seu nome: ");
    a1.nome = sc.nextLine();
    //a1. -> nomeObjeto -> atributos ou métodos que pertencem a essa classe

    System.out.println(a1.nome);
    //recuperando valor que está em um atributo

    Aluno a2 = new Aluno();
    System.out.println("Digite seu nome: ");
    a2.nome = sc.nextLine();
    System.out.println(a2.nome);

    //objetos diferentes ainda tem as mesmas caraterísticas e comportamentos, pois tem como base a mesma Classe (Aluno)

    Aluno a3 = new Aluno();
    a3 = a1;
    a1.nome = sc.nextLine();
    //Copilando um objeto por referências
    //Caso o objeto original seja alterado (a1) o copiado será modificado também (a3)
    System.out.println(a3.nome);

    Endereco e1 = new Endereco();
    System.out.println("Digite o Logradouro: ");
    e1.logradouro = sc.nextLine();

    System.out.println("Logradouro é: " + e1.logradouro);
    
    

    // String  nome, cpg;
    // int ra;

    // System.out.println("Digite seu nome: ");
    // String nome = sc.nextLine();      
  
    // System.out.println("Digite seu CPF: ");
    // int cpf = sc.nextInt(); 

    // System.out.println("Digite seu RA: ");
    // int ra = sc.nextInt(); 

    }
}

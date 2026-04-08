
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws Exception {

      Aluno aluno = new Aluno();

      Scanner sc = new Scanner(System.in);



      System.out.println("Digite o nome do aluno:  ");
      aluno.nome = sc.nextLine();

      System.out.println("Digite o CPF do aluno:  ");
      aluno.cpf = sc.nextLine();

      System.out.println("Digite a idade do aluno:  ");
      aluno.idade = sc.nextInt();

      System.out.println("Digite a cidade do aluno:  ");
      aluno.cidade = sc.nextLine();

      System.out.println("Digite o número do logradouro do aluno:  ");
      aluno.numero = sc.nextInt();

      System.out.println("Nome: " + aluno.nome + "\n" + "CPF: " + aluno.cpf + "\n" + "Idade: " + aluno.idade + "\n" + "Cidade: " + aluno.cidade + "\n" + "Número do logradouro: " + aluno.numero);



    }
}

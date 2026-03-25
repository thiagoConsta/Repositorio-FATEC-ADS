
import java.util.Scanner;



public class exer9 {

    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite a sua idade para receber o resultado em dias: ");
      int idade = sc.nextInt();

      int idadeDias = idade * 365;

      System.out.println("Sua idade(ANOS) em dias é: " + idadeDias);


      

    }
}

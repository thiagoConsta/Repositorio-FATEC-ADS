
import java.util.Scanner;



public class exer5 {

    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      System.out.println("Por favor! igite o valor do produto: ");
      int valorProduto = sc.nextInt();

      double acrescimo = valorProduto * 0.08;

      double valorTotal = valorProduto + acrescimo;

      System.out.println("Valor do acréscimo: " + acrescimo);
      System.out.println("Valor final: " + valorTotal);



    }
}

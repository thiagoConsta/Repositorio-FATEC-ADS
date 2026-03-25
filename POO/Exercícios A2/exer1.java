
import java.util.Scanner;



public class exer1 {

    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o valor do produto para receber seu desconto, por favor! ");
      int valorProduto = sc.nextInt();

      double desconto = 5.0;

      double valorDesconto = valorProduto * (desconto / 100);
      double valorFinal = valorProduto - valorDesconto; 

      System.out.println("O valor do desconto: R$" + valorDesconto);
      System.out.println("Preço final com desconto: R$" + valorFinal);

    }
}

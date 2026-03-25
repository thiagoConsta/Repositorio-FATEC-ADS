
import java.util.Scanner;



public class exer10 {

    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o valor do produto: ");
      int valorProduto = sc.nextInt();

      System.out.println("Digite a quantidade de parcelas: ");
      int valorParcela = sc.nextInt();

      double juros = (valorProduto * 0.02) * valorParcela;

      double valorParcelado = valorProduto + juros;


      System.out.println("Valor total a pagar: " + valorParcelado);
      System.out.println("Quantidade de parcelas: " + valorParcela);
      



      

    }
}

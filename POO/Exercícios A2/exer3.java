
import java.util.Scanner;


public class exer3 {

    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite o valor do combustível: ");
      double valorCombustivel = sc.nextDouble();

      System.out.println("Digite o valor a ser abastecido em dinheiro: ");
      double valorAbastecido = sc.nextDouble();

      double valorLitro = valorCombustivel / valorAbastecido;

      System.out.println("Quantidade abastecida em litros: " + valorLitro);


   
    }
}

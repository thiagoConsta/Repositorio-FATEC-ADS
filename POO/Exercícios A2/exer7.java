
import java.util.Scanner;



public class exer7 {

    public static void main(String[] args) throws Exception {

      Scanner sc = new Scanner(System.in);

      System.out.println("Digite a quantidade de kWh consumido: ");
      int valorKWHConsumido = sc.nextInt();

      System.out.println("Digite o valor do kWh: ");
      double valorKWH = sc.nextInt();

      double totalConta = valorKWHConsumido * valorKWH;

      System.out.println("Valor total da conta de energia: R$" + totalConta);
    }
}

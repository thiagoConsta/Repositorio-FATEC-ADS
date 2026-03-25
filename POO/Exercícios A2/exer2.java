import java.util.Scanner;


public class exer2 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 

        System.out.println("! Conversão de real em dólar !");
        System.out.println("Digite o valor em REAL para receber a cotação em DÓLAR: ");
        double valorReal = sc.nextDouble();

        double valorDolar = valorReal * 5.25;

        System.out.println("Transição aprovada.");
        System.out.println("Seu valor correspondente em dólar: " + valorDolar);





        


    }
}

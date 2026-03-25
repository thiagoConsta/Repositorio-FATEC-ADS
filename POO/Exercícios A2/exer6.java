import java.util.Scanner;


public class exer6 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 

        System.out.println("! Conversão de real em euro !");
        System.out.println("Digite o valor em REAL para receber a cotação em EURO: ");
        double valorReal = sc.nextDouble();

        double valorEuro = valorReal * 6.06;

        System.out.println("Transição aprovada.");
        System.out.println("Seu valor correspondente em euro: " + valorEuro);





        


    }
}

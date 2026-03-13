
import java.util.Scanner;


public class exercise4 {

    public static void main(String[] args) throws Exception {

            Scanner sc = new Scanner(System.in);
            System.out.println("Empresa 100 Benifícios");

            System.out.println("Parabéns! Você recebeu um aumento de 15%. \nDiga seu salário atualmente para o ajuste salárial: ");
            int salarioAtual = sc.nextInt();

            double reajuste = salarioAtual * 0.15;
            
            double salarioNovo = reajuste + salarioAtual;

            System.out.println("\nSeu novo salário é : " + salarioNovo);





        


    }
}

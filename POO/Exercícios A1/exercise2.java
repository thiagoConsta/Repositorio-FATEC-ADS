
import java.util.Scanner;


public class exercise2 {

    // todo arquivo inicia com uma class
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);

        System.out.println();
        System.out.println("SOMA/MULT/SUB/DIV");
        System.out.println("Digite o seu primeiro número para a conta: ");
        int n1 = sc.nextInt();

        System.out.println("Digite o seu segundo número para a conta: ");
        int n2 = sc.nextInt();

        int soma = (n1 + n2);
        int mult = (n1 * n2);
        int sub = (n1 - n2);
        double div = (n1 / n2);

        System.out.println("Soma: " + soma + "\nMultiplicação: " + mult + "\nSubtração: " + sub + "\nDivisão: " + div);




    }
}

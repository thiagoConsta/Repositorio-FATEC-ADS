
import java.util.Scanner;

public class exercise2 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner (System.in);
        System.out.println("SOMA/MULT/SUB/DIV");

        System.out.println("Digite o seu primeiro número para a conta: ");
        double n1 = sc.nextInt();

        System.out.println("Digite o seu segundo número para a conta: ");
        double n2 = sc.nextInt();

        double soma = (n1 + n2);
        double mult = (n1 * n2);
        double sub = (n1 - n2);
        double div = (n1 / n2);

        System.out.println("Soma: " + soma + "\nMultiplicação: " + mult + "\nSubtração: " + sub + "\nDivisão: " + div);
    }
}

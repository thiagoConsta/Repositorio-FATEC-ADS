import java.util.Scanner;


public class exercise6 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Digite dois números inteiros: ");

        System.out.println("Número um: ");
        int n1 = sc.nextInt();

        System.out.println("Número dois: ");
        int n2 = sc.nextInt();

        int variavelAux = n1;
        
        n1 = n2;

        n2 = variavelAux;

        System.out.println("Número um: " + n1 + "\nNúmero dois: " + variavelAux);

    }
}

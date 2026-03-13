import java.util.Scanner;


public class exercise3 {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu pedo em kg's: ");
        double peso = sc.nextInt();

        System.out.println("Digite a sua altura em centímetros: ");
        double altura = sc.nextInt();

        //peso com pulo de 4 casas para compensar o tamanho da altura
        double imc = (peso * 10000 ) / (altura * altura);

        System.out.println("Seu IMC é: " + imc);
        

    }
}

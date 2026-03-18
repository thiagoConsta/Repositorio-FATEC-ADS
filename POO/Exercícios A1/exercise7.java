import java.util.Scanner;


public class exercise7 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro com 4 dígitos: ");
        int valor = sc.nextInt();

        int valorInvertido = 0;
        while(valor != 0){
            int ultimoNumero = valor % 10;
            valorInvertido = valorInvertido * 10 + ultimoNumero;
            valor = valor / 10;
        }

        System.out.println(valorInvertido);





        


    }
}

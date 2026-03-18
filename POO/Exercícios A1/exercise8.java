import java.util.Scanner;


public class exercise8 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Distancia percorrida: ");
        double distancia = sc.nextDouble();

        System.out.println("Quantidade combustível gasto: ");
        double combustivelGasto = sc.nextDouble();

        double consumoMedio = distancia / combustivelGasto;

        System.out.println("Consumo médio do veículo: " + consumoMedio + " por km.");

    }
}

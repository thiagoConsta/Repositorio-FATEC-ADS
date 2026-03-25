import java.util.Scanner;

public class exer4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int diariaPedreiro = 150;

        System.out.println("Digite a quantidade de dias trabalhados: ");
        int diasTrabalhados = sc.nextInt();

        int salarioBruto = diariaPedreiro * diasTrabalhados;

        double descontoIR = salarioBruto * 0.15;
        double descontoINSS = salarioBruto * 0.07; 

        double valorDesconto = descontoIR + descontoINSS;
        double valorFinal = salarioBruto - valorDesconto;

        System.out.println("Salário final: " + valorFinal);

    }
}
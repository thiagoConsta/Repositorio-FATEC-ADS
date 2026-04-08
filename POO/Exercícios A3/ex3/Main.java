
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    Calculadora calc = new Calculadora();

    System.out.print("Soma: ");
    calc.soma(5, 3);

    System.out.print("Subtração: ");
    calc.sub(8, 3);

    System.out.print("Multiplicação: ");
    calc.mult(7, 1);

    System.out.print("Divisão: ");
    calc.div(4, 2);

  }
}

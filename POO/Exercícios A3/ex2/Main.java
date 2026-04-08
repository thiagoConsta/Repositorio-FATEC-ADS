
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    Veiculos toyota = new Veiculos();
    toyota.marca = "Toyota";
    toyota.cor = "Branca";
    toyota.modelo = "Hilux";
    toyota.velocidade = 10000;
    toyota.ano = 2027;
    toyota.preco = 150000;

    Veiculos fox = new Veiculos();
    fox.marca = "Fox";
    fox.cor = "Amarelo";
    fox.modelo = "Cross-fox";
    fox.velocidade = 10000;
    fox.ano = 2020;
    fox.preco = 75000;
    
  }
}

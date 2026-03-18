import java.util.Scanner;


public class exercise5 {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int salarioBase = 1800;
        int comissaoFixa = 150;

        System.out.println("Apresente o nome do vendedor: ");
        String nome = sc.nextLine();

        System.out.println("Quantidade de produtos vendidos: ");
        int produtosVendidos = sc.nextInt();

        System.out.println("Valor total das vendas: ");
        double valorTotalVendas = sc.nextInt();

        double porcentagemVendas = valorTotalVendas * 0.03;
        int valorComissao = produtosVendidos * comissaoFixa;

        double salarioAtual = salarioBase + porcentagemVendas + valorComissao;

        System.out.println("Vendedor: " + nome);
        System.out.println("Seu salário se encontra em R$ " + salarioAtual);


    }
}

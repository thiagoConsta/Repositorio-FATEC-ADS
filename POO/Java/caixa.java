
import java.util.Scanner;


public class caixa {


    public static void main(String[] args) throws Exception {
       
        //Criando um objeto e inserindo valores
       Scanner sc = new Scanner(System.in);
       ContaCorrente c1 = new ContaCorrente("0001", "23456");

        System.out.println("Número conta: "+ c1.getNumeroConta());
        System.out.println("Agencia: "+c1.getAgencia());

       c1.deposito(200);;
       System.out.println(c1.consultarSaldo());

       boolean resp = c1.saque(50);
       System.out.println(resp);
       System.out.println(c1.consultarSaldo());

       //violação direta
       c1.saldo=1000;
       System.out.println("!-");

       


    }
}

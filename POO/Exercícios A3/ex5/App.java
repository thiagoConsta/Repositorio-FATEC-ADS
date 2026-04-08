import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet meuPet = new Pet();
        System.out.println("Qual é o nome do cachorro?");
        meuPet.nome = sc.nextLine();

        System.out.println("Status inicial da fome:");
        meuPet.status();  

        String resp;

        do {
            System.out.println("O pet vai se alimentar");
            meuPet.comer();
            meuPet.status();

            System.out.println("Deseja fazer ele se alimentar novamente? Sim ou Não!!!!");
            resp = sc.nextLine();

        } while(resp.equalsIgnoreCase("Sim")); //clica sim pa continuar o codigo

        System.out.println("\nStatus final da fome:");
        meuPet.status();


    }
}
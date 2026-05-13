
public class App {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("123", "Francisco Douglas","");
        
        Aluno a2 

    

        Endereco e1 = new Endereco("Rua abc", "Ferraz", "São João");

        a1.setEndereco(e1);

        System.out.println(e1.getLogradouro());
        System.out.println(a1.getEndereco().getLogradouro());
        
        Contato c1 = new Contato(11, "1198775-6168", "Celular");

        Contato c2 = new Contato(11, "1198775-6168", "Celular");

        a1.adicionarContato(c1);
        a1.adicionarContato(c2);


        a1.exibirContato(c1);
        a1.exibirContato(c2);

    }
}

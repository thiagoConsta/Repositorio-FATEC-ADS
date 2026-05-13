
public class App {
    public static void main(String[] args) {
        
        

        Endereco e1 = new Endereco("Rua abc", "Ferraz", "São João");
        Aluno a1 = new Aluno("123", "Francisco Douglas","");
        // a1.setEndereco(e1);

        System.out.println(e1.getLogradouro());
        System.out.println(a1.getEndereco().getLogradouro());
        
        Contato c1 = new Contato(11, "1198775-6168", "Celular");

        Contato c2 = new Contato(11, "1196456-3253", "Comercial");

        a1.adicionarContato(c1);
        a1.adicionarContato(c2);

        a1.exibirContato();

        Notas n1 = new Notas("N1", 10f);
        Notas n2 = new Notas("N2", 7f);

        Boletim b = new Boletim(a1, 2026, 1, n2);
        b.adicionarNotas(n1);
        b.adicionarNotas(n2);
    }
}

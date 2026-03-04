
public class App {

    // todo arquivo inicia com uma class
    public static void main(String[] args) throws Exception {
        // main é o ponto de partida ou a porta de entrada para iniciar a execução do projeto Java
        System.out.println("Hello, World!");
        // exebibição de texto de uma mensagem no terminal
        // ALT+SHIFT+F Organizar codigo (precisa da extensão)

        String nome = ""; //Declarando uma variável texto e vazia
        String turma = "Segundo ADS"; //Declarando uma variável com valor (Inicializando uma variável)
        // sysout para gerar atalho de print

        System.out.println(turma);
        System.out.println(nome);

        // Instanciando de uma classe ou criação do objeto
        Veiculo kwid = new Veiculo();
        kwid.ano = 2025;
        System.out.println(kwid.ano);

    }
}

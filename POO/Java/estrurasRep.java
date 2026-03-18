import java.util.Scanner;

public class estrurasRep {

        public static void main(String[] args) throws Exception {
                // chamando um método para executar
                estruturaCondicional();
                metodoSemRetorno();
                String res = metodoComRetorno();
                System.out.println(res);
                // ou
                System.out.println(metodoComRetorno());
                
                // istanciando a calculadora
                calculadora c1 = new calculadora();

                // c1 é a soma, o objeto
                c1.soma(10, 10);

        }

        public static void metodoSemRetorno(){
            System.out.println("Esse metódo não possui retorno");
                    // metódo sem retorno é utilizado a palavra reservada "void"
                    String res = metodoComRetorno();
                    System.out.println(metodoComRetorno());
                    System.out.println(res);
                    System.out.println("OK: " + metodoComRetorno());
                    System.out.println("Hoje é " + "Quarta-Feira");


                    somar(10, 10);
                    System.out.println(subtrair(10, 5));
                    subtrair(10, 5);


                    
        }

        public static String metodoComRetorno(){
            return "Esse método possui retorno do tipo String";
            
        }

        public static void somar (float n1, float n2){
            float res = n1+n2;
            System.out.println(res);
        }

        public static float subtrair (float n1, float n2){
            return n1 - n2;
        }

    public static void estruturaCondicional(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Olá amigo, qual a sua idade?");
        int idade = sc.nextInt();

        // condição simples (IF)
        if(idade >= 18){
            System.out.println("Você tem idade pra ser meu pai.");
        }

        // condição composta (IF-ELSE)
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor de idade.");
        }

        // multiplícas condiçõaes

        if(idade <10){
            System.out.println("Criança");
        }else if (idade > 10 && idade <18) {
            System.out.println("Adolescente");
        }else if (idade >= 18 && idade <65) {
            System.out.println("Adulto");
        }else {
            System.out.println("Idoso");
        }

        // operadores de compração >, <, >=, ==< !=
        // operadores lógicos: && (lógica AND), || (lógica or), ! (lógica NOT)

        // multiplicas casos
        System.out.println("Digite o dia da semana: ");
        int dia = sc.nextInt();

        switch(dia){
            case 1:
            System.out.println("Domingo");
            break;
            case 2:
            System.out.println("Segunda-feira");
            break;
            case 3:
            System.out.println("Terça-feira");
            break;
            case 4:
            System.out.println("Quarta-feira");
            break;
            case 5:
            System.out.println("Quinta-feira");
            break;
            case 6:
            System.out.println("Sexta-feira");
            break;
            case 7:
            System.out.println("Sábado");
            break;
            default:
            System.out.println("Dia invalido");
            break;

        }


        // ternário (Simplificação da estrutura composta)
        // ? -> e o mesmop que o IF ///// : -> é o mesmo que o ELSE
        System.out.println("Digite a sua nota: ");
        float nota = sc.nextFloat();
        String resultado = (nota>=6) ? "Aprovado":"Reprovado";
        if(nota >=6){
            resultado ="Aprovado";
        }else {resultado = "Reprovado";
        }

        // String resultado =  (nota>=6) ? "Aprovado:"Reprovado";
        // se não = :
        
        // resultado ternário
        resultado = (nota>=6) ? "Aprovado":"Reprovado";
        System.out.println("Sua nota é: " + resultado);

        


    }
}

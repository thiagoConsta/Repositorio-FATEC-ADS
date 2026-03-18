import java.util.Scanner;


public class AS {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

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

    public void estruturaCondicional(){
        // public void estruturaCondicional() -> Assinatura do Método
        // nivelAcesso tipoRetorno Nome Metodo (parametroEntrada)
        // () -> método não tem parametros, ou seja, não permite entrada de dados
        // void -> ele não tem uma saída
    }
}

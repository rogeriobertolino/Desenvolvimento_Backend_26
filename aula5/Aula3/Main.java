// Exemplo de programa em Java.
package Aula3;
//importantando biblioteca Scanner
import java.util.Scanner; //Permite capturar as informações digitadas pleo usuário

public class Main {

    //cria uma funçao publica chamada main
    public static void main(String[] args) {
        //criando o objeto scanner para parmitie capturar as informações digitadas pleo usuário
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");

        String nome = sc.nextLine(); //Armazena o nome do aluno

        System.out.println("Digite a primeira nota: "); // mensagem no terminal
        double nota1 = sc.nextDouble(); //Armazena a primeira nota
        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble(); //Armazena a segunda nota
        //calculando a média
        double media = (nota1 + nota2) / 2;
        //exibindo informações do aluno
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);

    if (media >= 7) {
            System.out.println("Situação: Aprovado!");
        } else if (media >= 5) {
            System.out.println("Situação: Recuperação!");
        } else {
            System.out.println("Situação: Reprovado!");
        }
        sc.close(); //Fechando o objeto scanner
    }

    
}

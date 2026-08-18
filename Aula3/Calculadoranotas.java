//Exemplo classe calculadora notas
package Aula3;

public class Calculadoranotas {

    //criando o primeiro metodo

    public static double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }
    // Cria o metodo para verificar a situação 
    public static String verificarSituacao(double media) {
        if (media >= 7) {
            return "Aprovado!";
        } else if (media >= 5) {
            return "Recuperação!";
        } else {
            return "Reprovado!";
        }
    }
    // Cria metodo para exibir resultado
    public static void exibirResultado(String nome, double media, String Situação) {
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + Situação);
    }
    // Cria o meto void main
    public static void main(String[] args) {
        // Cria variaveis
        String nome = "Mariana";
        double nota1 = 8.0;
        double nota2 = 6.5;
        double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);
        exibirResultado(nome, media, situacao);
    }
    }

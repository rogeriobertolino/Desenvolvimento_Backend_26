package Projetos;

public class Main {
    public static void main(String[] args) {
        // Instanciando os objetos
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Lucas";
        aluno1.idade = 18;
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.0;
        aluno1.apresentar();

        System.out.println("media: " + aluno1.calcularMedia());
        System.out.println("Situação: " + aluno1.verificarSituacao());
    
    }
}

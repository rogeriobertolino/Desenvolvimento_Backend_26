// Cria a classe consultor herdando os parametos e metodos da classe mae pessoa
public class Consultor extends Pessoa {
    private String matricula;

    public Consultor(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("=== CONSULTOR ===");
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + getMatricula());
    }
}
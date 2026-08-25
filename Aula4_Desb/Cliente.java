//Classe Cliente
/* 
Esta classe representa um cliente no sistema 
1- Nível A, 2 - Nivel B, 3- Nivel C, 4- Nivel D, 5- Nivel E
*/
public class Cliente {
    //Encapsulamento: os atribos ficam protegidos com o private
    private String codigoCti;
    private String segmento;
    private int nivel;
    private String FaixaFaturamento;
    private Consultor consultorResponsavel;

    //Cria o construtor com o Setters para validar os dados 
    
    public Cliente(String codigoCti, String segmento, int nivel, String FaixaFaturamento, Consultor consultorResponsavel) {
        setCodigoCti(codigoCti);
        setSegmento(segmento);
        setNivel(nivel);
        setFaixaFaturamento(FaixaFaturamento);
        setconsultorResponsavel(consultorResponsavel);
    }

    // Getter : para consultar o codio do cliente

    public String getCodigoCti() {
        return codigoCti;
    }

    //Setter; para guardar o valor recebido

    public void setCodigoCti(String codigoCti) {
        this.codigoCti = codigoCti;
    }

    // Getter com o segmento
    public String getSegmento() {
        return segmento;
    }

    // Setter para configurar o segmento
    public void setSegmento(String segmento) {
        this.segmento = segmento;
    }

    // Getter para o nivel numerico
    public int getNivel() {
        return nivel;
    }

    // Setter com validaçao usando apenas valores numericos
    // So valores são 1, 2, ou 3
    public void setNivel(int nivel) {
        if (nivel >= 1 && nivel <= 3) {
            this.nivel = nivel;
        } else {
            System.out.print("Erro o nível de ser 1, 2 ou 3.");
        }
    }

    // Getter para a faixa de faturamento
    public String getFaixaFaturamento() {
        return FaixaFaturamento;
    } 

    // Setter para a faixa de faturamento
    public void setFaixaFaturamento(String faixaFaturamento) {
        this.FaixaFaturamento = faixaFaturamento;
    }

    public Consultor getConsultorResponsavel() {
        return consultorResponsavel;
    }

    public void setconsultorResponsavel(Consultor consultorResponsavel) {
        this.consultorResponsavel = consultorResponsavel;
    }

    /*
    Metodo de negocio: Atualiza o nivel usand a mesma regra do setter
     */
    public void atualizarNivel(int novoNivel) {
        setNivel(novoNivel);
    }

    /*
    Exibe os dados principais do cliente
     */
    public void exibirResumo() {
        System.out.println("\n --- Resumo do Cliente CTI ---");
        System.out.println("Código CTI: " + codigoCti);
        System.out.println("Segmento: " + segmento);
        System.out.println("Nível: " + nivel);
        System.out.println("Faixa de Faturamento: " + FaixaFaturamento);
        System.out.println("Consultor Responsável: " + consultorResponsavel.getNome());
    }


}
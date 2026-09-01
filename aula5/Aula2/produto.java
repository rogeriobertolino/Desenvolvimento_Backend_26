package Aula2;

public class produto {
    //caracteristicas do produto
    String nome;   
    double preco;
    int quantidade;

    //ações que o produto pode fazer
    public void mostrarDetalhes(){
        System.out.println("produto: " + nome + ", valor: R$" + preco);
    }
    
public void main(String[] args) {        
   produto p1 = new produto();
p1.nome = "Notebook";   
p1.preco = 2500.00;
p1.mostrarDetalhes();
   
    }
}
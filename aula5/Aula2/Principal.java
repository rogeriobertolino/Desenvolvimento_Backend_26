package Aula2;

public class Principal {
    // metodo principal para executar o codigo
    public static void main(String []args){

    // Cria o objeto chamado meuCarro
    Carro meuCarro = new Carro();

    // Atribuindo a cor e a marca ao objeto
    meuCarro.marca = "Fiat";
    meuCarro.cor = "Vermelho";
    //exibindo informações do objeto
    System.out.println("carro marca: " + meuCarro.marca + ", Cor: " + meuCarro.cor);
        meuCarro.buzinar();

    }
    
}

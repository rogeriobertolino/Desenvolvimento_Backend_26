// Cria a classe chamada Carro

package Aula2; // package é por conta da pasta criada

//criando construtur    
class Carro {
// Atributos
// Cria uma variavel marca do tipo String
String marca;
String cor;

// criando construtor
public Carro(String marcaescolhida, String corescolhida){ 
    this.marca = marcaescolhida;
    this.cor = corescolhida;
}

//metodo (ação)

void buzinar(){
    // Exibir mensagem no terminal
    System.out.println("Bibi");
}

}

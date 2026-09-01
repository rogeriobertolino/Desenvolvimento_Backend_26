package Aula2;
    class Animal {

        void emitirSom() {
            System.out.println("O animal está emitindo um som.");
        }
      //exemplo de herança
    }
    class Cachorro extends Animal {
        //poliformismo
        @Override
        void emitirSom() {
            System.out.println("O cachorro faz au au");

        }
    }

class Vaca extends Animal {
        @Override
        void emitirSom() {
            System.out.println("A vaca faz muu!!.");
        }
    }
//cria a classe ex2
public class exemplo2 {           
    public static void main(String[] args) {
        
        Animal animal1 = new Cachorro();
        Animal animal2 = new Vaca();
        animal1.emitirSom();
        animal2.emitirSom(); 
    }       
}
    
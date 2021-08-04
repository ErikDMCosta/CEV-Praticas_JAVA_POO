package aula13b;

public class Aula13b {

          public static void main(String[] args) {
                     // Programa Principal
                     //Animal x = new Animal();             // Erro Classe Abstrata
                     //Mamifero x = new Mamifero();
                     //Lobo x = new Lobo();
                     Cachorro x = new Cachorro();
                     //x.emitirSom();
                     
                     // Programa Principal
                     Cachorro c = new Cachorro();
                     
                     c.reagir("Olá");                       // Abanar e Latir
                     System.out.println("");
                     c.reagir("Vai apanhar");       // Rosnar
                     System.out.println("");
                     c.reagir(11, 45);                     // Abanar
                     System.out.println("");
                     c.reagir(21, 00);                     // Ignorar
                     System.out.println("");
                     c.reagir(true);                       // Abanar
                     System.out.println("");
                     c.reagir(false);                     // Rosnar e Latir (// emitirSom();)
                     System.out.println("");
                     c.reagir(2, 12.5f);                  // Latir
                     System.out.println("");
                     c.reagir(17, 4.5f);                  // Rosnar
                     
          }
}

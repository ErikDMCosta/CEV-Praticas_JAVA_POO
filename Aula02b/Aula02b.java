package aula02b;

/**
 *
 * @author erikdmcosta
 */
public class Aula02b {

    public static void main(String[] args) {
                  Caneta c1 = new Caneta();
                  c1.cor = "Azul";
                  c1.ponta = 0.5f;
                  c1.tampar();
                  
                  c1.status();
                  c1.rabiscar();
                  /*
                  * Sempre que houver acompanhamento de () tratasse de um MÉTODO
                  * Se não houver o acompanhamento de um () tratasse de um ATRIBUTO  
                  */
                  Caneta c2 = new Caneta(); // Nunca se abre e fecha chaves depois de métodos
                  c2.modelo = "Hostnet";
                  c2.cor = "Preta";
                  c2.destampar();
                  c2.status();
                  c2.rabiscar();
        
        }
        
}
    


package aula04b;

/**
 *
 * @author erikdmcosta
 */
public class Aula04b {

    public static void main(String[] args) {
/*        
        Caneta c1 = new Caneta(); // Cria um objeto caneta
        
        c1.setModelo("BIC"); // Acessei usando o método acessor (SETTERS)
//      c1.modelo = "BIC"; // Acessei diretamente o atributo
        
        // Quando tornado o mesmo atributo PRIVATE a chamada direta dará erro
        
        c1.setPonta(0.5f);
//      c1.ponta = 0.5f;             // Dara erro pois ( ponta ) é um atributo Float Privado.
        
        c1.status();
        
        // Usando método especial ( Getters ) dará certo por que Modelo é Public        
        System.out.println("\n" + "Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());
        // Mesmo que Ponta seja Private usando método especial ( Getters ) é possível fazer a chamada
*/
        
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f); // Cria um objeto caneta
        c1.status();
        
        Caneta c2 = new Caneta("KKK", "Laranja", 1.5f);
        c2.status();
        
    }
    
}

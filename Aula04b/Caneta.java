package aula04b;

/**
 *
 * @author erikdmcosta
 */
public class Caneta {
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

   
    // Criando um método contrutor (Construct)
    public Caneta(String m, String c, float p) {    // Este é o método Construtor
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.tampar();
}
    
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String m) {
        this.modelo =m;
    }
    
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    
    // Criando método TAMPAR e DESTAMPAR
    public void tampar() {
        this.tampada = true;
    }
    
    public void destampar() {
        this.tampada = false;
    }
            
    public void status() {
        System.out.println("SOBRE A CANETA:");
        System.out.println("Modelo: " + this.getModelo()); // Escrevendo na tela o Modelo usando método especial ( Getters ) 
        System.out.println("Ponta: " + this.ponta); // Escrevendo na tela o Ponta diretamente mechendo no atributo 
        // Ambos são a mesma coisa
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada + "\n");
    }
}

// Códigos gerados com  Ctrl + i    (ALT + Insert )
/*
    public Caneta(String modelo, float ponta, String cor) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        
     public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
}
*/
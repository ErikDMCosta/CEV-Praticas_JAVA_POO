package aula03b;

/**
 *
 * @author erikdmcosta
 */

/* 
* Toda classe começa com uma letra maiuscula 
* exemplo: Caneta, CanetaPreta 
*/

public class Caneta {
        public String modelo;
        public String cor;
        private float ponta;
        protected int carga;
        protected boolean tampada;
        
        public void status () {
            System.out.println("Modelo: " + this.modelo); 
            System.out.println("Uma caneta " + this.cor); 
            System.out.println("Ponta: " + this.ponta); 
            System.out.println("Carga: " + this.carga); 
            System.out.println("Está tampada? " + this.tampada);
            
            /*
            * ( this ) é uma referênncia ao próprio objeto que chamou
            * sempre que quiser modificar algum atributo dentro da própria classe
            * coloque a palavra ( this ) na frente da linha que vai mecher neste atributo
            * é uma referênncia ao próprio objeto que chamou
            */
            
        }
        
        public void rabiscar () { // ( void ) significa sem retorno 
            if (this.tampada == true) {
                System.out.println("ERRO! Não posso rabiscar");
            } else {
                System.out.println("Estou Rabiscando");
            }
        }
        
        public void tampar () {
            this.tampada = true; // ( this ) é uma referência ao próprio objeto que chamou
        }
        
        public void destampar () { 
            this.tampada = false; // ( this ) é uma referênncia ao próprio objeto que chamou
        }
}

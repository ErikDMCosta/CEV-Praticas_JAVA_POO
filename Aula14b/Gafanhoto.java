package aula14b;

public class Gafanhoto extends Pessoa {
          private String login;
          private int totAssistido;
          
          public void viuMaisUm() {
                     
          }
          
          public Gafanhoto(String nome, int idade, String sexo, String login) {
                     super(nome, idade, sexo);
                     this.login = login;
                     this.totAssistido = 0;
          }

          @Override
          public String toString() {
                     return "Gafanhoto{" + super.toString() +"\nlogin=" + login + ", totAssistido=" + totAssistido + '}';
          }
          
}

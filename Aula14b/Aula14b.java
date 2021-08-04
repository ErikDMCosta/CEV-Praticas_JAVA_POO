package aula14b;

public class Aula14b {

          public static void main(String[] args) { //    ProjetoYouTube
                     Video v[] = new Video[5];
                     v[0] = new Video("Aula 1 de POO");
                     v[1] = new Video("Aula 12 de PHP");
                     v[2] = new Video("Aula 10 de HTML5");
                     
                     //Pessoa p = new Pessoa();     Tirar abstract
                     //Pessoa p = new Pessoa("Jubileu", 22 ,"M");       Isso aqui estaria errado
                     
                     Gafanhoto g[] = new Gafanhoto[2];
                     g[0]= new Gafanhoto("Jubileu", 22 ,"M", "juba");
                     g[1]= new Gafanhoto("Creuza", 12,"F", "creuzita");
                     
                     System.out.println(v[0].toString() + "\n");
                     System.out.println(g[0].toString());
                     
          }
}

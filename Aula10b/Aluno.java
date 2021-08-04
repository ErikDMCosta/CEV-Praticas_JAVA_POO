package aula10b;

public class Aluno extends Pessoa {
          private int mat;
          private String curso;

          public void cancelarMatr() {
	System.out.println("Matrícula será cancelada!");
          }
          
          public void setMat(int mat) {
	this.mat = mat;
          }
          
          public int getMat() {
	return this.mat;
          }
          
          public void setCurso(String curso) {
	this.curso = curso;
          }
          
          public String getCurso() {
	return this.curso;
          }
          
}
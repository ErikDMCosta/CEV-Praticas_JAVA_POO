package aula10b;

public class Professor extends Pessoa {
          private String especialidade;
          private float salario;
          
          public void receberAumento(float aum) {
	this.salario += aum;
          }
          
          public void setEspecialidade(String especialidade) {
	this.especialidade = especialidade;
          }
          
          public String getEspecialidade() {
	return this.especialidade;
          }
          
          public void setSalario(float salario) {
	this.salario = salario;
          }
          
          public double getSalario() {
	return this.salario;
          }
          
}
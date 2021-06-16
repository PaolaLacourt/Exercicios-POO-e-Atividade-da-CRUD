package Atividades.poo.exercicio7;

public class Vendedor extends Funcionario {
	
	public double getBonificacao() {
		double salario = getSalario() + 3000.00;
		return salario;
	}

}

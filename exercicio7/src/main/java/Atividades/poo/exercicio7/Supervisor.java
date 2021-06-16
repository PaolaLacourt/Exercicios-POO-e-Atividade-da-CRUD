package Atividades.poo.exercicio7;

public class Supervisor extends Funcionario {
	
	public double getBonificacao() {
		double salario = getSalario() + 5000.00;
		return salario;
	}

}


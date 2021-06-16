package Atividades.poo.exercicio7;

public class Gerente extends Funcionario {
	
	public double getBonificacao() {
		double salario = getSalario() + 10000.00;
		return salario;
	}

}


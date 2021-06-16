package Atividades.poo.exercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SupervisorTest {

	@Test
	void salarioDoSupervisorMais5000ReaisDeBonus() {
		Supervisor supervisor = new Supervisor();
		double bonus = supervisor.getBonificacao();
		double salario = getSalario() + bonus;
		
		assertEquals((5000.0), bonus);
		assertEquals((13000.0), salario);
	}

	private double getSalario() {
		return 8000.0;
	}
}

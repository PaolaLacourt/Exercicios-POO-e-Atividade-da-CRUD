package Atividades.poo.exercicio7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GerenteTest {

	@Test
	void salarioDoGerenteMais10000ReaisDeBonus() {
		Gerente gerente = new Gerente();
		double bonus = gerente.getBonificacao();
		double salario = getSalario() + bonus;
		
		assertEquals((10000.0), bonus);
		assertEquals((16000.0), salario);
	}

	private double getSalario() {
		return 6000.0;
	}

}

package Atividades.poo.exercicio7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


class VendedorTest {
	
	@Test
	void salarioDoVendedorMais3000ReaisDeBonus() {
		Vendedor vendedor = new Vendedor();
		double bonus = vendedor.getBonificacao();
		double salario = getSalario() + bonus;
		
		assertEquals((3000.0), bonus);
		assertEquals((5000.0), salario);
	}

	private double getSalario() {
		return 2000.0;
	}

}

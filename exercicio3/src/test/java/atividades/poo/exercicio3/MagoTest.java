package atividades.poo.exercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MagoTest {
	
	private Mago mago;

	@Test
	void aCadaNivelQueOMagoAumentaEleGanhaMais10DeManaE15DeInteligencia() {
		mago = new Mago("Crowley", 50,  100, 200,  150, 50, 20);
		mago.lvlUp();
		
		assertEquals(110, mago.novoMana);
		assertEquals(165, mago.novoInteligencia);
	}

}

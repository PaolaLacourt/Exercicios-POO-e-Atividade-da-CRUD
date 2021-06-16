package atividades.poo.exercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GuerreiroTest {
	
	private Guerreiro guerreiro;

	@Test
	void aCadaNivelQueOGuerreiroAumentaEleGanhaMais10DeVidaE15DeForca() {
		guerreiro = new Guerreiro("Atila",  300, 120, 360, 150,  300, 80);
		guerreiro.lvlUp();
		
		assertEquals(310, guerreiro.novoVida);
		assertEquals(315, guerreiro.novoForca);
	}

}

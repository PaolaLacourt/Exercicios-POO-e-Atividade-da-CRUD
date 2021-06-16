package atividades.poo.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import atividades.poo.exercicio2.model.VideoGame;

class VideoGameTest {
	
	private VideoGame videoGame;

	@Test
	void quandoVideoGameForUsadoOImpostoDeveSerDe25PorcentoSobreOProduto() {
		videoGame = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		videoGame.calculaImposto();
		Double imposto = videoGame.calculaImposto();
		assertEquals(250.0, imposto);
	}
	
	@Test
	void quandoVideoGameForNovoOImpostoDeveSerDe45PorcentoSobreOProduto() {
		videoGame = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		videoGame.calculaImposto();
		Double imposto = videoGame.calculaImposto();
		assertEquals(675.0, imposto);
	}

}

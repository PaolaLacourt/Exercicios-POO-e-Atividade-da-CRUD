package atividades.poo.exercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import atividades.poo.exercicio2.model.Livro;

class LivroTest {
	
	private Livro livro;

	@Test
	void devolveOValorDoImpostoSobreLivrosNaoEducativosQueSeraDe10PorcentoDoValorDoLivro() {
		livro = new Livro ("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		livro.calculaImposto();
		Double imposto = livro.calculaImposto();
		assertEquals(4.0, imposto );
	}
	
	@Test
	void devolveValor0DeImpostoSobreLivrosEducativos () {
		livro = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		livro.calculaImposto();
		Double imposto = livro.calculaImposto();
		assertEquals(0, imposto);
	}

}

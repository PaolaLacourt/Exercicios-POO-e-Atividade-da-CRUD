package atividades.poo.exercicio2;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import atividades.poo.exercicio2.model.Livro;
import atividades.poo.exercicio2.model.Loja;
import atividades.poo.exercicio2.model.VideoGame;

class LojaTest {
	
	private Loja loja;
	

	@Test
	void somaOValorDeTodosOsProdutosDaLojaEDevolveOTotal() {
		Livro livro11 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);;
		Livro livro13 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(livro11);
		livros.add(livro13);
		
		List<VideoGame> videoGames = new ArrayList<>();
		videoGames.add(ps4);
		videoGames.add(ps4Usado);
		
		loja = new Loja("Americanas", "12345678", livros, videoGames);
		loja.calculaPatrimonio();
		Double total = loja.calculaPatrimonio();
		
		assertEquals(190000.0, total);
	}

}

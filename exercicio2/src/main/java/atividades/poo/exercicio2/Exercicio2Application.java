package atividades.poo.exercicio2;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import atividades.poo.exercicio2.model.Livro;
import atividades.poo.exercicio2.model.Loja;
import atividades.poo.exercicio2.model.VideoGame;

@SpringBootApplication
public class Exercicio2Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio2Application.class, args);
		
		Livro livro11 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "Fantasia", 300);
		Livro livro12 = new Livro("Senhor dos Aneis", 60, 30, "J. R. R. Tolkien", "Fantasia", 500);
		Livro livro13 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);
		
		VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
		VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
		VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);
		
		List<Livro> livros = new ArrayList<>();
		livros.add(livro11);
		livros.add(livro12);
		livros.add(livro13);
		
		List<VideoGame> videoGames = new ArrayList<>();
		videoGames.add(ps4);
		videoGames.add(ps4Usado);
		videoGames.add(xbox);
		
		Loja Americanas = new Loja("Americanas", "12345678", livros, videoGames);
		
		livro12.calculaImposto();
		livro13.calculaImposto();
		
		ps4Usado.calculaImposto();
		ps4.calculaImposto();
		
		Americanas.listaLivros();
		Americanas.listaVideoGames();
		Americanas.calculaPatrimonio();
	}

}
	

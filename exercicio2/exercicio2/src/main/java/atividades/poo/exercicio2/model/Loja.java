package atividades.poo.exercicio2.model;

import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List<Livro>livros;
	private List<VideoGame>videoGames;
	
	public Loja(String nome, String cnpj, List<Livro>livros, List<VideoGame>videoGames) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}
	
	
	public void listaLivros() {
		if(livros.size() > 0) {
			System.out.println("A loja " + getNome() + " possui estes livros para venda: ");
			for(Livro element: livros) {
				System.out.println(element.toString());
			}
		} else {
			System.out.println("A loja nao tem livros no seu estoque.");
		}
	}
	
	public void listaVideoGames() {
		if(videoGames.size() > 0) {
			System.out.println("A loja " + getNome() + " possui estes video games para venda: ");
			for(VideoGame element: videoGames) {
				System.out.println(element.toString());
			}
		} else {
			System.out.println("A loja nao tem video games no seu estoque.");
		}
	}
	
	public double calculaPatrimonio() {
		double total = 0;
		for(Produto element : videoGames) {
			total += element.getPreco() * element.getQuantidade();
		}
		for(Produto element : livros) {
			total += element.getPreco() * element.getQuantidade();
		}
		System.out.println("O patrimonio da loja " + getNome() + "e de R$ " + total);
		return total;
	}
	
	public String toString() {
		return "Loja nome= " + nome + ", CNPJ= " + cnpj + ", livros= " + livros + ", video games= " + videoGames ;
	}
	
}


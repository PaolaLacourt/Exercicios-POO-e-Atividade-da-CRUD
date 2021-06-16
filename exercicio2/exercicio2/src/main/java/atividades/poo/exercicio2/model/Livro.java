package atividades.poo.exercicio2.model;

public class Livro extends Produto {
	
	private String autor;
	private String tema;
	private int quantidadePaginas;
	
	public Livro (String nome, double preco, int quantidade, String autor, String tema, int quantidadePaginas) {
	super (nome, preco, quantidade);
	this.autor = autor;
	this.tema = tema;
	this.quantidadePaginas = quantidadePaginas;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQuantidadePaginas() {
		return quantidadePaginas;
	}

	public void setQuantidadePaginas(int quantidadePaginas) {
		this.quantidadePaginas = quantidadePaginas;
	}
	
	public double calculaImposto () {
		if (this.getTema() == "educativo") {
			System.out.println("Os livros de temas educativos nao tem imposto: " + getNome());
			return 0;
		} else {
			double imposto = getPreco() * 0.1;
			System.out.println("R$ " + imposto + " de impostos sobre o livro " + getNome());
			return imposto;
		}
	}
	
	public String toString() {
		return "Titulo: " + getNome() + ", preco: " + getPreco() + ", quantidade " + getQuantidade() + " em estoque.";
	}

}


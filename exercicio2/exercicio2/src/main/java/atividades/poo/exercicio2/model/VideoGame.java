package atividades.poo.exercicio2.model;

public class VideoGame extends Produto {
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame (String nome, double preco, int quantidade, String marca, String modelo, boolean isUsado) {
		super(nome, preco, quantidade);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public Double calculaImposto() {
		if (isUsado()) {
			double imposto = getPreco() * 0.25;
			System.out.println("O imposto do " + getNome() + getModelo() + " usado  R$" + imposto);
			return imposto;
		} else {
			double imposto = getPreco() * 0.45;
			System.out.println("O imposto do " + getNome() + getModelo() + " novo  R$" + imposto);
			return imposto;
		}
	}

	public String toString() {
		return "VideoGame: " + getModelo() + ", preo: " + getPreco() + ", quantidade: " + getQuantidade() + " em estoque";
	}
}


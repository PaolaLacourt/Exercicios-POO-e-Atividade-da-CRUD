package Atividades.poo.exercicio1;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int velocidade;
	private double preco;
	
	
	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int acelerar() {
		velocidade = velocidade + 20;
		setVelocidade(velocidade);
		System.out.println("A velocidade do carro aumentou para " + velocidade + " km/h.");
		return velocidade;
	}
	
	public int abastecer(int combustivel) {
		if (getLitrosCombustivel() + combustivel > 60) {
		System.out.println("Capacidade maxima de 60 litros no tanque de combustivel.");
		return litrosCombustivel;
		} else {
		setLitrosCombustivel(getLitrosCombustivel() + combustivel );
		System.out.println("O tanque de combustivel possui  " + getLitrosCombustivel() + " litros de combustivel.");
		return getLitrosCombustivel();
	}
	}
	
	public int frear() {
		if (getVelocidade() == 0) {
			System.out.println("O veiculo encontra-se parado.");
		} else {
			velocidade = velocidade - 20;
			setVelocidade(velocidade);
			System.out.println("A velocidade do carro diminui para " + getVelocidade() + "Km/h.");
		}
		return velocidade;
	}
	
	public String pintar(String cor) {
		setCor(cor);
		System.out.println("O carro possui a cor " + getCor());
		return cor;
	}
	
	public void ligar() {
		if (this.isLigado == false) {
			this.isLigado = true;
			System.out.println("O carro ligou.");
		} else {
			System.out.println("Carro ligado!");
		}
	}
		
		public void desligar() {
			if (this.isLigado == true && this.velocidade <= 0) {
				this.isLigado = false;
				System.out.println("O carro desligou.");
			} else if 
				(this.isLigado == true && this.velocidade > 0) {
					this.isLigado = true;
					System.out.println("O carro nao pode desligar quando estiver em movimento");
			  } else {
				System.out.println("Carro desligado!");
			}
		}
	
	
}

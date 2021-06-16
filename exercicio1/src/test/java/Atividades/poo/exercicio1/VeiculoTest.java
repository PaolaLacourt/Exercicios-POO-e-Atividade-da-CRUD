package Atividades.poo.exercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VeiculoTest {
	
	private Veiculo veiculo;
	
	@BeforeEach
	public void inicializar() {
		this.veiculo= new Veiculo("Mercedez", "c200", "ABC1234", "Branco", 40, true, 10, 40, 82000.0 );
	}
	
	//acelerar(): este método acrescenta um valor de 20 no atributo velocidade.
	@Test
	void aumentar20NaVelocidadeUsandoOMetodoAcelerar() {
		veiculo.acelerar();	
		assertEquals(60, veiculo.getVelocidade());
	}
	
	//abastecer(int combustivel): recebe como parâmetro uma quantidade de combustível e atribui a listrosCombustivel
	@Test
	void somaCombustivelColocadoComOQueJaTem() {
		veiculo.abastecer(25);
		assertEquals(35, veiculo.getLitrosCombustivel());
	}
	
	//OBS O limite do tanque de combustível é de 60 litros, validar para não ultrapassar.
	@Test
	void naoDeixarUltrapassar60LitrosNoTanqueDeCombustivel() {
		veiculo.abastecer(65);
		assertEquals(10, veiculo.getLitrosCombustivel());
	}

	//frear(): a cada chamada do método diminui a velocidade em 20
	@Test
	void diminuiVelocidadeEm20KmUsandoOMetodoFrear() {
		veiculo.frear();
		assertEquals(20, veiculo.getVelocidade());
	}

	// Não aceitar a chamada do método se o veiculo estiver parado.   
	@Test
	void naoDiminuirVelocidadeSeOVeiculoEstiverParado() {
		veiculo= new Veiculo("Mercedez", "c200", "ABC1234", "Branco", 40, true, 10, 0, 82000.0 );
		veiculo.frear();
		assertEquals(0, veiculo.getVelocidade());
	}
	
	//pintar(String cor): recebe uma cor como parâmetro e altera o atributo.
	@Test
	void alterarACorDoVeiculo() {
		veiculo.pintar("Preto");
		assertEquals("Preto", veiculo.getCor());
	}
	
	//ligar(): Verifica se o veículo já se encontra ligado, caso não, liga o carro.
	@Test
	void verificaSeOVeiculoEstaLigadoCasoNaoEstejaLigarOCarro() {
		veiculo.ligar();
		assertEquals(true, veiculo.isLigado());
	}
	
	/*desligar(): Verifica se o veículo já se encontra desligado, caso não, desliga
	o carro. Não permitir que desligue o veículo com (velocidade > 0). */
	@Test
	void seOVeiculoEstiverEmMovimentoNaoPodeDesligarOCarro() {
		veiculo.desligar();
		assertEquals(true, veiculo.isLigado());
	}  

	@Test
	void verificaSeOVeiculoEstaDesligadoSeNaoEstiverDesligaOCarro() {
		this.veiculo= new Veiculo("Mercedez", "c200", "ABC1234", "Branco", 40, true, 10, 0, 82000.0 );
		veiculo.desligar();
		assertEquals(false, veiculo.isLigado());
	}  
	
	

              

}

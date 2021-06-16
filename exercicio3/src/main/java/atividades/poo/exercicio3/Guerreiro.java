package atividades.poo.exercicio3;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	private List<String> Habilidade;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getHabilidade() {
		return Habilidade;
	}
	
	public void setHabilidade(List<String> habilidade) {
		Habilidade = habilidade;
	}

	public Random random = new Random();
	
	public int attack() {
		int dano = 0;
		int numero = random.nextInt(300);
		dano = getForca() * getLevel() + numero;
		System.out.println("O personagem " + getNome() + " realizou o ataque, causando " + dano + " de dano.");
		return dano;
	}
	int novoVida = 0;
	int novoNivel = 0;
	int novoForca = 0;
	
	public int lvlUp() {
		novoNivel = novoNivel+1;
		novoVida = novoVida + 10 + this.getVida();
		novoForca = novoForca + 15 + this.getForca();
		System.out.println("O personagem " + this.getNome() + " subiu de nivel, agora ele possui " + novoVida + " de vida e " + novoForca + " de forca.");
		return novoNivel;
		}
	
	public boolean aprenderHabilidade(String habilidadeAprendida) {
		System.out.println(this.getNome() + " aprendeu a habilidade " + habilidadeAprendida);
		return true;
	}
}


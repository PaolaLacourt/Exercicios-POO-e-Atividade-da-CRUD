package atividades.poo.exercicio3;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	
	private List<String>Magia;
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
		super(nome, vida, mana, xp, inteligencia, forca, level);
	}

	public List<String> getMagia() {
		return Magia;
	}

	public void steMagia(List<String>magia) {
		Magia = magia;
	}
	
	public Random random = new Random();
	
	
	public int attack() {
		int dano;
		int numero = random.nextInt(300);
		dano = getInteligencia() * getLevel() + numero;
		System.out.println(" O personagem " + getNome() + " realizou o ataque, causando " + dano + "de dano.");
		return dano;	
	}
	
	int novoMana = 0;
	int novoNivel = 0;
	int novoInteligencia = 0;
	
	public int lvlUp() {
		novoNivel = novoNivel+1;
		novoMana = novoMana + 10 + this.getMana();
		novoInteligencia = novoInteligencia + 15 + this.getInteligencia();
		System.out.println("O personagem " + this.getNome() + " subiu de nivel, agora ele possui " + novoMana + " de mana e " + novoInteligencia + " de inteligencia.");
		return novoNivel;
		}
	
	public boolean aprenderMagia(String magiaAprendida) {
		System.out.println(this.getNome() + " aprendeu a magia " + magiaAprendida);
		return true;
	}
	}


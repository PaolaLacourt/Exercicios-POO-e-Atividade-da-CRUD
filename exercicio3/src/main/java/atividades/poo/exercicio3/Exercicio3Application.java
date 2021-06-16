package atividades.poo.exercicio3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio3Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio3Application.class, args);
		
		Mago m1 = new Mago("Crowley", 50, 100, 200, 150, 50, 20);	
		Guerreiro g1 = new Guerreiro("Atila", 300, 120, 360, 150, 300, 80);
		
		m1.attack();
		m1.lvlUp();
		m1.aprenderMagia("Hipnose");
		System.out.println("\n");
		
		g1.attack();
		g1.lvlUp();
		g1.aprenderHabilidade("Golpe certeiro");
		System.out.println("\n");
		
		m1.attack();
		m1.lvlUp();
		m1.aprenderMagia("Influenciar");
		System.out.println("\n");
		
		g1.attack();
		g1.lvlUp();
		g1.aprenderHabilidade("Golpe critico");
		System.out.println("\n");
		
		System.out.println("A quantidade de personagens criados foi de " + Personagem.getObjectInstances());

	}

}

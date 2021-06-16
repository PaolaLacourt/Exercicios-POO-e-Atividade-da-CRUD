package Atividades.poo.exercicio7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Exercicio7Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercicio7Application.class, args);
		
		Gerente g1 = new Gerente();
		g1.setNome("Giovani");
		g1.setIdade(25);
		g1.setSalario(6000.0);
		
		System.out.println(g1.getNome());
		System.out.println(g1.getIdade());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());
		
		Supervisor s1 = new Supervisor();
		s1.setNome("Adriana");
		s1.setIdade(41);
		s1.setSalario(8000.0);
		
		System.out.println(s1.getNome());
		System.out.println(s1.getIdade());
		System.out.println(s1.getSalario());
		System.out.println(s1.getBonificacao());
		
		Vendedor v1 = new Vendedor();
		v1.setNome("George");
		v1.setIdade(19);
		v1.setSalario(2000.0);
		
		System.out.println(v1.getNome());
		System.out.println(v1.getIdade());
		System.out.println(v1.getSalario());
		System.out.println(v1.getBonificacao());
	}

}

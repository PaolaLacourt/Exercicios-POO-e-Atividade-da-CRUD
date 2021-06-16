import java.util.ArrayList;
import java.util.List;

public class Main {
	
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", 15);
		Pessoa p2 = new Pessoa("Leandro", 21);
		Pessoa p3 = new Pessoa("Paulo", 17);
		Pessoa p4 = new Pessoa("Jessica", 18);
		
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		pessoas.add(p4);
		
		
		Gerenciador gerenciador = new Gerenciador();
		gerenciador.buscaMaiorIdade(pessoas);
		pessoas = gerenciador.excluiMenorDeIdade(pessoas);
		System.out.println(pessoas.toString());
		gerenciador.consulta(pessoas);
	}
		
}

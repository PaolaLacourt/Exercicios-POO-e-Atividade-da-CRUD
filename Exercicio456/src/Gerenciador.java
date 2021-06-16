import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Gerenciador {
	
	public void buscaMaiorIdade (List<Pessoa> pessoas) {
		Integer maiorIdade = 0;
		String nome = null;
		for (Pessoa pessoa: pessoas) {
			if (maiorIdade == 0) {
				maiorIdade = pessoa.getIdade();
				nome = pessoa.getNome();
			} else if (maiorIdade < pessoa.getIdade()) {
				maiorIdade = pessoa.getIdade();
				nome = pessoa.getNome();
			}
		}
		
		System.out.println("O nome da pessoa mais velha é " + nome);
		
	}
	
	public List<Pessoa> excluiMenorDeIdade (List<Pessoa>pessoas) {
		List<Pessoa> pessoas2 = new ArrayList<Pessoa>();
		pessoas2.addAll(pessoas);
		for (Pessoa pessoa: pessoas) {
			if (pessoa.getIdade() < 18) {
			pessoas2.remove(pessoa);
		}
	}		
			return pessoas2;
}
	
	public void consulta (List<Pessoa>pessoas) {
		for (Pessoa pessoa : pessoas) {
			if (pessoa.getNome().equalsIgnoreCase("jessica")) {
				System.out.println(pessoa.getIdade());
			}
		}
	}
}

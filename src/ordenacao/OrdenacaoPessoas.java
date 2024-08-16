package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import pesquisa.Livro;

public class OrdenacaoPessoas {
	private List<Pessoa> pessoas;

	public OrdenacaoPessoas() {
		this.pessoas = new ArrayList<Pessoa>();
	}
	
	public void adicionarPessoa(String nome, int idade, double altura) {
		pessoas.add(new Pessoa(nome, idade, altura));
	}
	
	public List<Pessoa> ordenarPorIdade(){
		List<Pessoa> pessoasPorIdade = new ArrayList<Pessoa>(pessoas);
		Collections.sort(pessoasPorIdade);
		return pessoasPorIdade;
	}
	
	public List<Pessoa> ordenarPorAltura() {
		List<Pessoa> pessoasPorAutura = new ArrayList<Pessoa>(pessoas);
		Collections.sort(pessoasPorAutura, new ComparatorPorAutura());
		return pessoasPorAutura;
	}
}

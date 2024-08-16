package pesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CatalogoLivros {
	
	private List<Livro> livros;

	public CatalogoLivros() {
		this.livros = new ArrayList<Livro>();
	}
	
	public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
		livros.add(new Livro(titulo, autor, anoPublicacao));
	}
	
	public List<Livro> pesquisarPorAutor(String autor) {
		if(!livros.isEmpty()) {
			return livros.stream().filter(
					l -> l.getAutor().equalsIgnoreCase(autor))
					.collect(Collectors.toList());
		}
		return new ArrayList<Livro>();
	}
	
	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		if(!livros.isEmpty()) {
			return livros.stream().filter(
					l -> l.getAno() > anoInicial && l.getAno() < anoFinal)
					.collect(Collectors.toList());
		}
		return new ArrayList<Livro>();
	}
	
	public Optional<Livro> pesquisarPorTitulo(String titulo) {
		if(!livros.isEmpty()) {
			return livros.stream().filter(l -> l.getTitulo().equalsIgnoreCase(titulo)).findFirst();
		}
		return Optional.empty();
	} 

}

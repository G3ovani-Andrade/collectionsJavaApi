package pesquisa;

public class Livro {
	private String titulo;
	private String autor;
	private int anoPublicacao;
	
	public Livro(String titulo, String autor, int ano) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = ano;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAno() {
		return anoPublicacao;
	}

	public void setAno(int ano) {
		this.anoPublicacao = ano;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", anoPublicacao=" + anoPublicacao + "]";
	}
	
	
	
}

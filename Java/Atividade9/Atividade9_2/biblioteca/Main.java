package biblioteca;

public class Main {
	public static void main(String[] args) {
		int quantidadeLivros = 2;
		Autor autor = new Autor("Machado de asis",89);
		Categoria categoria = new Categoria(quantidadeLivros);
		Livro livro = new Livro(quantidadeLivros);
		Biblioteca biblioteca = new Biblioteca(autor,livro,categoria,quantidadeLivros);
		
		biblioteca.adicionarLivro();
		System.out.println();
		biblioteca.categorizarLivro();
		biblioteca.status();
		
	}
}

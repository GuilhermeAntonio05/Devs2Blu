package biblioteca;

import java.util.Scanner;

public class Biblioteca {
	private Scanner sc = new Scanner(System.in);
	private Livro livro;
	private Autor autor;
	private Categoria categoria;
	private int quantidadeLivros;

	public Biblioteca() {
	}

	// possibilidade de ja termos os autores livros e categorias
	public Biblioteca(Autor autor, Livro livro, Categoria categoria, int quantidadeLivros) {
		this.livro = livro;
		this.autor = autor;
		this.categoria = categoria;
		this.quantidadeLivros = quantidadeLivros;
	}

	public void adicionarAutor() {
		System.out.println("Nome: ");
		String nome = sc.nextLine();

		System.out.println("Idade: ");
		int idade = sc.nextInt();
		sc.nextLine();

		this.autor = new Autor(nome, idade);
	}

	public void adicionarLivro() {
		System.out.println("Quais livros o autor " + this.autor.getNomeAutor() + " escreveu?");
		this.getLivro().anotarTitulos();
	}

	public void categorizarLivro() {
		for (int i = 0; i < getQuantidadeLivros(); i++) {
			System.out.println("Qual a categoria do livro: " + this.livro.getTitulos(i));
			this.getCategoria().categorizarLivros(i);
			System.out.println();
		}

	}

	public void status() {
		System.out.println("Autor, livros e sua categoria:");
		System.out.println("Nome: " + this.getAutor().getNomeAutor());
		System.out.println("Idade: " + this.getAutor().getIdade());
		System.out.println();

		for (int i = 0; i < this.getQuantidadeLivros(); i++) {
			System.out.println("Livro: " + this.getLivro().getTitulos(i) + " | Categoria: "
					+ this.getCategoria().getLivrosCategorizados(i));
		}

	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getQuantidadeLivros() {
		return quantidadeLivros;
	}

	public void setQuantidadeLivros(int quantidadeLivros) {
		this.quantidadeLivros = quantidadeLivros;
	}

}

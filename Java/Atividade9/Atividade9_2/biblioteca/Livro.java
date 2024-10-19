package biblioteca;

import java.util.Scanner;

public class Livro {
	private Scanner sc = new Scanner(System.in);
	private int quantidadeLivro;
	private String[] titulos;

	public Livro() {
	}

	public Livro(int quantidadeLivro) {
		this.quantidadeLivro = quantidadeLivro;
		this.titulos = new String[quantidadeLivro];
	}

	public void anotarTitulos() {
		for (int i = 0; i < this.titulos.length; i++) {
			this.titulos[i] = sc.nextLine();
		}
	}

	public void escreverTitulos() {
		for (int i = 0; i < this.titulos.length; i++) {
			System.out.println(this.titulos[i]);
		}
	}

	public int getQuantidadeLivro() {
		return quantidadeLivro;
	}

	public void setQuantidadeLivro(int quantidadeLivro) {
		this.quantidadeLivro = quantidadeLivro;
	}

	public String getTitulos(int index) {
		return titulos[index];
	}

	public void setTitulos(String[] titulos) {
		this.titulos = titulos;
	}

}

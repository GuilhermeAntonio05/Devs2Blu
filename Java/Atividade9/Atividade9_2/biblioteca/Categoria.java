package biblioteca;

import java.util.Scanner;

public class Categoria {
	private Scanner sc = new Scanner(System.in);
	private String[] categoria = { "1 - Romance", "2 - Ação", "3 - Científico" };
	private String[] livrosCategorizados;

	public Categoria() {
	}

	public Categoria(int quantidadeLivros) {
		this.livrosCategorizados = new String[quantidadeLivros];
	}

	public void categorizarLivros(int i) {

			// Escreve as categorias
			for (int j2 = 0; j2 < categoria.length; j2++) {
				System.out.print(categoria[j2] + " ");
			}

			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				livrosCategorizados[i] = " Romance";
				break;
			case 2:
				livrosCategorizados[i]= " Ação";

				break;
			case 3:
				livrosCategorizados[i] = " Científico";
				break;

			default:
				System.out.println("Opção não foi validada! Por Favor insira novamente!");
				break;
		}
	}
	
	public void status(int index) {
		this.getCategoria(index);
	}

	public String getCategoria(int index) {
		return this.categoria[index];
	}

	public void setCategoria(String[] categoria) {
		this.categoria = categoria;
	}

	public String getLivrosCategorizados(int index) {
		return this.livrosCategorizados[index];
	}
}
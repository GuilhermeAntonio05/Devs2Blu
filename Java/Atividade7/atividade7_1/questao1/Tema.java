package questao1;

public class Tema {
	String[] temas = { "Castelo", "Boneca da Cinderela", "Bruxa" };
	String corToalha;
	int temaEscolhido;
	int valor = 1500; // valor dos temas;
	boolean desconto = false;
	double aluguel;

	public Tema(String corToalha, int temaEscolhido, boolean clientefiel, double aluguel) {
		this.corToalha = corToalha;
		this.temaEscolhido = temaEscolhido - 1;
		this.desconto = clientefiel;
		this.aluguel = aluguel;
	}

	public void status() {
		System.out.println("Cor da toalha: " + corToalha);
		System.out.println("Tema: " + temas[temaEscolhido]);
		System.out.print("Valor Final: ");
		valorFinal(this.aluguel);
	}

	void valorFinal(double aluguel) {
		if (desconto) {
			System.out.println(valor += aluguel * 0.9);
		} else {
			System.out.println(aluguel += valor);
		}
	}

}

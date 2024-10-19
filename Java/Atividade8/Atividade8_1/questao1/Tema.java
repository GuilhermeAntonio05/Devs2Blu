package questao1;

public class Tema {
	public String[] temas = { "Castelo", "Boneca da Cinderela", "Bruxa" };
	public String corToalha;
	public int temaEscolhido;
	public int valor = 1500; // valor dos temas;
	public boolean desconto = false;
	public double aluguel;

	public Tema(String corToalha, int temaEscolhido, boolean clientefiel, double aluguel) {
		this.corToalha = corToalha;
		this.temaEscolhido = temaEscolhido - 1;
		this.desconto = clientefiel;
		this.aluguel = aluguel;
	}

	public String[] getTemas() {
		return temas;
	}

	public void setTemas(String[] temas) {
		this.temas = temas;
	}

	public String getCorToalha() {
		return corToalha;
	}

	public void setCorToalha(String corToalha) {
		this.corToalha = corToalha;
	}

	public int getTemaEscolhido() {
		return temaEscolhido;
	}

	public void setTemaEscolhido(int temaEscolhido) {
		this.temaEscolhido = temaEscolhido;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public boolean getDesconto() {
		return desconto;
	}

	public void setDesconto(boolean desconto) {
		this.desconto = desconto;
	}

	public double getAluguel() {
		return aluguel;
	}

	public void setAluguel(double aluguel) {
		this.aluguel = aluguel;
	}

	public void status() {
		System.out.println("Cor da toalha: " + this.corToalha);
		System.out.println("Tema: " + this.temas[temaEscolhido]);
		System.out.print("Valor Final: ");
		this.valorFinal(this.aluguel);
	}

	public void valorFinal(double aluguel) {
		if (this.desconto) {
			System.out.println(valor += aluguel * 0.9);
		} else {
			System.out.println(aluguel += valor);
		}
	}

}

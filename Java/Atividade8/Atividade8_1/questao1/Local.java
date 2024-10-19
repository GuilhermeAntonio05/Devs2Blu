package questao1;

public class Local {
	private double valorAluguel;
	private String endereco;

	public Local(double valorAluguel, String endereco) {
		this.valorAluguel = valorAluguel;
		this.endereco = endereco;
	}

	public double getValorAluguel() {
		return valorAluguel;
	}

	public void setValorAluguel(double valorAluguel) {
		this.valorAluguel = valorAluguel;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void status() {
		System.out.println("Valor do aluguel: " + this.valorAluguel);
		System.out.println("Endereco: " + this.endereco);
	}
}

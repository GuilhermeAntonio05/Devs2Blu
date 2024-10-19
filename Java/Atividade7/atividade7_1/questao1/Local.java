package questao1;

public class Local {
	double valorAluguel;
	String endereco;
	
	public Local(double valorAluguel, String endereco) {
		this.valorAluguel = valorAluguel;
		this.endereco = endereco;
	}
	
	public void status(){
		System.out.println("Valor do aluguel: " + valorAluguel);
		System.out.println("Endereco: " + endereco);
	}
}

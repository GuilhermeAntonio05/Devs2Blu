package questao1;

public class Cliente {
	String nome;
	String telefone;
	boolean clienteFiel;

	public Cliente(String nome, String telefone, boolean clienteFiel) {
		this.nome = nome;
		this.telefone = telefone;
		this.clienteFiel = clienteFiel;
		
	}

	public void status() {
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Telefone: " + telefone);
	}

}

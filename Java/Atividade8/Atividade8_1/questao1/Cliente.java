package questao1;

public class Cliente {
	private String nome;
	private String telefone;
	private boolean clienteFiel;

	public Cliente(String nome, String telefone, boolean clienteFiel) {
		this.nome = nome;
		this.telefone = telefone;
		this.clienteFiel = clienteFiel;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public boolean isClienteFiel() {
		return clienteFiel;
	}

	public void setClienteFiel(boolean clienteFiel) {
		this.clienteFiel = clienteFiel;
	}

	public void status() {
		System.out.println("Nome do cliente: " + nome);
		System.out.println("Telefone: " + telefone);
	}

}

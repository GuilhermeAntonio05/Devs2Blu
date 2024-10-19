package biblioteca;

public class Autor {
	private String nomeAutor;
	private int idade;

	public Autor() {
	}

	public Autor(String nomeAutor, int idade) {
		this.nomeAutor = nomeAutor;
		this.idade = idade;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}

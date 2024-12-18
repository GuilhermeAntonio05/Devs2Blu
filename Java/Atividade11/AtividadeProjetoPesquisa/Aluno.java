package AtividadeProjetoPesquisa;

public class Aluno implements Pesquisador {
	private String nome;
	private String tipo;

	public Aluno() {
	}

	public Aluno(String nome) {
		this.nome = nome;
		this.tipo = "Aluno";
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return nome;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String getTipo() {
		return tipo;
	}

	public String toString() {
		return "Tipo: " + getTipo() + ", Nome: " + getNome();
	}
}

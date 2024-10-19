package Atividade11_ProjetoPesquisa_V2;

public class Professor extends Funcionario implements Pesquisador {
	private String nome;
	private String tipo;

	public Professor() {
	}

	public Professor(String nome, String tipo) {
		this.nome = nome;
		this.tipo = "Professor";
	}

	public Professor(String nome, double salario) {
		super(salario);
		this.nome = nome;
		this.tipo = "Professor";
	}

	@Override
	public void setSalario(double salario) {
		super.setSalario(salario);
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
		return "Nome: " + getNome() + ", Tipo: " + getTipo() + ", Salario: " + super.getSalario();
	}

}

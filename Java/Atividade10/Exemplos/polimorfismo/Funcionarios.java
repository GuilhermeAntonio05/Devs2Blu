package polimorfismo;

public class Funcionarios {
	private String nome;
	private double salario;

	public Funcionarios() {
	}

	public Funcionarios(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public double addAumento(double valor){
		double aumentoSalario = this.getSalario()+valor;
		this.setSalario(aumentoSalario);	
		return aumentoSalario;
	}
	
	public void ganhoAnual(){
		System.out.println("O funcionário ganha: " + this.getSalario()*12);
	}
	
	public void exibeDados() {
		System.out.println("Nome do funcionário: " + this.getNome());
		System.out.println("Salario do funcionário: " + this.getSalario());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}

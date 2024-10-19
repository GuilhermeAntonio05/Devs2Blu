package polimorfismo;

public class Assistente extends Funcionarios {
	private int numeroMatricula;

	public Assistente() {
	}
	
	public Assistente(String nome,double salario,int numeroMatricula) {
		super(nome, salario);
		this.numeroMatricula = numeroMatricula;
	}
	
	@Override
	public void exibeDados() {
		System.out.println("Nome funcionário: " + super.getNome());
		System.out.println("Matrícula funcionário:" + this.getNumeroMatricula());
		System.out.println("Salário funcionário: " + super.getSalario());
	}
	
	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	
	public void setNumeroMatricula(int numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}
}

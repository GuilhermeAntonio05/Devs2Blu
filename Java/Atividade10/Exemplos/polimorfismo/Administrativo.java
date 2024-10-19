package polimorfismo;

public class Administrativo extends Assistente {
	
	public Administrativo() {
	}
	
	public Administrativo(String nome,double salario,int numeroMatricula) {
		super(nome,salario,numeroMatricula);
	}

	@Override
	public void exibeDados() {
		System.out.println("Nome funcionário: " + super.getNome());
		System.out.println("Matrícula funcionário:" + super.getNumeroMatricula());
		System.out.println("Salário funcionário: " + super.getSalario());
		System.out.println("Função funcionário: Administrativo");
	}
}

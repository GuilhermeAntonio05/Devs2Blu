package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Funcionarios funcionario = new Funcionarios("Pedro", 2000);
		Assistente assistente = new Assistente("Adriano", 2500, 1000);
		Tecnico tecnico = new Tecnico("Heitor", 5000, 3000);
		Administrativo administrativo = new Administrativo("Ana", 1500, 4000);

		// funcionario.exibeDados();
		// System.out.println();
		// funcionario.ganhoAnual();
		// funcionario.addAumento(500);
		// System.out.println();
		// funcionario.exibeDados();
		// funcionario.ganhoAnual();

		// assistente.exibeDados();
		// System.out.println();
		// assistente.ganhoAnual();
		// assistente.addAumento(500);
		// System.out.println();
		// assistente.exibeDados();
		// assistente.ganhoAnual();

		// tecnico.exibeDados();
		// System.out.println();
		// tecnico.ganhoAnual();
		// tecnico.addAumento(500);
		// System.out.println();
		// tecnico.exibeDados();
		// tecnico.ganhoAnual();

		// administrativo.exibeDados();
		// System.out.println();
		// administrativo.ganhoAnual();
		// administrativo.addAumento(500);
		// System.out.println();
		// administrativo.exibeDados();
		// administrativo.ganhoAnual();
	}

}

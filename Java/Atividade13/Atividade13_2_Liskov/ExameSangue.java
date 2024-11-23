package Atividade13_2;

import java.util.Random;

public class ExameSangue extends Exame {
	Random r = new Random();

	public ExameSangue(String nomePaciente) {
		super(nomePaciente);
	}

	@Override
	public void resultadoExame() {
		double hemoglobina = r.nextDouble(12,17.5);
		double leucócitos = r.nextDouble(4000,11000);
		double plaquetas = r.nextDouble(150000,450000);
		
		System.out.println("Resultado exame sangue:");
		System.out.println("Paciente: " + getNomePaciente());
		System.out.printf("Hemoglobina: %.2f g/dL%n", hemoglobina);
		System.out.printf("Leucócitos: %.2f células/mm³%n", leucócitos);
		System.out.printf("Plaquetas: %.2f mil/mm³%n", plaquetas);
	}

}
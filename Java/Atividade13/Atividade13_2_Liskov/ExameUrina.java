package Atividade13_2;

import java.util.Random;

public class ExameUrina extends Exame {
	Random r = new Random();

	public ExameUrina(String nomePaciente) {
		super(nomePaciente);
	}

	@Override
	public void resultadoExame() {
		double ph = r.nextInt(5, 8);
		boolean proteina = r.nextBoolean();
		boolean glicose = r.nextBoolean();
		
		System.out.println("Resultado exame urina:");
		System.out.println("Paciente: " + getNomePaciente());
		System.out.printf("PH: %.2f \n", ph);
		System.out.println("Proteína: " + ((proteina) ? "Presente":"Ausente" ));
		System.out.printf("Glicose: " + ((glicose) ? "Presente":"Ausente" ));
	}

}

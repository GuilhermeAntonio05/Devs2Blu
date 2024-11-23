package Atividade13_2;

import java.util.Random;

public class ExameCovid extends Exame{
	Random r = new Random();
	
	public ExameCovid(String nomePaciente) {
		super(nomePaciente);
	}

	@Override
	public void resultadoExame() {
		System.out.println("Restultado exame covid: ");
		System.out.println("Paciente: " + getNomePaciente());
		System.out.print((r.nextInt()>0) ? "Resultado: Positivo" : "Resultado: Negativo");
		System.out.println();
	}

}

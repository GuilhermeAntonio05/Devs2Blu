package Atividade13_2;

public class Main {

	public static void main(String[] args) {
		ExameSangue exameSangue = new ExameSangue("Fabio");
		ExameUrina exameUrina = new ExameUrina("Micaela");
		ExameCovid exameCovid = new ExameCovid("Marcos");
		
		exameSangue.resultadoExame();
		System.out.println();
		exameUrina.resultadoExame();
		System.out.println();
		System.out.println();
		exameCovid.resultadoExame();
	}

}

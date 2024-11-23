package Atividade13_2;

public abstract class Exame {
	private String nomePaciente;
	
	public Exame(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public abstract void resultadoExame();
	
	public String getNomePaciente() {
		return nomePaciente;
	}
}

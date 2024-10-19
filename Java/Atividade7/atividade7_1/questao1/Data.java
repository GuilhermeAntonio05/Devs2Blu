package questao1;

public class Data {

	String data;
	String horaInicio;
	String horaFim;

	public Data(String data, String horaInicio, String horaFim) {
		this.data = data;
		this.horaFim = horaFim;
		this.horaInicio = horaInicio;
	}

	public void status() {
		System.out.println("Data: " + this.data);
		System.out.println("Horario inicio: " + this.horaInicio);
		System.out.println("Horario fim: " + this.horaFim);
	}
}
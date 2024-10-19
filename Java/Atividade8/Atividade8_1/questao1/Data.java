package questao1;

public class Data {

	private String data;
	private String horaInicio;
	private String horaFim;

	public Data(String data, String horaInicio, String horaFim) {
		this.data = data;
		this.horaFim = horaFim;
		this.horaInicio = horaInicio;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public void status() {
		System.out.println("Data: " + this.data);
		System.out.println("Horario inicio: " + this.horaInicio);
		System.out.println("Horario fim: " + this.horaFim);
	}
}
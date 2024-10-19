package Celular;

public class Celular {
	private Bateria bateria = new Bateria();

	public Celular() {
	}

	public Celular(int bateria) {
		this.getBateria().setTotal(bateria);
	}

	public void mexerNoCelular() {
		this.getBateria().setTotal(this.getBateria().getTotal() - 10);
		System.out.println("Você usou seu celular!");
		System.out.println("Bateria: " + this.getBateria().getTotal()+"%");
	}

	public void carregarCelular() {
		this.getBateria().setTotal(this.getBateria().getTotal() + 10);
		System.out.println("Você carregou seu celular!");
		System.out.println("Bateria: " + this.getBateria().getTotal()+"%");
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

}

package Atividade14_2_1;

public class Armazenamento {
	private DispositivosArmazenamentos dispositivo;
	
	public Armazenamento(DispositivosArmazenamentos dispositivo) {
		this.dispositivo = dispositivo;
	}
	
	public void salvar() {
		dispositivo.salvar();
	}
}

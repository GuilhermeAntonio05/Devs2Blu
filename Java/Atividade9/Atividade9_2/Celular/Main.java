package Celular;

public class Main {

	public static void main(String[] args) {
		Celular celular = new Celular(0);
		
		for (int i = 1; i <= 10; i++) {
			celular.carregarCelular();
			System.out.println();
		}
		
		celular.mexerNoCelular();
	
		
	}

}

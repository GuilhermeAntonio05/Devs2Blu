package Atividade14_2_1;

public class BancoDeDados implements DispositivosArmazenamentos {
	@Override
	public void salvar() {
		System.out.println("Salvando no banco de dados.");
	}

}

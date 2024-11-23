package Atividade14_2_1;

public class Main {

	public static void main(String[] args) {
		BancoDeDados db = new BancoDeDados();
		ArquivoDeTexto txt = new ArquivoDeTexto();
		
		Armazenamento armazenamentoDB = new Armazenamento(db);
		Armazenamento armazenamentoTXT = new Armazenamento(txt);
		
		armazenamentoDB.salvar();
		armazenamentoTXT.salvar();
	}
}

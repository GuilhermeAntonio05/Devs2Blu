package Atividade14_1;

public class ImpressoraAvancada implements Impressora, ImprimeRelatorioFinanceiro, ImprimeImagem{

	@Override
	public void imprimirImagem() {
		System.out.println("Imprimindo Imagem!");
	}

	@Override
	public void imprimirRelatorioFinanceiro() {
		System.out.println("Imprimindo Relatorio Financeiro!");		
	}

	@Override
	public void imprimirTexto() {
		System.out.println("Imprimindo Texto!");
		
	}

}

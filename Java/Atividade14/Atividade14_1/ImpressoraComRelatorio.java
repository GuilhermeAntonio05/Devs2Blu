package Atividade14_1;

public class ImpressoraComRelatorio implements Impressora, ImprimeRelatorioFinanceiro{

	@Override
	public void imprimirRelatorioFinanceiro() {
		System.out.println("Imprimindo Relatório Financeiro!");
	}

	@Override
	public void imprimirTexto() {
		System.out.println("Imprimindo Texto!");
	}

}

package Atividade14_1;

public class Main {
	public static void main(String[] args) {
		ImpressoraBasica basica = new ImpressoraBasica();
		ImpressoraComImagem comImagem = new ImpressoraComImagem();
		ImpressoraComRelatorio comRelatorio = new ImpressoraComRelatorio();
		ImpressoraAvancada avancada = new ImpressoraAvancada();
		
		System.out.println();
		System.out.println("Impressora básica");
		basica.imprimirTexto();
		
		System.out.println();
		System.out.println("Impressora C/ imagem");
		comImagem.imprimirImagem();
		comImagem.imprimirTexto();

		System.out.println();
		System.out.println("Impressora C/ Relatório");
		comRelatorio.imprimirTexto();
		comRelatorio.imprimirRelatorioFinanceiro();
		
		System.out.println();
		System.out.println("Impressora Avancada");
		avancada.imprimirImagem();
		avancada.imprimirRelatorioFinanceiro();
		avancada.imprimirTexto();
	}
}

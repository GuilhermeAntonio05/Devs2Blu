package Atividade14_1;

public class ImpressoraComImagem implements Impressora, ImprimeImagem{

	@Override
	public void imprimirImagem() {
System.out.println("Imprimindo Imagem!");		
	}

	@Override
	public void imprimirTexto() {
		System.out.println("Imprimindo Texto!");		
	}

}

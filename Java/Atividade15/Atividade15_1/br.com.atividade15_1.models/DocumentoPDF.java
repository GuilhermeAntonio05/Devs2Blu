package br.com.atividade15_1.factory.models;

import br.com.atividade15_1.factory.factory.Documento;

public class DocumentoPDF implements Documento{

	@Override
	public void abrir() {
		System.out.println("Abrindo PDF!");
	}

}

package br.com.atividade15_1.factory.models;

import br.com.atividade15_1.factory.factory.Documento;

public class DocumentoWord implements Documento{

	@Override
	public void abrir() {
		System.out.println("Abrindo Word!");		
	}

}

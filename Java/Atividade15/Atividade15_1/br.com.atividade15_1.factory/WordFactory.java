package br.com.atividade15_1.factory.factory;

import br.com.atividade15_1.factory.models.DocumentoWord;

public class WordFactory extends DocumentoFactory {

	@Override
	public Documento criarDocumento() {
		return new DocumentoWord();
	}
	
}

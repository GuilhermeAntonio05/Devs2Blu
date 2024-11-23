package br.com.atividade15_1.factory.factory;

import br.com.atividade15_1.factory.models.DocumentoPDF;

public class PDFFactory extends DocumentoFactory{

	@Override
	public Documento criarDocumento() {
		return new DocumentoPDF();
	}

}

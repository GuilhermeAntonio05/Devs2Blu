package br.com.atividade15_1.factory.models;

import br.com.atividade15_1.factory.factory.*;

public class Cliente {
	public static void main(String[] args) {
		DocumentoFactory docFac = new PDFFactory();
		Documento doc = docFac.criarDocumento();
		doc.abrir();

		docFac = new WordFactory();
		doc = docFac.criarDocumento();
		doc.abrir();
	}
}

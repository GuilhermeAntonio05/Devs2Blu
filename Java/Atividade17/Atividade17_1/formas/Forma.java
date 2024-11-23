package br.com.atividade17_1.bridge.formas;

import br.com.atividade17_1.bridge.cores.Cor;
import br.com.atividade17_1.bridge.estilos.Estilo;

//Abstra��o
public abstract class Forma {
	protected Cor cor;
	protected Estilo estilo;

	// Construtor que recebe uma implementa��o de cor
	protected Forma(Cor cor, Estilo estilo) {
		this.cor = cor;
		this.estilo = estilo;
	}

	public abstract void desenhar();
}

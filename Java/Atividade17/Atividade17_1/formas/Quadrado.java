package br.com.atividade17_1.bridge.formas;

import br.com.atividade17_1.bridge.cores.Cor;
import br.com.atividade17_1.bridge.estilos.Estilo;

//Abstra��o Refinada para um Quadrado
public class Quadrado extends Forma {
	public Quadrado(Cor cor, Estilo estilo) {
		super(cor, estilo);
	}

	@Override
	public void desenhar() {
		System.out.print("Desenhando um quadrado com ");
		cor.aplicarCor();
		estilo.aplicarEstilo();
		System.out.println();
	}
}

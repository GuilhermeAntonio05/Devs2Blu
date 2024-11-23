package br.com.atividade17_1.bridge.formas;

import br.com.atividade17_1.bridge.cores.Cor;
import br.com.atividade17_1.bridge.estilos.Estilo;

//Abstra��o Refinada para um C�rculo
public class Circulo extends Forma {
	public Circulo(Cor cor, Estilo estilo) {
		super(cor, estilo);
	}

	@Override
	public void desenhar() {
		System.out.print("Desenhando um circulo com ");
		cor.aplicarCor();
		estilo.aplicarEstilo();
		System.out.println();
	}
}
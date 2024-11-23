package br.com.atividade17_1.bridge.formas;

import br.com.atividade17_1.bridge.cores.Cor;
import br.com.atividade17_1.bridge.estilos.Estilo;

public class Triangulo extends Forma {

	public Triangulo(Cor cor, Estilo estilo) {
		super(cor, estilo);
	}

	@Override
	public void desenhar() {
		System.out.print("Desenhando um triangulo com ");
		cor.aplicarCor();
		estilo.aplicarEstilo();
		System.out.println();
	}
}

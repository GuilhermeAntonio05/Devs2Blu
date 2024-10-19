package jogoDaVelha;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		JogoDaVelha jogoDaVelha = new JogoDaVelha();
		
		while(!jogoDaVelha.ganhou) {
			jogoDaVelha.exibirJogador();
			jogoDaVelha.imprimirTabuleiro();
			jogoDaVelha.verificaPosicaoValida();
			jogoDaVelha.verificaGanhador();
		}
		
		scan.close();
	}

}

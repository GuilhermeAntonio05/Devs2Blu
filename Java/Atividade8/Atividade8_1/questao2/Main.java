package questao2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==========================================");
		System.out.println(" INICIANDO SISTEMA DE CADASTRO DE PROVAS");
		System.out.println("==========================================");
		
		System.out.print("Insira uma data: ");
		String data = sc.nextLine();
		System.out.print("Insira a série do aluno: ");
		int serie = sc.nextInt();
		System.out.print("Quantas perguntas deseja adicionar: ");
		int quantidadePerguntas = sc.nextInt();
		System.out.println();

		Questoes questoes = new Questoes(data, serie, quantidadePerguntas);
		questoes.adicionarQuestoes();
		questoes.adicionarGabarito();
		questoes.escreverQuestoes();
		questoes.escrevergabarito();
		
		sc.close();
	}
}

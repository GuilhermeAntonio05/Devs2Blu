package questao2;

import java.util.Scanner;

public class Questoes {
	Scanner sc = new Scanner(System.in);
	int serie;
	String data;
	int[] bimestres;
	String[] materias;
	String[] questoes;
	String gabarito[];

	Questoes(String data, int serie, int quantidadePerguntas) {
		this.bimestres = new int[quantidadePerguntas];
		this.materias = new String[quantidadePerguntas];
		this.serie = serie;
		this.data = data;
		this.questoes = new String[quantidadePerguntas];
		this.gabarito = new String[quantidadePerguntas];
	}

	void adicionarQuestoes() {
		for (int i = 0; i < questoes.length; i++) {
			
			System.out.println("=======================");
			System.out.println(" INSERINDO PERGUNTAS");
			System.out.println("=======================");
			
			System.out.print(i + "# Escreva a materia: ");
			this.materias[i] = sc.nextLine();
			System.out.print(i + "# Escreva o bimestre: ");
			this.bimestres[i] = sc.nextInt();
			sc.nextLine();
			System.out.print(i + "# Escreva a pergunta: ");
			this.questoes[i] = sc.nextLine();
			
		}
		System.out.println();
	}
	

	void escreverQuestoes() {
		
		System.out.println("=======================");
		System.out.println(" ESCREVENDO PERGUNTAS");
		System.out.println("=======================");
		
		for (int i = 0; i < questoes.length; i++) {
			System.out.println("Data: " + this.data);
			System.out.println("Questão: " + this.questoes[i] + " | Materia: " + this.materias[i] + " | Bimestre: "
					+ this.bimestres[i]);
		}
		System.out.println();
	}
	
	void adicionarGabarito() {
		
		System.out.println("=======================");
		System.out.println(" ADICIONANDO GABARITO");
		System.out.println("=======================");
		
		for (int i = 0; i < questoes.length; i++) {
			System.out.print(i + "# gabarito '"+questoes[i]+"': ");
			this.gabarito[i] = sc.nextLine();
		}
		System.out.println();
	}
	
	void escrevergabarito() {
		
		System.out.println("=======================");
		System.out.println(" ESCREVENDO GABARITO");
		System.out.println("=======================");
		
		for (int i = 0; i < questoes.length; i++) {
			System.out.println("Data: " + this.data);
			System.out.print(i + "# gabarito: " + gabarito[i]);
		}
		System.out.println();
	}
}

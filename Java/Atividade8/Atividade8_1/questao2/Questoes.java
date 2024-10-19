package questao2;

import java.util.Scanner;

public class Questoes {
	private Scanner sc = new Scanner(System.in);
	private int serie;
	private String data;
	private int[] bimestres;
	private String[] materias;
	private String[] questoes;
	private String gabarito[];

	Questoes(String data, int serie, int quantidadePerguntas) {
		this.bimestres = new int[quantidadePerguntas];
		this.materias = new String[quantidadePerguntas];
		this.serie = serie;
		this.data = data;
		this.questoes = new String[quantidadePerguntas];
		this.gabarito = new String[quantidadePerguntas];
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public int[] getBimestres() {
		return bimestres;
	}

	public void setBimestres(int[] bimestres) {
		this.bimestres = bimestres;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}

	public String[] getQuestoes() {
		return questoes;
	}

	public void setQuestoes(String[] questoes) {
		this.questoes = questoes;
	}

	public String[] getGabarito() {
		return gabarito;
	}

	public void setGabarito(String[] gabarito) {
		this.gabarito = gabarito;
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
			System.out.print(i + "# gabarito '" + questoes[i] + "': ");
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
			System.out.print(i + "# gabarito: " + this.gabarito[i]);
		}
		System.out.println();
	}
}

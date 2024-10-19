package Atividade11_ProjetoPesquisa_V1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ProjetoPesquisa> ProjetoPesquisa = new ArrayList<ProjetoPesquisa>();
		List<Pesquisador> equipe = new ArrayList<Pesquisador>();

		// variaveis utilizadas
		int opcao = -1;

		System.out.println("+-----------------------------+");
		System.out.println("|  Criando Novo Projeto	      |");
		System.out.println("+-----------------------------+");

		// criação de projeto

		System.out.print("Título: ");
		String titulo = sc.nextLine();

		System.out.print("Data início: ");
		String dataInicio = sc.nextLine();

		System.out.print("Data Fim:");
		String dataFim = sc.nextLine();

		System.out.println();

		// Adicionando equipe

		System.out.println("Insira as informações sobre o professor: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Salário: ");
		double salario = sc.nextDouble();
		sc.nextLine();

		equipe.add(new Professor(nome, salario));

		System.out.println();

		System.out.println("Digite o nome do aluno: ");
		nome = sc.nextLine();
		equipe.add(new Aluno(nome));

		ProjetoPesquisa.add(new ProjetoPesquisa(titulo, dataInicio, dataFim, equipe));
		equipe.clear();

		// Limpeza da equipe (equipe.clear()) , isso garante de que nenhum outro objeto
		// ALUNO ou PROFESSOR seja referenciado em outro ProjetoPesquisa.

		System.out.println();
		System.out.println("Adicionar: ");
		System.out.println("Professor - 1 ");
		System.out.println("Aluno - 2 ");
		System.out.println("Não adicionar ninguém - 0 ");
		System.out.println();

		do {
			System.out.println("Qual pessoa deseja inserir? ");
			System.out.print(">> ");
			opcao = sc.nextInt();
			sc.nextLine();
		} while (opcao != 1 && opcao != 2 && opcao != 0);

		if (opcao == 1) {
			System.out.println("Insira as informações sobre o professor: ");
			System.out.print("Nome: ");
			nome = sc.nextLine();

			System.out.print("Salário: ");
			salario = sc.nextDouble();
			sc.nextLine();

			ProjetoPesquisa.get(0).adicionarProfessor(new Professor(nome, salario));
			
		} else if (opcao == 2) {
			System.out.println("Digite o nome do aluno: ");
			nome = sc.nextLine();

			ProjetoPesquisa.get(0).adicionarAluno(new Aluno(nome));
		}

		System.out.println();

		// Exibindo informações do projeto selecionado
		
		for (ProjetoPesquisa x : ProjetoPesquisa) {
			System.out.println("Título: " + x.getTitulo());
			System.out.println("Data de início: " + x.getDataDeInicio());
			System.out.println("Data de finalização: " + x.getDataDeFim());
			System.out.println("Professor reponsável: " + x.getProfessorResponsavel());
			System.out.println("Equipe: ");
			x.mostrarEquipe();
			System.out.println();
		}
		
		sc.close();
	}
}

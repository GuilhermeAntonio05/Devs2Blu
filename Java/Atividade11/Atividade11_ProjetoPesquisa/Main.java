package Atividade11_ProjetoPesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ProjetoPesquisa> ProjetoPesquisa = new ArrayList<ProjetoPesquisa>();
		List<Pesquisador> equipe = new ArrayList<Pesquisador>();
		boolean SistemaOnline = true;
		int id = 0;
		int opcao = 0;
		int idPesquisa;

		// equipe.add(new Professor("Eder", 1000));
		// equipe.add(new Aluno("Alan"));
		// equipe.add(new Aluno("Pedrita"));

		// ProjetoPesquisa.add(new ProjetoPesquisa(01, "Teste", "16/10/2024",
		// "16/10/2025", equipe));

		// System.out.println(equipe.get(0).getTipo());

		do {
			System.out.println("+-----------------------------+");
			System.out.println("|    	      Menu	      |");
			System.out.println("+-----------------------------+");
			System.out.println("|Criar Projeto - 1	      |");
			System.out.println("|Adicionar Professor - 2      |");
			System.out.println("|Adicionar Aluno - 3	      |");
			System.out.println("|Mostrar Listas - 4	      |");
			System.out.println("|Sair - 0	    	      |");
			System.out.println("+-----------------------------+");
			System.out.print(">> ");

			if (id <= 0 && opcao != 1) {
				do {
					System.out.println("Crie seu 1° projeto.");
					System.out.print(">> ");
					opcao = sc.nextInt();
					sc.nextLine();
				} while (opcao != 1);
			} else {
				opcao = sc.nextInt();
				sc.nextLine();
			}

			System.out.println();

			switch (opcao) {
			case 1:
				++id;
				System.out.print("Título: ");
				String titulo = sc.nextLine();

				System.out.print("Data início: ");
				String dataInicio = sc.nextLine();

				System.out.print("Data Fim:");
				String dataFim = sc.nextLine();

				// Adicionando equipe

				System.out.println("Insira as informações sobre o professor: ");
				System.out.print("Nome: ");
				String nome = sc.nextLine();

				System.out.print("Salário: ");
				double salario = sc.nextDouble();
				sc.nextLine();

				equipe.add(new Professor(nome, salario));

				System.out.println();
				System.out.print("Quantos alunos fazem parte do projeto: ");
				int quantidadeAlunos = sc.nextInt();
				sc.nextLine();

				for (int i = 0; i < quantidadeAlunos; i++) {
					System.out.println("Digite o nome do aluno: ");
					nome = sc.nextLine();
					equipe.add(new Aluno(nome));
				}

				ProjetoPesquisa.add(new ProjetoPesquisa(id, titulo, dataInicio, dataFim, equipe));
				equipe.clear();
				break;

			case 2:
				System.out.println("Insira o código do projeto: ");
				idPesquisa = sc.nextInt() - 1;
				sc.nextLine();

				System.out.println("Insira as informações sobre o professor: ");
				System.out.print("Nome: ");
				nome = sc.nextLine();

				System.out.print("Salário: ");
				salario = sc.nextDouble();
				sc.nextLine();

				ProjetoPesquisa.get(idPesquisa).adicionarProfessor(new Professor(nome, salario));
				break;

			case 3:
				System.out.println("Insira o código do projeto: ");
				idPesquisa = sc.nextInt() - 1;
				sc.nextLine();

				System.out.println("Digite o nome do aluno: ");
				nome = sc.nextLine();

				ProjetoPesquisa.get(idPesquisa).adicionarAluno(new Aluno(nome));
				break;

			case 4:
				for (ProjetoPesquisa x : ProjetoPesquisa) {
					System.out.print("Código: " + x.getCodigo() + "	|Título: " + x.getTitulo());
					System.out.println();
				}

				System.out.println(">> Selecione o Código da pesquisa");
				System.out.print(">> ");
				idPesquisa = sc.nextInt() - 1;
				sc.nextLine();

				System.out.println();

				System.out.println("Código: " + ProjetoPesquisa.get(idPesquisa).getCodigo());
				System.out.println("Título: " + ProjetoPesquisa.get(idPesquisa).getTitulo());
				System.out.println("Data de início: " + ProjetoPesquisa.get(idPesquisa).getDataDeInicio());
				System.out.println("Data de finalização: " + ProjetoPesquisa.get(idPesquisa).getDataDeFim());
				System.out
						.println("Professor reponsável: " + ProjetoPesquisa.get(idPesquisa).getProfessorResponsavel());
				System.out.println("Equipe: ");
				ProjetoPesquisa.get(idPesquisa).mostrarEquipe();
				System.out.println();
				break;

			case 0:
				SistemaOnline = false;
				break;

			default:
				System.out.println("Entrada não encontrada!");
				break;
			}

		} while (SistemaOnline);

		sc.close();
	}
}

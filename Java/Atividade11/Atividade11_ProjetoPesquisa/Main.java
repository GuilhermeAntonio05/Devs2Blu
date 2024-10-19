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
		int codigo = 0;

		// equipe.add(new Professor("Eder", 1000));
		// equipe.add(new Aluno("Alan"));
		// equipe.add(new Aluno("Pedrita"));

		// ProjetoPesquisa.add(new ProjetoPesquisa(01, "Teste", "16/10/2024",
		// "16/10/2025", equipe));

		// System.out.println(equipe.get(0).getTipo());

		do {
			System.out.println("Criar Projeto - 1");
			System.out.println("Adicionar Professor - 2");
			System.out.println("Adicionar Aluno - 3");
			System.out.println("Sair - 0");
			int opcao = sc.nextInt();
			sc.nextLine();

			switch (opcao) {
			case 1:
				++codigo;
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

				ProjetoPesquisa.add(new ProjetoPesquisa(codigo, titulo, dataInicio, dataFim, equipe));
				break;

			case 0:
				SistemaOnline = false;
				break;

			default:
				System.out.println("Entrada não encontrada!");
				break;
			}

		} while (SistemaOnline);

		for (ProjetoPesquisa x : ProjetoPesquisa) {
			System.out.println(x.getCodigo());
			System.out.println(x.getTitulo());
			System.out.println(x.getDataDeInicio());
			System.out.println(x.getDataDeFim());
			System.out.println(x.getProfessorResponsavel());
			x.mostrarEquipe();
		}

		sc.close();
	}
}

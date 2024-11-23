package AtividadeProjetoPesquisa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<ProjetoPesquisa> Pp = new ArrayList<ProjetoPesquisa>();
		List<Pesquisador> equipe = new ArrayList<Pesquisador>();
		equipe.add(new Professor("Eder", 1000));
		equipe.add(new Aluno("Alan"));
		equipe.add(new Aluno("Pedrita"));

		
		Pp.add(new ProjetoPesquisa(01, "Teste", "16/10/2024", "16/10/2025", "Helena", equipe));

		System.out.println(equipe.get(0).getTipo());
		
		for (ProjetoPesquisa x : Pp) {
			System.out.println(x);
		}

	}
}

package AtividadeProjetoPesquisa;

import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
	private int codigo;
	private String titulo;
	private String dataDeInicio;
	private String dataDeFim;
	private String professorResponsavel;
	private List<Pesquisador> equipe = new ArrayList<Pesquisador>();

	public ProjetoPesquisa() {
	}

	public ProjetoPesquisa(int codigo, String titulo, String dataDeInicio, String dataDeFim,
			String professorResponsavel, List<Pesquisador> equipe) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.dataDeInicio = dataDeInicio;
		this.dataDeFim = dataDeFim;
		this.professorResponsavel = professorResponsavel;
		this.equipe = equipe;
	}

	public ProjetoPesquisa(int codigo, String titulo, String dataDeInicio, String dataDeFim,
			String professorResponsavel) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.dataDeInicio = dataDeInicio;
		this.dataDeFim = dataDeFim;
		this.professorResponsavel = professorResponsavel;
	}

	public void selecionarProfessor() {
		for (int i = 0; i < equipe.size(); i++) {
			if (equipe.get(i).getTipo() == "Professor") {
				setProfessorResponsavel(equipe.get(i).getNome()); 
			} 
		}
	}

	public void adicionarProfessor(Professor professor) {
		equipe.add(professor);
	}

	public void adicionarAluno(Aluno aluno) {
		equipe.add(aluno);
	}

	public boolean verificarPessoa(String nome) {
		boolean cadastrado = false;

		for (int i = 0; i < equipe.size(); i++) {
			if (equipe.get(i).getNome() == nome) {
				System.out.println("Usuário já cadastrado");
				cadastrado = true;
				break;
			}
		}

		return cadastrado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDataDeInicio() {
		return dataDeInicio;
	}

	public void setDataDeInicio(String dataDeInicio) {
		this.dataDeInicio = dataDeInicio;
	}

	public String getDataDeFim() {
		return dataDeFim;
	}

	public void setDataDeFim(String dataDeFim) {
		this.dataDeFim = dataDeFim;
	}

	public String getProfessorResponsavel() {
		return professorResponsavel;
	}

	public void setProfessorResponsavel(String professorResponsavel) {
		this.professorResponsavel = professorResponsavel;
	}

	public List<Pesquisador> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Pesquisador> equipe) {
		this.equipe = equipe;
	}

}

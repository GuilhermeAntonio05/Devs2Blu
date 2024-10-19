package Atividade11_ProjetoPesquisa;

import java.util.ArrayList;
import java.util.List;

public class ProjetoPesquisa {
	private int codigo;
	private String titulo;
	private String dataDeInicio;
	private String dataDeFim;
	private String professorResponsavel;
	private List<Pesquisador> equipe;

	// Construtores
	public ProjetoPesquisa() {
	}

	public ProjetoPesquisa(int codigo, String titulo, String dataDeInicio, String dataDeFim, List<Pesquisador> equipe) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.dataDeInicio = dataDeInicio;
		this.dataDeFim = dataDeFim;
		this.equipe = new ArrayList<Pesquisador>(equipe);
		this.professorResponsavel = selecionarProfessor();
	}

	// Métodos
	public String selecionarProfessor() {
		String nome = null;
		for (int i = 0; i < this.equipe.size(); i++) {
			if (this.equipe.get(i).getTipo() == "Professor") {
				nome = this.equipe.get(i).getNome();
				break;
			}
		}
		return nome;
	}

	public void adicionarProfessor(Professor professor) {
		this.equipe.add(professor);
	}

	public void adicionarAluno(Aluno aluno) {
		this.equipe.add(aluno);
	}

	public void mostrarEquipe() {
		for (Pesquisador x : this.equipe) {
			System.out.println("Nome: " + x.getNome() + "	|Tipo: " + x.getTipo());
		}
	}

	// Área dos gets - Sets
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

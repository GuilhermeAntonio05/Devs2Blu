package br.com.atividade17_2.bridge.Empregados;

import br.com.atividade17_2.bridge.Formatos.Formato;

public abstract class Empregado {
	protected Formato formato;
	private String nome;
	private double salario;
	private int idade;
	private String funcao;

	public Empregado(Formato formato, String nome, double salario, int idade, String funcao) {
		this.formato = formato;
		this.nome = nome;
		this.salario = salario;
		this.idade = idade;
		this.funcao = funcao;
	}

	public abstract void relatorio();

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}

	public int getIdade() {
		return idade;
	}
	
	public String getFuncao() {
		return funcao;
	}
}

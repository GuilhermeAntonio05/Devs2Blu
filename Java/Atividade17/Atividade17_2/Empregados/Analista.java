package br.com.atividade17_2.bridge.Empregados;

import br.com.atividade17_2.bridge.Formatos.Formato;

public class Analista extends Empregado{
	
	public Analista(Formato formato, String nome, double salario, int idade) {
		super(formato, nome, salario, idade, "Analista");
	}

	@Override
	public void relatorio() {
		formato.escrever(getNome(), getIdade(), getSalario(), getFuncao());
	}
}

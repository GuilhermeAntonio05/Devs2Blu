package br.com.atividade17_2.bridge.Empregados;

import br.com.atividade17_2.bridge.Formatos.Formato;

public class GerenteDeProjetos extends Empregado {

	public GerenteDeProjetos(Formato formato, String nome, double salario, int idade) {
		super(formato, nome, salario, idade, "Gerente De Projetos");
	}

	@Override
	public void relatorio() {
		formato.escrever(getNome(), getIdade(), getSalario(), getFuncao());
	}

}

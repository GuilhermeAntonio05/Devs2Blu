package br.com.atividade17_2.bridge.Formatos;

public class Cvs implements Formato {

	@Override
	public void escrever(String nome, int idade, Double salario, String funcao) {
		System.out.println(nome + "," + idade + "," + salario + "," + funcao);
	}

}

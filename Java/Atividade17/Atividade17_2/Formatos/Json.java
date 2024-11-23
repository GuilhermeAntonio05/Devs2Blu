package br.com.atividade17_2.bridge.Formatos;

public class Json implements Formato {

	@Override
	public void escrever(String nome, int idade, Double salario, String funcao) {
		System.out.println("Empregado:[");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: : " + salario);
		System.out.println("Função: : " + funcao);
		System.out.println("]");
	}

}

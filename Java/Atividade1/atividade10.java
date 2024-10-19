package atividade;
import java.util.Scanner;

public class atividade10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o salário base de um funcionário: ");
		double salarioBase = sc.nextDouble();
		double gratificacao = salarioBase * 0.05;
		double imposto = salarioBase * 0.07;
		double salarioFinal = salarioBase + gratificacao - imposto;

		System.out.printf("Salário base: %.2f %nGratifição: %.2f %nImposto: %.2f %nSalário Final: %.2f", salarioBase,
				gratificacao, imposto, salarioFinal);
		sc.close();
	}

}

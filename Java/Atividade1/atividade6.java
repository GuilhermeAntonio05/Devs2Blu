package atividade;
import java.util.Scanner;

public class atividade6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantas folhas deseja copiar: ");
		double folha = sc.nextInt() * 0.16;
		System.out.println("Custo: R$" + folha);

		sc.close();
	}
}

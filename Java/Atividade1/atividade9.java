package atividade;
import java.util.Scanner;

public class atividade9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Me informe o valor de um produto para reajuste (9%): ");
		double valor = sc.nextDouble();
		valor = valor - (valor * 0.09);
		System.out.print("O reajuste foi de: " + valor);
	}

}

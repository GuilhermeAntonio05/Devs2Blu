package atividade;
import java.util.Scanner;

public class atividade3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira dois valores: ");
		double num1 = sc.nextDouble();
		sc.nextLine();
		double num2 = sc.nextDouble();
		System.out.printf("A soma dos valores: %.2f%nO dobro dos valores: %.2f", num1 + num2, (num1 + num2) * 2);
		sc.close();
	}

}

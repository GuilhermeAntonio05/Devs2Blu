package atividade5;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1 = 0;
		double n2 = 0;
		double n3 = 0;
		double exec = 0;
		double mediaAproveitamento;

		System.out.println("n1: ");
		sc.nextDouble();
		System.out.println("n2:");
		sc.nextDouble();
		System.out.println("n3: ");
		sc.nextDouble();
		System.out.println("Exercícios: ");
		
		mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + exec) / 7;
		
		if (mediaAproveitamento >= 9) {
			System.out.println("A ");
		} else if (mediaAproveitamento >= 7.5) {
			System.out.println("B ");
		} else if (mediaAproveitamento >= 6) {
			System.out.println("C ");
		} else {
			System.out.println("D ");
		}
		
		sc.close();

	}

}

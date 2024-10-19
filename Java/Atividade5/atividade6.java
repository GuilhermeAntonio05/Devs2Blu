package atividade5;

import java.util.Scanner;

public class atividade6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String letra = sc.nextLine();
		char charletra  = letra.charAt(0);
		if (charletra == 'a' || charletra == 'e' || charletra == 'i' || charletra == 'o' || charletra == 'u') {
			System.out.println("Sua letra é vogal!");
		} else {
			System.out.println("Sua letra é uma consoante");
		}
		sc.close();
	}

}

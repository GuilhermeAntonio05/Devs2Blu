package atividade;
import java.util.Scanner;

public class atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Em que ano você nasceu: ");
		int idade = sc.nextInt();
		int ano = 2024;
		System.out.print("Você tem " + (ano - idade) + " anos");
		sc.close();
	}

}

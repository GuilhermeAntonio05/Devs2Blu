package atividade;
import java.util.Scanner;

public class atividade7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Me diga seu nome: ");
		String nome = sc.nextLine();
		System.out.print("Me diga sua idade: ");
		int idade = sc.nextInt();
		System.out.printf("Olá %s você viveu aproximadamente %d dias", nome, idade * 365);
		sc.close();
	}
}

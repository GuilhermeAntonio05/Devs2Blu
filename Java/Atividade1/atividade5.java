package atividade;
import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quanto tempo (em minutos), você utilizou a vaga: ");
		double minutos = sc.nextDouble() / 60;
		System.out.println(minutos * 2.3);
		sc.close();
	}
}

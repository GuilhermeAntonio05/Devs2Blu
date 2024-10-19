package atividade;
import java.util.Locale;
import java.util.Scanner;

class atividade1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Por favor digite um saldo pra reajuste (1%): ");
		double saldo = sc.nextDouble();
		saldo = saldo+(saldo*0.01);
		System.out.printf("Saldo com reajuste: %.2f",saldo);
		sc.close();
	}
}
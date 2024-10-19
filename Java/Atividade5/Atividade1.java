package atividade5;

import java.util.Scanner;

public class Atividade1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Valor do produto: ");
		double valor = sc.nextDouble();
		System.out.println("Valor do pagamento: ");
		double pagamento = sc.nextDouble();
		double troco = pagamento - valor;
		int nota1 = 0;
		int nota10 = 0;
		int nota100 = 0;

		if (troco > 0) {
			
			while (troco > 0) {
				if (troco >= 100) {
					troco -= 100;
					nota100++;
				} else if (troco >= 10) {
					troco -= 10;
					nota10++;
				} else {
					troco -= 1;
					nota1++;
				}
			}
			
			System.out.println("Nota100: " + nota100 + " Nota10: " + nota10 + " nota1: " + nota1);
		} else {
			System.out.println("Pagamento insulficiente");
		}
	}
}

package atividade;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = sc.nextDouble();
		sc.nextLine();
		double num2 = sc.nextDouble();
		sc.nextLine();
		int operador = sc.nextInt();
		double conta = 0;

		switch (operador) {
		case 1: {
			conta = num1 + num2;
			break;
		}
		case 2: {
			conta = num1 - num2;
			break;
		}
		case 3: {
			conta = num1 * num2;
			break;
		}
		case 4: {
			conta = num1 / num2;
			break;
		}
		default:
			System.out.println("Operador inválido");
		}
		
		String positivoNegativo = (conta>=0) ?"Positivo":"negativo";
		String parImpar = (conta%2==0)?"Par":"Impar";
		
		System.out.println("Resultado: ");
		System.out.println("-> " + conta);
		System.out.println("-> "+ positivoNegativo);
		System.out.println("-> "+ parImpar);

		sc.close();

	}

}

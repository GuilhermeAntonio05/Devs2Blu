package atividade;
import java.util.Locale;
import java.util.Scanner;

public class atividade8 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Me informe uma certa quantidade de horas: ");
		double horas = sc.nextDouble();
		double segundos = horas * 3600;
		double minutos = horas * 60;

		System.out.println("Minutos: " + minutos);
		System.out.println("Segundos: " + segundos);

		sc.close();
	}
}

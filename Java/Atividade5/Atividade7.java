package atividade5;

import java.util.Scanner;

public class Atividade7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ano =0; 
		boolean bissexto = false; 
		ano = sc.nextInt();
		
		if (ano%400==0) {
			bissexto = true;
		} else if(ano%4==0 && ano%100 != 0) {
			bissexto = true;
		}else {
			bissexto = false;
		}
		System.out.printf("Seu ano é %s" , (bissexto)?"bissexto":"um ano comum");
	}
}

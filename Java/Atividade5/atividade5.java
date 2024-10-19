package atividade5;

import java.util.Scanner;

public class atividade5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pagamento = sc.nextDouble();
		sc.nextLine();
		double desconto = 0.1;
		int formaDePagamento = sc.nextInt();
		double valor = 0;

		switch (formaDePagamento) {
		case 1: {
			if(pagamento>=100) {
				desconto = pagamento * desconto;
				valor = pagamento - desconto;	
			}
			
			break;
		}
		default:
			System.out.println("Forma de pagamento inválida");
		}
		
		if(formaDePagamento==1){
			System.out.println("Pagamento efetuado no valor de "+ pagamento);
			System.out.println("Desconto aplicado: "+ desconto);
			System.out.println("Pagamento c/ desconto: " + valor);
		}

		sc.close();
	}

}
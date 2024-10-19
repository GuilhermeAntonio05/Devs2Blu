package questao1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=================================");
		System.out.println("	Adicionando cliente");
		System.out.println("=================================");
		System.out.print("Nome do cliente: ");
		String nome = sc.nextLine();
		System.out.print("telefone do cliente [(99) 9 9999-9999]: ");
		String telefone = sc.nextLine();
		System.out.print("Cor da toalha: ");
		String corToalha = sc.nextLine();
		System.out.print("Tema da festa [1 - Castelo, 2 - Boneca da Cinderela, 3 - Bruxa]: ");
		int temaFesta = sc.nextInt();
		sc.nextLine();
		System.out.print("Insira o valor do aluguel: ");
		double valorAlugel = sc.nextDouble();
		sc.nextLine();
		System.out.print("Cliente Fiel? s/n: ");
		boolean clienteFiel = (sc.nextLine().equals("s"))? true:false;
		System.out.print("Marcar data da festa: ");
		String dataFesta = sc.nextLine();
		System.out.print("Marcar hora de início da festa: ");
		String horarioInicio = sc.nextLine();
		System.out.print("Marcar hora de fim da festa: ");
		String horarioFim = sc.nextLine();
		System.out.print("Qual o endereço da festa: ");
		String endereco = sc.nextLine();
		

		Cliente cliente = new Cliente(nome, telefone, clienteFiel);
		Local local = new Local(endereco);
		Tema tema = new Tema(corToalha, temaFesta);
                Valor valor = new Valor(cliente.getClienteFiel(), valorAlugel);
		Data data = new Data(dataFesta, horarioInicio, horarioFim);
		
		System.out.println();
		System.out.println("=================================");
		System.out.println("	Tabela cliente");
		System.out.println("=================================");
		cliente.status();
		local.status();
		tema.status();
                valor.status();
		data.status();
		
		sc.close();
	}

}

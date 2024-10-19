package Entrega;

public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Marcos");
		Pedido pedido = new Pedido(cliente, 1000);
		Nota_Fiscal notaFiscal = new Nota_Fiscal(cliente);
		Frete frete = new Frete("Rua das palmeiras");
		
		notaFiscal.gerarNotaFiscal();
		System.out.println("Valor do pedido: "+pedido.getValorTotal());
		frete.enviarPedido();
		
	}

}

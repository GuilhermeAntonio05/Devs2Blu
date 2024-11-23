package Atividade13_2;

public class Main {

	public static void main(String[] args) {
		PagamentoCartao pagamentoCartao = new PagamentoCartao();
		PagamentoBitCoin PagamentoBitCoin = new PagamentoBitCoin();
		PagamentoPayPal PagamentoPayPal = new PagamentoPayPal();
		
		System.out.println("Teste dos pagamentos");
		System.out.println(pagamentoCartao.processarPagamento(100));
		System.out.println(PagamentoBitCoin.processarPagamento(100));
		System.out.println(PagamentoPayPal.processarPagamento(100));
	}

}

package Atividade13_2;

public class PagamentoCartao implements Pagamento {

	@Override
	public String processarPagamento(int valor) {
		String r = "Pagamento via Cartão de Crédito no valor de R$" + valor + " Efetuado!";
		return r;
	}

}

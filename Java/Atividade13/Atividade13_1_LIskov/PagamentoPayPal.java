package Atividade13_2;

public class PagamentoPayPal implements Pagamento {

	@Override
	public String processarPagamento(int valor) {
		String r = "Pagamento via PayPal no valor de R$" + valor + " Efetuado!";
		return r;
	}

}

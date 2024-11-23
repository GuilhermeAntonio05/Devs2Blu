package Atividade13_2;

public class PagamentoBitCoin implements Pagamento {

	@Override
	public String processarPagamento(int valor) {
		String r = "Pagamento via BitCoin no valor de R$" + valor + " Efetuado!";
		return r;
	}

}

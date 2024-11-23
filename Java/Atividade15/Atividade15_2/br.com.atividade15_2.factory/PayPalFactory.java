package br.com.atividade15_2.factory;

import br.com.atividade15_2.models.PagamentoPayPal;

public class PayPalFactory extends PagamentoFactory{

	@Override
	public Pagamento criarPagamento() {
		return new PagamentoPayPal();
	}

}

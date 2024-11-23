package br.com.atividade15_2.models;

import br.com.atividade15_2.factory.Pagamento;

public class PagamentoCartao implements Pagamento {

	@Override
	public void processarPagamento() {
		System.out.println("Pagamento via Cartão Efetuado!");
	}

}

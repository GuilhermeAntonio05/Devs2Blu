package br.com.atividade15_2.factory;

import br.com.atividade15_2.models.PagamentoCartao;

public class CartaoFactory extends PagamentoFactory{

	@Override
	public Pagamento criarPagamento() {
		return new PagamentoCartao();
	}

}

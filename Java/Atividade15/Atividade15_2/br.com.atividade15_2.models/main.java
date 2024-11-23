package br.com.atividade15_2.models;

import br.com.atividade15_2.factory.CartaoFactory;
import br.com.atividade15_2.factory.Pagamento;
import br.com.atividade15_2.factory.PagamentoFactory;
import br.com.atividade15_2.factory.PayPalFactory;

public class main {
	public static void main(String[] args) {

		String TipoPagamento = "Cartão";
		PagamentoFactory pagFac = null;

		if (TipoPagamento.equals("PayPal")) {
			pagFac = new PayPalFactory();
		} else if (TipoPagamento.equals("Cartão")) {
			pagFac = new CartaoFactory();
		}

		Pagamento pagamento = pagFac.criarPagamento();
		pagamento.processarPagamento();

	}
}

package ContaTudoEmUM;

import java.util.ArrayList;
import java.util.List;

public class Conta {
	private String titular;
	private double saldo;
	private List<String> transacoes;

	public Conta(String titular, double saldoInicial) {
		this.titular = titular;
		this.saldo = saldoInicial;
		this.transacoes = new ArrayList<>();
		transacoes.add("Conta criada com saldo inicial de: " + saldoInicial);
	}

	// Fun��o para depositar dinheiro
	public void depositar(double valor) {
		saldo += valor;
		transacoes.add("Dep�sito de: " + valor);
	}

	// Fun��o para sacar dinheiro
	public void sacar(double valor) {
		if (valor <= saldo) {
			saldo -= valor;
			transacoes.add("Saque de: " + valor);
		} else {
			transacoes.add("Tentativa de saque sem saldo suficiente: " + valor);
		}
	}

	// Fun��o para obter saldo atual
	public double obterSaldo() {
		return saldo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public List<String> getTransacoes() {
		return transacoes;
	}

	public void setTransacoes(List<String> transacoes) {
		this.transacoes = transacoes;
	}

}

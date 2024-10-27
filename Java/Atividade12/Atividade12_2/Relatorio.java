package ContaTudoEmUM;

public class Relatorio {
	Conta conta;
	
	public Relatorio(Conta conta) {
		this.conta = conta;
	}
	

	// Fun��o para gerar relat�rio de saldo
    public void gerarRelatorioSaldo() {
        System.out.println("Relat�rio de Saldo");
        System.out.println("Titular: " + conta.getTitular());
        System.out.println("Saldo atual: " + conta.getSaldo());
    }

    // Fun��o para gerar relat�rio de transa��es
    public void gerarRelatorioTransacoes() {
        System.out.println("Relat�rio de Transa��es");
        for (String transacao : conta.getTransacoes()) {
            System.out.println(transacao);
        }
    }
    
    
}

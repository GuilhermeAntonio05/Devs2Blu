package ContaTudoEmUM;

public class Main {
	
	    public static void main(String[] args) {
	    	String titular = "Jo�o Silva";
	    	Double saldo = 500.0; 
	    	
	        Conta conta = new Conta(titular, saldo);
	        Relatorio relatorio = new Relatorio(conta);
	        
	        conta.depositar(200.0);
	        conta.sacar(150.0);
	        relatorio.gerarRelatorioSaldo();
	        relatorio.gerarRelatorioTransacoes();
	    }
}

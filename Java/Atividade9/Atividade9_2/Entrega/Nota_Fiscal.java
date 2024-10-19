package Entrega;

public class Nota_Fiscal {
	private Cliente cliente;

	public Nota_Fiscal(Cliente cliente) {
		this.cliente = cliente;
	}

	public void gerarNotaFiscal() {
		System.out.println("Nota fiscal gerada para o cliente " + this.getCliente().getNome());
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}

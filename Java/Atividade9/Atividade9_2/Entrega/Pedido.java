package Entrega;

class Pedido { 
    private Cliente cliente;
    private double valorTotal; 
 
    public Pedido(Cliente cliente, double valorTotal) { 
        this.cliente = cliente; 
        this.valorTotal = valorTotal; 
    }

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	} 
 
    
} 

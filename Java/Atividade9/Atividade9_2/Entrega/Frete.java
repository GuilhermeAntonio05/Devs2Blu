package Entrega;

public class Frete {
	private String endereco;

	public Frete() {
	}

	public Frete(String endereco) {
		this.endereco = endereco;
	}

	public void enviarPedido() {
		System.out.println("Pedido enviado para: " + endereco);
	}
	
	public void enviarPedido(String endereco) {
		System.out.println("Pedido enviado para: " + endereco);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}

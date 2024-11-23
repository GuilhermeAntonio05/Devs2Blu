package atividade13_1;

public class DescontoProdutoLimpeza implements Desconto{
	@Override
	public double calcularDesconto(Produto produto) {
		return produto.getPreco() * 0.25;
	}
}

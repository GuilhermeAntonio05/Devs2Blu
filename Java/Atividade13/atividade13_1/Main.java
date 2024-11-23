package atividade13_1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		 
		Desconto prodLimpeza = new DescontoProdutoLimpeza();
		Produto detergente =new Produto("detergente",10);
		
		System.out.println("Valor do produto: "+ detergente.getPreco());
		System.out.println("Desconto aplicado: "+prodLimpeza.calcularDesconto(detergente));
		System.out.println("Total: " + (detergente.getPreco()-prodLimpeza.calcularDesconto(detergente)));
	
		
		/*parte 2*/
		List<Produto> produtos= new ArrayList<Produto>();
		List<Desconto> descontos = new ArrayList<Desconto>();
		
		produtos.add(new Produto("Micro-ondas",250));
		produtos.add(new Produto("Jaqueta",50));
		produtos.add(new Produto("Pão de queijo",10));
		
		descontos.add(new DescontoEletroDomestico());
		descontos.add(new DescontoRoupa());
		descontos.add(new DescontoAlimento());
				
		CalculadoraDesconto calculadoraDesconto = new CalculadoraDesconto();
		
		System.out.println("-----------------");
		System.out.println("Desconto total: "+calculadoraDesconto.calcularDescontoTotal(produtos, descontos));
		
	}	
}

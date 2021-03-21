package br.edu.insper.desagil.vaimalte;
import java.util.*;

public class Caixa {
	private Map<Integer,Integer>descontos;
	
	public Caixa() {
		this.descontos=new HashMap<>();	
	}
	
	public void colocaDesconto(Produto produto,int desconto) {
		if (desconto >=1 && desconto <=99) {
			this.descontos.put(produto.getCodigo(),desconto);
			return;
		}
		return;
	}
	public double somaTotal(Carrinho carrinho) {
		double desconto=0;
		float somaT=0;
		
		for (Pedido pedido:carrinho.getPedidos()) {
			
			int codigo = pedido.getProduto().getCodigo();	
			if (this.descontos.containsKey(codigo)){
				desconto=this.descontos.get(codigo)*0.01;
				somaT+= pedido.calcula()*desconto;
			}
			else {
				somaT+= pedido.calcula();
			}
			
		}
		return somaT; 
	}
}

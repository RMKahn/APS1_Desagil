package br.edu.insper.desagil.vaimalte;

import java.util.List;

public class Carrinho {
	private List<Pedido> carrinho;
	private Pedido pedido;

	public Carrinho() {
		super();
	}

	public List<Pedido> getPedidos() {
		return carrinho;
	}
	
	public List<Pedido> adiciona(Produto produto) {
		for (Pedido existente : carrinho) {
			if (existente.getProduto().equals(produto)) {
				pedido.incrementa(pedido.getQuantidade());
			}
		}
		pedido = new Pedido(produto);
		carrinho.add(pedido);
		
		return carrinho;
		
	}

}

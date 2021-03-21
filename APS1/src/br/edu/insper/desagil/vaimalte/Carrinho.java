package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> carrinho;

	public Carrinho() {
		super();
		this.carrinho= new ArrayList<>();
	}

	public List<Pedido> getPedidos() {
		return this.carrinho;
	}	
	
	public void adiciona(Produto produto) {
		for (Pedido existente : carrinho) {
			if (existente.getProduto().getCodigo()==produto.getCodigo()) {
				existente.incrementa();
				return;
			}
		}
		Pedido pedido = new Pedido(produto);
		carrinho.add(pedido);
	}

}

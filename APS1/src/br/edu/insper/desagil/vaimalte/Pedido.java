package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade = 1;
	
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}
	
	public int incrementa(int quantidade){
		quantidade += 1;
		return quantidade;
	}

	public float calcula(int quantidade, Produto produto) {
		float total = quantidade * produto.getPreco();
		return total;
	}
}

package br.edu.insper.desagil.vaimalte;

public class Testador {
	private Produto pera =new Produto(1,"pera",1.5);
	private Produto banana=new Produto(2,"banana",12);
	private Caixa teste= new Caixa();
	private Carrinho carteste= new Carrinho();
	
	
	
	public boolean testeA() {
		double total=teste.somaTotal(carteste);
		if (total==0) {
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		carteste.adiciona(pera);
		double total=teste.somaTotal(carteste);
		
		if (total==1.5) {
			return true;
		}	
		else{
			return false;
		}
	}

	public boolean testeC() {
		carteste.adiciona(pera);
		teste.colocaDesconto(pera,50);
		double total=teste.somaTotal(carteste);
		
		if (total==0.75) {
			return true;
		}
	    return false;
	}

	public boolean testeD() {
		carteste.adiciona(pera);
		carteste.adiciona(banana);
		carteste.adiciona(banana);
		teste.colocaDesconto(pera,50);
		
		double total=teste.somaTotal(carteste);
		
		if (total==24.75){
			return true;
		}
		
		return false;
	}

	public boolean testeE() {
		carteste.adiciona(pera);
		carteste.adiciona(banana);
		carteste.adiciona(banana);
		teste.colocaDesconto(banana, 50);
		
		double total=teste.somaTotal(carteste);
		
		if (total==13.5){
			return true;
		}
	    return false;
	}

}

public class Estoque {
	
	
	private int quantidadeProdutos = 0;
	Produto estoque[];
	
	public Estoque(int size) {
		estoque = new Produto[size];
	}
	
	public void add(Produto produto) {
		if(quantidadeProdutos-1 == estoque.length) {
			System.out.println("Estoque cheio!");
		} else {
			estoque[quantidadeProdutos] = produto;
			quantidadeProdutos++;
		}
	}
	
	public void addQuantidade(String codigo, int quantidade) {
		for(int i = 0; i < quantidadeProdutos; i++) {
			if(estoque[i] != null) {
				if(codigo.equals(estoque[i].getCodigo())) {
					estoque[i].setQuantidade(estoque[i].getQuantidade() + quantidade);
				}
			}
		}
	}
	
	public void removeQuantidade(String codigo, int quantidade) {
		boolean encontrou = false;
		for(int i = 0; i < quantidadeProdutos; i++) {
			if(codigo.equals(estoque[i].getCodigo())) {
				encontrou = true;
				if(estoque[i].getQuantidade() >= quantidade) {
					estoque[i].setQuantidade(estoque[i].getQuantidade()-quantidade);
				}
			}
		}
		if(encontrou == false) {
			System.out.println("Produto "+ codigo +" não existe");
		}
	}
	
	public void print() {
		System.out.println("====== Produtos no estoque ======");
		for(int i = 0; i < quantidadeProdutos; i++) {
			System.out.println(estoque[i]);
		}
	}
	
	public void estoqueBaixo() {
		for(int i = 0; i < quantidadeProdutos; i++) {
			if(estoque[i].getQuantidade() <= estoque[i].getQuantidadeMin()) {
				System.out.println(estoque[i]);
			}
		}
	}
	


}

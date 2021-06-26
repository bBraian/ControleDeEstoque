public class Teste {

	
	public static void main(String[] args) {
		
		Teclado t = new Teclado();
		Estoque estoque = new Estoque(5);
		
		int choice = 0;
		do {
			System.out.println("[1] Inserir produto");
			System.out.println("[2] Adicionar quantidade de produtos no estoque");
			System.out.println("[3] Retirar quantidade de produtos no estoque");
			System.out.println("[4] Listar todos os produtos do estoque");
			System.out.println("[5] Listar produtos que estão abaixo do estoque");
			System.out.println("[6] Sair");
			
			int option = t.leInt();
			
			if(option == 1) { //OPTION 1: INSERIR PRODUTO
				//Criando novo produto
				System.out.println("=== Produto ===");
				String nome = t.leString("Nome: ");
				String codigo = t.leString("Código: ");
				Produto produto = new Produto(codigo, nome);
				System.out.println(nome+" criado e adicionado a lista de produtos");
				estoque.add(produto);
				System.out.println("1 "+nome+ " foi adicionado ao estoque");
				
			} else if(option == 2) { //OPTION 2: INSERIR QUANTIDADE DO PRODUTO NO ESTOQUE
				System.out.println("=== Produto ===");
				String codigo = t.leString("Código: ");
				int quantidade = t.leInt("Quantidade: ");
				estoque.addQuantidade(codigo, quantidade);
				System.out.println(quantidade+" "+codigo+" foram adicionados ao estoque");
				
			} else if(option == 3) { //OPTION 3: RETIRAR QUANTIDADE DE PRODUTO DO ESTOQUE
				String codigo = t.leString("Código: ");
				int quantidade = t.leInt("Quantidade: ");
				estoque.removeQuantidade(codigo, quantidade);
				System.out.println(quantidade+" "+codigo+" foram removidos");
				
			} else if(option == 4) { //OPTION 4: IMPRIME ESTOQUE
				estoque.print();
				
			} else if(option == 5) { //OPTION 5: IMPRIME ESTOQUE BAIXO
				estoque.estoqueBaixo();
				
			} else if(option == 6) {
				//sair
			} else {
				System.out.println("Opção inválida!");
			}
			
		}while(choice != 6);
		
	}

}

public class Produto {

	private String codigo;
	private String nome;
	private int quantidade;
	private int quantidadeMin = 5;
	
	public Produto(String codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
		quantidade = 1;
		quantidadeMin = 5;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public int getQuantidadeMin() {
		return quantidadeMin;
	}
	
	@Override
	public String toString() {
		return "(Nome: "+nome+", Código: "+codigo+ ", Quantidade: "+quantidade+")";
	}

}

package entidades.compra;

public class DetalhesDoPedido {
	
	private Integer numProduto;
	private String nomeProduto;
	private Integer quantidade;
	private Double custoUnd;
	
	public DetalhesDoPedido() {
		// TODO Auto-generated constructor stub
	}

	public DetalhesDoPedido(Integer numProduto, String nomeProduto, Integer quantidade, Double custoUnd) {
		this.numProduto = numProduto;
		this.nomeProduto = nomeProduto;
		this.quantidade = quantidade;
		this.custoUnd = custoUnd;
	}

	public Integer getNumProduto() {
		return numProduto;
	}

	public void setNumProduto(Integer numProduto) {
		this.numProduto = numProduto;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
		calcularPreco();
	}

	public Double getCustoUnd() {
		return custoUnd;
	}

	public void setCustoUnd(Double custoUnd) {
		this.custoUnd = custoUnd;
	}
	
	public Double calcularPreco(){
		return custoUnd * quantidade;		
	}
}

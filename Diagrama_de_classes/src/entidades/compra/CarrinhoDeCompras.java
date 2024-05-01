package entidades.compra;

import java.util.ArrayList;

public class CarrinhoDeCompras {
	
	private Integer numCarrinho;
	private Double valorTotal;
	
	private ArrayList<Pedido> pedidos = new ArrayList<>();
	
	public CarrinhoDeCompras() {
		// TODO Auto-generated constructor stub
	}

	public CarrinhoDeCompras(Integer numCarrinho, Double valorTotal) {
		this.numCarrinho = numCarrinho;
		this.valorTotal = valorTotal;
	}

	public Integer getNumCarrinho() {
		return numCarrinho;
	}

	public void setNumCarrinho(Integer numCarrinho) {
		this.numCarrinho = numCarrinho;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void addItemCarrinho(Pedido pedido) {
		this.pedidos.add(pedido);
		valorTotal+= pedido.getDetalhes().calcularPreco();
	}
	
	public String verDetalheCarrin() {
		
		pedidos.forEach(pedido -> System.out.println(pedido.toString()) );
		System.out.println("valor total: "+ valorTotal);
		
		return null;
	}
	
	public void prossegCompra() {
		//deveria existir algo de pagamento aqui, mas não existe nada específicado no diagrama
		for (Pedido pedido : pedidos) {
			
			if (pedido.getInfo().getInfoEnvio() == "enviado") {
				pedido.finalizarPedido();
			}else {
				pedido.getInfo().atualizarInfoEnvio("enviado");
			}
		}
	}
	
	public void atualizarQuant(Pedido p, Integer qtd) {
		p.getDetalhes().setQuantidade(qtd);
	}
	
}
package entidades;

import java.util.ArrayList;
import java.util.List;

import Enums.Estado;

public class Carrinho {

	private List<Pedido> pedidos = new ArrayList<>();

	public Carrinho() {
		// TODO Auto-generated constructor stub
	}

	public void addPedido(Pedido p) {
		pedidos.add(p);
	}

	public void removePedidoId(int index) {
		pedidos.remove(index);
	}

	public void removePedido(Pedido p) {
		pedidos.remove(p);
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void editCarrinho(String campo, String valor, Integer index) {
		switch (campo) {
			case "quantidade": {
				pedidos.get(index).setQuantidade(Integer.parseInt(valor));
				break;
			}
			case "endereco": {
				pedidos.get(index).setEndereco(valor);
				break;
			}
		default:
			throw new IllegalArgumentException("Não foi possível realizar a alteração" );
		}
	}
	
	public void verCarrinho() {
		System.out.println(pedidos.toString());
	}
	
	public void comfirmarPedido() {
		pedidos.forEach(pedido -> pedido.setEstado(Estado.PAGAMENTO));
	}
	
}

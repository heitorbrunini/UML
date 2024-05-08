package Utils;

import java.util.ArrayList;
import java.util.List;

import Enums.Estado;
import entidades.Carrinho;

public class Util {

	List<String> Itens = new ArrayList<>();

	public Util() {
		// TODO Auto-generated constructor stub
	}

	public void realizarPagamento(Carrinho carro) {
		carro.getPedidos().forEach(pedido -> pedido.setEstado(Estado.PROCESSAMENTO));
	}

	public void realizarEnvio(Carrinho carro) {
		carro.getPedidos().forEach(pedido -> pedido.setEstado(Estado.ENVIADO));
	}

	public void ConfirmarEnvio(Carrinho carro) {
		carro.getPedidos().forEach(pedido -> pedido.setEstado(Estado.RECEBIDO));
	}

	public void addItens(String item) {
		Itens.add(item);
	}

	public String procurarItem(String item) {

		//ver item
		for (String i : Itens) {
			if (i.equals(item)) {
				
				return "item encontrado: "+  i;
			}
		}
		//item não encontrado
		throw new IllegalArgumentException("Item não encontrado, procure outro item");
	}
}

package entidades;

import Enums.Estado;

public class Pedido {

	private String item;
	private Integer quantidade;
	private String endereco;
	private String cpfTitular;
	private String titular;
	private Estado estado;
		
	public Pedido(String item, Integer quantidade, String endereco, String cpfTitular, String titular) {
		this.item = item;
		this.quantidade = quantidade;
		this.endereco = endereco;
		this.cpfTitular = cpfTitular;
		this.titular = titular;
	}

	public Pedido() {
			
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpfTitular() {
		return cpfTitular;
	}

	public void setCpfTitular(String cpfTitular) {
		this.cpfTitular = cpfTitular;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Pedido [item=" + item + ", quantidade=" + quantidade + ", endereco=" + endereco + ", titular=" + titular
				+ "]";
	}
	
		

}

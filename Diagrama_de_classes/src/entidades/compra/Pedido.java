package entidades.compra;

import java.util.Date;

public class Pedido {
	
	private Integer numPedido;
	private Date dataCriacao;
	private String estado;
	
	private InformacaoDeEnvio info;
	private DetalhesDoPedido detalhes;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}
	
	public Pedido(Integer numPedido, String estado, InformacaoDeEnvio info,
			DetalhesDoPedido detalhes) {
		this.numPedido = numPedido;
		this.dataCriacao = new Date();;
		this.estado = estado;
		this.info = info;
		this.detalhes = detalhes;
	}
	
	public DetalhesDoPedido getDetalhes() {
		return detalhes;
	}

	public void setDetalhes(DetalhesDoPedido detalhes) {
		this.detalhes = detalhes;
	}

	public InformacaoDeEnvio getInfo() {
		return info;
	}

	public void setInfo(InformacaoDeEnvio info) {
		this.info = info;
	}

	public Integer getNumPedido() {
		return numPedido;
	}

	public void setNumPedido(Integer numPedido) {
		this.numPedido = numPedido;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void finalizarPedido() {
		this.estado = "finalizado";
		this.info.atualizarInfoEnvio(estado);
	}

	@Override
	public String toString() {
		return "Pedido [numPedido=" + numPedido + ", dataCriacao=" + dataCriacao + ", estado=" + estado + ", info="
				+ info.toString() + ", detalhes=" + detalhes.toString() + "]";
	}
	
	
}

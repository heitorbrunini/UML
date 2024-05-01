package entidades.compra;

import java.util.Date;

public class InformacaoDeEnvio {
	
	private Integer numEnvio;
	private String tipoEnvio;
	private Double custoEnvio;
	private Integer numRegiaoEnvio;
	private String infoEnvio;
	private Date dataCriacao;
	
	public InformacaoDeEnvio() {
		// TODO Auto-generated constructor stub
	}
	
	public InformacaoDeEnvio(Integer numEnvio, String tipoEnvio, Double custoEnvio, Integer numRegiaoEnvio,
			String infoEnvio) {
		this.numEnvio = numEnvio;
		this.tipoEnvio = tipoEnvio;
		this.custoEnvio = custoEnvio;
		this.numRegiaoEnvio = numRegiaoEnvio;
		this.infoEnvio = infoEnvio;
		this.dataCriacao = new Date();
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public String getInfoEnvio() {
		return infoEnvio;
	}

	public void atualizarInfoEnvio(String infoEnvio) {
		this.infoEnvio = infoEnvio;
	}

	public Integer getNumEnvio() {
		return numEnvio;
	}

	public void setNumEnvio(Integer numEnvio) {
		this.numEnvio = numEnvio;
	}

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	public Double getCustoEnvio() {
		return custoEnvio;
	}

	public void setCustoEnvio(Double custoEnvio) {
		this.custoEnvio = custoEnvio;
	}

	public Integer getNumRegiaoEnvio() {
		return numRegiaoEnvio;
	}

	public void setNumRegiaoEnvio(Integer numRegiaoEnvio) {
		this.numRegiaoEnvio = numRegiaoEnvio;
	}

}

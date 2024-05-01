package entidades;

import Utils.Leitor;

public class Administrador extends Usuario{
	
	private String nomeAdm;
	
	Leitor leitor = new Leitor();	
	
	public Administrador() {
		
	}

	public Administrador(String numUsuar, String senha, String estadLogin, String nomeAdm, String email) {
		super(numUsuar, senha, estadLogin, email);
		this.nomeAdm = nomeAdm;
	}
	
	public Boolean atualizCatalogo() {
		return null;
	}

	public String getNomeAdm() {
		return nomeAdm;
	}

	public void setNomeAdm(String nomeAdm) {
		this.nomeAdm = nomeAdm;
	}
	
	public void atualizarCatalogo(Integer numProd, Integer qtd) {
		leitor.atualizarEstoque(numProd, qtd);
	}
	
}

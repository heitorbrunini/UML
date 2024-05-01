package entidades;

import java.util.Date;

public abstract class Usuario {
	
	protected String numUsuar;
	protected String senha;
	protected String estadLogin;
	protected Date dataCadastr;
	protected String email;
	
	public Usuario() {
	}
	
	public Usuario(String numUsuar, String senha, String estadLogin, String email) {
		this.numUsuar = numUsuar;
		this.senha = senha;
		this.estadLogin = estadLogin;
		this.dataCadastr = new Date();;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumUsuar() {
		return numUsuar;
	}

	public void setNumUsuar(String numUsuar) {
		this.numUsuar = numUsuar;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEstadLogin() {
		return estadLogin;
	}

	public void setEstadLogin(String estadLogin) {
		this.estadLogin = estadLogin;
	}

	public Date getDataCadastr() {
		return dataCadastr;
	}

	public void setDataCadastr(Date dataCadastr) {
		this.dataCadastr = dataCadastr;
	}

	public boolean verifyLogin() {
		return true;
	}
	
}

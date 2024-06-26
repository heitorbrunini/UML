package entidades;

public class Conta {
	
	private Integer number;
	private String name;
	private String CPF;
	private String passWord;
	private Double saldo;		
	
	public Conta(String name, String cPF, String passWord, Double saldo) {
		this.name = name;
		CPF = cPF;
		this.passWord = passWord;
		this.saldo = saldo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer i) {
		this.number = i;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "Conta: " + number + ", Titular: " + name + ", CPF: " + CPF + ", Saldo:" + saldo ;
	}
	
		
		
}

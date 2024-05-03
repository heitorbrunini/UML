package entidades;

import java.time.LocalDate;

import enums.Plano;

public class Cliente {
	
	private String cpf;
	private Integer codigo;
	private String nome;
	private LocalDate dataCadastro;
	private LocalDate ultimoPagamento;
	private Integer atrasos;
	private Plano plano;
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String cpf, Integer codigo, String nome, LocalDate dataCadastro, Integer atrasos, Plano plano) {
		this.cpf = cpf;
		this.codigo = codigo;
		this.nome = nome;
		this.dataCadastro = dataCadastro;
		this.ultimoPagamento = dataCadastro;
		this.atrasos = atrasos;
		this.plano = plano;
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public LocalDate getUltimoPagamento() {
		return ultimoPagamento;
	}

	public void setUltimoPagamento(LocalDate ultimoPagamento) {
		this.ultimoPagamento = ultimoPagamento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Integer getAtrasos() {
		return atrasos;
	}

	public void setAtrasos(Integer atrasos) {
		this.atrasos = atrasos;
	}

	public Plano getPlano() {
		return plano;
	}

	public void setPlano(Plano plano) {
		this.plano = plano;
	}

	@Override
	public String toString() {
		return "Cliente [nome: " + nome + ", dataCadastro: " + dataCadastro + ", ultimoPagamento: " + ultimoPagamento
				 + ", plano: " + plano + "]";
	}

}

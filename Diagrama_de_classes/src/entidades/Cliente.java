package entidades;

import entidades.compra.CarrinhoDeCompras;

public class Cliente extends Usuario {

	private String nomeCliente;
	private String endereco;
	private String infoCartaoCred;
	private Double saldoConta;
	
	private CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

	public Cliente Cadastro(String nomeCliente, String endereco, String infoCartaoCred,
			Double saldoConta, String numUsuar, String senha, String estadLogin, String email) {
		return new Cliente(nomeCliente, endereco, infoCartaoCred,saldoConta, numUsuar, senha, estadLogin,
				 email);
	}

	private Cliente(String nomeCliente, String endereco, String infoCartaoCred,Double saldoConta,
			String numUsuar, String senha, String estadLogin,  String email) {
		super(numUsuar, senha, estadLogin,  email);
		this.nomeCliente = nomeCliente;
		this.endereco = endereco;
		this.infoCartaoCred = infoCartaoCred;
		this.saldoConta = saldoConta;
	}

	public void login() {
		this.setEstadLogin("online");
	}

	public void atualizarPerfil(String campo, String valor) {
		switch (campo) {
		
			case "nomeCliente": {
				nomeCliente = valor;
				break;
			}
			case "endereco": {
				endereco = valor;
				break;
			}
			case "infoCartaoCred": {
				infoCartaoCred = valor;
				break;
			}
			case "saldoConta": {
				saldoConta = Double.valueOf(valor);
				break;
			}
			case "senha": {
				senha = valor;
				break;
			}
			case "email": {
				email = valor;
				break;
			} default:
			throw new IllegalArgumentException("Unexpected value: " + campo);
		}
	}

	public CarrinhoDeCompras getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(CarrinhoDeCompras carrinho) {
		this.carrinho = carrinho;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getInfoCartaoCred() {
		return infoCartaoCred;
	}

	public void setInfoCartaoCred(String infoCartaoCred) {
		this.infoCartaoCred = infoCartaoCred;
	}

	public Double getSaldoConta() {
		return saldoConta;
	}

	public void setSaldoConta(Double saldoConta) {
		this.saldoConta = saldoConta;
	}

}

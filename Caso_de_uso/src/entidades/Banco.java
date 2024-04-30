package entidades;

import java.util.ArrayList;

public class Banco {
	String banconame;
	ArrayList<Conta> Contas = new ArrayList<>();

	public Banco(String banconame) {
		this.banconame = banconame;
	}

	public Conta buscarConta(Integer number) throws Exception {
		try {
			return Contas.get(number);
		} catch (Exception e) {
			throw new Exception("Conta não encontrada");
		}

	}

	private void verificarSaldo(Conta c1, Double value) throws Exception {
		if (c1.getSaldo() < value) {
			throw new Exception("Saldo insuficiente");
		}

	}

	public Double consultarSaldo(Conta conta) {
		return conta.getSaldo();
	}

	public void fazerTrasferencia(Conta c1, Conta c2, Double value) throws Exception {

		verificarSaldo(c1, value);

		c1.setSaldo(c1.getSaldo() - value);
		c2.setSaldo(c2.getSaldo() + value);

		System.out.println("++++++++++ Transação concluida: ++++++++++");
		System.out.println("Saldo restante:");
		System.out.println(c1);
		System.out.println("O banco: " + banconame + " Agradece");

	}

	public void fazerPagamento(Conta c1, Double value) throws Exception {

		verificarSaldo(c1, value);
		System.out.println("++++++++++ Transação concluida: ++++++++++");
		System.out.println("Saldo restante:");
		System.out.println(c1);
		System.out.println("O banco: " + banconame + " Agradece");

	}

	public String getBanconame() {
		return banconame;
	}

	public void setBanconame(String banconame) {
		this.banconame = banconame;
	}

	public ArrayList<Conta> getContas() {
		return Contas;
	}

	public void adicionarContas(Conta c) {
		c.setNumber(Contas.size());
		Contas.add(c);
	}

}

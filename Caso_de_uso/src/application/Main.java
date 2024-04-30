package application;

import java.util.Scanner;

import entidades.Banco;
import entidades.Conta;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// criando dados
		Banco bancoCn = new Banco("Banco Coreia do Norte");
		Conta alana = new Conta("Alana", "123.456.789-10", "deumaoito", 100.00);
		Conta aline = new Conta("Aline", "132.465.798-50", "senha", 300.00);

		bancoCn.adicionarContas(alana);
		bancoCn.adicionarContas(aline);

		// entrando no sistema
		Boolean login = false;
		Conta conta = null;

		// Login
		System.out.println("Seja bem vindo ao banco: " + bancoCn.getBanconame());
		do {
			try {
				System.out.println("Digite seu número de conta: ");
				Integer nConta = sc.nextInt();
				System.out.println("Digite sua senha de conta: ");
				String sConta = sc.next();

				if (bancoCn.buscarConta(nConta).getPassWord().equals(sConta)) {
					login = true;
					conta = bancoCn.buscarConta(nConta);
					System.out.println("Olá " + bancoCn.buscarConta(nConta).getName());
				} else {
					System.out.println("Credenciais incorretas, tente novamente");
				}

			} catch (Exception e) {
				System.out.println("Ocorreu um erro, tente novamente.");
			}

		} while (login == false);

		// Operacoes
		boolean operation = true;

		do {
			System.out.println("========= Digite a operação a ser executada ===========");
			System.out.println("1: consulta | 2: transferência | 3: pagamento | 4: sair");

			try {

				switch (sc.nextInt()) {
					case 1: {
						System.out.println(bancoCn.consultarSaldo(conta));
						break;
					}
					case 2: {
	
						System.out.println("Informe o código da conta para que deseja transferir: ");
						int codigoTransferencia = sc.nextInt();
						System.out.println("Informe o valor que deseja transferir: ");
						bancoCn.fazerTrasferencia(conta, bancoCn.buscarConta(codigoTransferencia), sc.nextDouble());
						break;
	
					}
					case 3: {
						System.out.println("Informe o valor do pagamento: ");
						bancoCn.fazerPagamento(conta, sc.nextDouble());
	
						break;
					}
					case 4: {
						System.out.println("Agradecemos sua preferência.");
						operation = false;
						break;
					}
				default:
					System.out.println("Operação inválida, tente novamente ");
				}
				
			} catch (Exception e) {
				System.out.println("Não foi possível concluir a transação: " + e.getMessage());
			}
		} while (operation);

		sc.close();
	}

}
package application;

import java.util.Scanner;

import Utils.Util;
import entidades.Carrinho;
import entidades.Pedido;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);		
		Util util = new Util();
		util.addItens("celular");
		util.addItens("camisa");
		util.addItens("luva");
		util.addItens("headset");
		
		Carrinho carrinho = new Carrinho();
		
		int operation = 0;
		
		do {
			
			try {
				System.out.println("========= Digite a operação a ser executada ===========");
				System.out.println("1: Pesquisar Item | 2: Ver/Editar | 3: Confirmar | 4: Pagamento | 5: recebimento");
				
				switch (sc.next()) {
				
				case "1": {
					System.out.println("Digite o nome do item: ");
					String item = sc.next();
					System.out.println(	util.procurarItem(item) );
					System.out.println("Deseja Adicionar? S/N");
					
					if (sc.next().toLowerCase().equals("s")) {
						System.out.println("digite a quantidade: ");
						Pedido p = new Pedido(item ,sc.nextInt(),"Rua josé dos campos, 123", "123.456.789-10", "Maria Jose da Silva");
						carrinho.addPedido(p);
					}
					break;
				}
				
				case "2":{
					System.out.println("Ver ou Editar : ");
					
					String op =  sc.next().toLowerCase();
					if( op.equals("ver")) {
						System.out.println(carrinho);
					}
					else if(op.equals("editar")) {
						//public void editCarrinho(String campo, String valor, Integer index) {
						System.out.println("Remover, Alterar quantide ou endereço? : ");
						op =  sc.next().toLowerCase();
						
						if (op.equals("remover")) {
							System.out.println("digite o indice do item");
							carrinho.editCarrinho("remover", "", sc.nextInt());
							
						} else if (op.equals("quantidade")) {
							
							System.out.println("digite a quantidade do item");
							op =  sc.next().toLowerCase();
							System.out.println("digite o indice do item");
							carrinho.editCarrinho("quantidade", op , sc.nextInt());
							
						} else if (op.equals("endereco")) {
							
							System.out.println("digite o novo endereço do pedido");
							op =  sc.next().toLowerCase();
							System.out.println("digite o indice do pedido");
							carrinho.editCarrinho("endereco", op , sc.nextInt());
							
						}
					
						
					}
					break;
				}
				case "3":{
					carrinho.comfirmarPedido();
					break;
				}
				case "4":{
					util.realizarPagamento(carrinho);
					util.realizarEnvio(carrinho);
					break;
				}
				case "5":{
					util.ConfirmarEnvio(carrinho);
					System.out.println("obrigado por utilizar nossos serviços");
					operation = -1;
					break;
				}
				default:
					throw new IllegalArgumentException("Valor não esperado: " + operation);
				}
			} catch (Exception e) {
				System.out.println("Ocorreu um erro, "+ e.getMessage());
			}
			
			
			
		} while (operation!=-1);
		
		sc.close();
		
			
	}
}

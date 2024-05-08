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
			
			System.out.println("========= Digite a operação a ser executada ===========");
			System.out.println("1: Pesquisar Item | 2: Ver/Editar | 3: Confirmar | 4: Recebimento");
			
			switch (sc.next()) {
			
			case "1": {
				System.out.println("Digite o nome do item: ");
				String item = sc.next();
				System.out.println(	util.procurarItem(item) );
				System.out.println("Deseja Adicionar? S/N");
				
				if (sc.next().toLowerCase()== "s") {
					System.out.println("digite a quantidade: ");
					Pedido p = new Pedido(item ,sc.nextInt(),"Rua josé dos campos, 123", "123.456.789-10", "Maria Jose da Silva");
					carrinho.addPedido(p);
				}
			}
			
			case "2":{
				
			}
			
			default:
				throw new IllegalArgumentException("Unexpected value: ");
			}
			
		} while (operation!=-1);
		
		
		
		
		
		
		/*
		try {			
			
			
			
			//String item, Integer quantidade, String endereco, String cpfTitular, String titular
			Pedido p = new Pedido("celular",1,"Rua josé dos campos, 123", "123.456.789-10", "Maria Jose da Silva");
			carrinho.addPedido(p);
			
					
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}*/
			
	}
}

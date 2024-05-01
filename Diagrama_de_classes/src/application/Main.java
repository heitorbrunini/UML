package application;

import entidades.Administrador;
import entidades.Cliente;
import entidades.compra.Pedido;

public class Main {

	public static void main(String[] args) {

		// criando dados
		Administrador adm = new Administrador("0", "deumaoito", "online", "Robertão", "robertao@hotmail.com");
		Cliente cl = null;
		cl.Cadastro("Karla", "Rua jode da silva", "infoaq", 100.00, "1", "senha", "online",  "karla@gmail.com");
		
		Pedido pedido = new Pedido();
		
	}

}
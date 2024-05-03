package application;

import java.time.LocalDate;
import java.time.Month;

import entidades.Cliente;
import enums.Plano;
import utils.Utils;

public class Main {

	public static void main(String[] args) {
		{
			LocalDate Cadastro = LocalDate.of(2022, Month.JANUARY, 1);

			Utils util = new Utils();

			util.addCliente((new Cliente("123.456.789.10", 0, "Bob Stiller", Cadastro, 0, Plano.UNIVERSITARIO)));
			util.addCliente((new Cliente("132.465.798.11", 1, "Robert Singer", LocalDate.now().plusMonths(-1), 0, Plano.COMPLETO)));

			// Cliente com mensalidade atrasada

			System.out.println(util.consultaCliente(0).toString());

			System.out.println(util.consultaMensalidade(util.consultaCliente(0)));

			util.quitaMensalidade(util.consultaCliente(0), util.consultaMensalidade(util.consultaCliente(0)));

			//Cliente com mensalidade não atrasada

			System.out.println(util.consultaCliente(1).toString());

			System.out.println(util.consultaMensalidade(util.consultaCliente(1)));

			util.quitaMensalidade(util.consultaCliente(1), util.consultaMensalidade(util.consultaCliente(1)));

		}

	}
}

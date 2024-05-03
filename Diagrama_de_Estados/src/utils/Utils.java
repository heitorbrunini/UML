package utils;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import entidades.Cliente;
import enums.Plano;

public class Utils {
	
	List<Cliente> clientes = new ArrayList<>();
	
	public Utils() {
		// TODO Auto-generated constructor stub
	}
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	
	public Cliente consultaCliente(Integer cod) {
		try {			
			return clientes.get(cod);
		} catch (Exception e) {
			System.out.println("Não foi possível encontrar o cliente");
			return null;
		}
	}

	public Double consultaMensalidade(Cliente c) {
		
		c.setAtrasos( Period.between(c.getUltimoPagamento(), LocalDate.now()).getMonths() );
		
		if (c.getAtrasos() == 0 ) {
			return 0.00;
		} else {
			
			return calculaJuros(c.getPlano(), c.getAtrasos());
		}
		
	}

	public Double calculaJuros(Plano plano, Integer atraso) {

		double percent = 5.0;
		double value = 0;		

		switch (plano) {

		case FUNCIONARIO: {
			value = (atraso > 1) ? (percent * 50.00 * atraso) / 100 + atraso * 50 : 50.00;
			return value;
		}
		case UNIVERSITARIO: {
			
			value = (atraso > 1) ? (percent * 60.00 * atraso) / 100  + atraso * 60.00: 60.00;
			return value;
		}
		case LIMITADO: {
			value = (atraso > 1) ? (percent * 70.00 * atraso) / 100  + atraso * 70.00 : 70.00;
			return value;
		}
		case COMPLETO: {
			value = (atraso > 1) ? (percent * 100.00 * atraso) / 100  + atraso * 100.00 : 100.00;
			return value;
		}
		default:
			return null;
		}
	}

	public void quitaMensalidade(Cliente c, Double value) {		
		c.setUltimoPagamento(LocalDate.now());
		System.out.println("Pagamento relizado " + c.getNome() + ", valor pago: "+ value + ", meses pagos: " + c.getAtrasos() + ", Dia realizado: " + LocalDate.now() );
		c.setAtrasos(0);
	}

}

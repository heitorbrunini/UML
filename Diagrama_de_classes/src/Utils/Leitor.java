package Utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Leitor {

	private String filePath = "./src/resorces/dados.txt";

	private List<List<String>> dados = new ArrayList<>();

	public Leitor() {

		this.lerDados();

	}

	public void lerDados() {
		try {
			Scanner scanner = new Scanner(new File(filePath));

			while (scanner.hasNextLine()) {

				String line = scanner.nextLine();

				String[] fields = line.split(",");

				// Converter o array de campos em ArrayList e adicionar à lista principal
				List<String> fieldList = Arrays.asList(fields);
				this.dados.add(fieldList);

			}

			scanner.close();

		} catch (FileNotFoundException e) {

			System.out.println("Arquivo não encontrado: " + e.getMessage());
		}
	}

	public List<List<String>> getDados() {
		return dados;
	}

	public Boolean atualizarEstoque(Integer id, Integer qtd) {

		try {
			List<String> prod = dados.get(id);

			Integer estoque = Integer.parseInt(prod.get(prod.size() - 1));

			estoque = estoque + qtd;

			prod.set((prod.size() - 1), String.valueOf(estoque));

			dados.set(id, prod);

			return true;
		} catch (Exception e) {
			return false;
		}

	};

}

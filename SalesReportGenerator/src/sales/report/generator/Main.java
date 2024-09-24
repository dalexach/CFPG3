package sales.report.generator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import sales.report.generator.model.Product;
import sales.report.generator.model.Seller;

/**
 * The Main class is responsible for triggering the generation of sales data and
 * handling the reporting tasks.
 */
public class Main {
	/**
	 * Main method that calls the GenerateInfoFiles class to create folders and
	 * generate product and seller data files. Additionally, handles report
	 * generation tasks.
	 *
	 * @param args command-line arguments (not used)
	 */
	public static void main(String[] args) {
		try {
			// Generating required files using GenerateInfoFiles methods
			System.out.println("Generando archivos...");
			GenerateInfoFiles.main(new String[0]); // Call the main method of GenerateInfoFiles

			System.out.println("¡Proceso completado exitosamente!");

			/*
			 * TODO: Create a file with information about the products sold by quantity,
			 * sorted in descending order. The name and price must be separated by
			 * semicolons, and one product per line.
			 */

		} catch (Exception e) {
			System.err.println("Ocurrió un error: " + e.getMessage());
		}
	}

	/**
	 * Method that extracts products from the product file to start working with
	 * product information and create a file with information on products sold by
	 * quantity, sorted in descending order.
	 */

	public static List<Product> getProductsFromFile() {
		List<Product> products = new ArrayList<Product>();
		String filePath = "mainRequiredFiles/Products";

		try (Scanner scanner = new Scanner(new File(filePath))) {
			while (scanner.hasNextLine()) {
				String linea = scanner.nextLine();
				String[] productInfo = linea.split(";");

				Product product = new Product();
				product.setId(Long.parseLong(productInfo[0]));
				product.setName(productInfo[1]);
				product.setPrice(Double.parseDouble(productInfo[2].replace(",", ".")));
				product.setAmount((int) (Math.random() * 10) + 1);

				products.add(product);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Collections.sort(products, Collections.reverseOrder());

		return products;
	}

}

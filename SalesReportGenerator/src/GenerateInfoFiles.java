package sales.report.generator;

import java.io.File;
import java.io.FileWriter;

/**
 * The GenerateInfoFiles class is responsible for generating random data files 
 * used in the sales report system. It creates folders, files, and writes 
 * random information for products and sellers into flat files.
 */
public class GenerateInfoFiles {
	
	/**
     * Creates a folder in the specified path.
     *
     * @param folderName the name of the folder to be created
     */	
	public static void createFolder(String folderName) {
		
		File folderM = new File(folderName);
		folderM.mkdir();

	}
	
	 /**
     * Creates a new empty file.
     *
     * @param file the path and name of the file to be created
     */
	public static void createFile(String file) {
		File fileM = new File(file);
		
		try {
			fileM.createNewFile();
		}catch(Exception e) {
			System.err.println("Error al crear el archivo " + file);
		}
		
	}

	/**
     * Writes a specified number of random products into a file. Each product 
     * includes an ID, name, and price.
     *
     * @param file the path and name of the file to write the products to
     * @param numberOfProducts the number of products to generate
     */
	public static void writeProductsFile(String file, int numberOfProducts) {
		File fileM = new File(file);
		
		try {
			FileWriter writer = new FileWriter(fileM);
			
			for (int i = 1; i <= numberOfProducts; i++) {
                String productId = String.valueOf(i + 1000);
                String productName = DataSource.createNewProduct();
                double productPrice = DataSource.createRandomPrice();
                
                // Writing the line in the requested format
                writer.write(productId + ";" + productName + ";" + String.format("%.2f", productPrice) + "\n");
            }
            System.out.println("Documento generado correctamente en " + file);
			
			writer.close();
			System.out.println("Archivo " + fileM + " creado y escrito correctamente!");
		}catch(Exception e) {
			System.err.println("Error al crear el archivo " + file);
		}
	}
	
	/**
     * Writes a specified number of random sellers into a file. Each seller 
     * includes a document type, document number, first name, and last name.
     *
     * @param file the path and name of the file to write the sellers to
     * @param numberOfSellers the number of sellers to generate
     */
	public static void writeSellersFile(String file, int numberOfSellers) {
		File fileM = new File(file);
		
		try {
			FileWriter writer = new FileWriter(fileM);
			
			for (int i = 1; i <= numberOfSellers; i++) {
                String tipoDocumento = DataSource.createRandomDocumentType();
                String numeroDocumento = DataSource.createRandomDocumentNumber();
                String nombresVendedor = DataSource.createSellerRandomName();
                String apellidosVendedor = DataSource.createSellerLastName();
                
                writer.write(tipoDocumento + ";" + numeroDocumento + ";" + nombresVendedor + ";" + apellidosVendedor + "\n");
            }
            System.out.println("Documento generado correctamente en " + file);
			
			writer.close();
			System.out.println("Archivo " + fileM + " creado y escrito correctamente!");
		}catch(Exception e) {
			System.err.println("Error al crear el archivo " + file);
		}
	}
	
	
	public static void main(String[] args) {
		/**
	     * Main method that creates the necessary folders and files, and generates
	     * random product and seller data for testing purposes.
	     *
	     * @param args command-line arguments (not used)
	     */

		String folder = "mainRequiredFiles";
		String fileProducts = "mainRequiredFiles/Products";
		String fileSellers = "mainRequiredFiles/Sellers";
		
		createFolder(folder);
		createFile(fileProducts);
		createFile(fileSellers);
		writeProductsFile(fileProducts, 10);
		writeSellersFile(fileSellers, 10);
		
	}

}

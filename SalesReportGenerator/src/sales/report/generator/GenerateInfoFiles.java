package sales.report.generator;

import java.io.File;
import java.io.FileWriter;

public class GenerateInfoFiles {
	
	public static void createFolder(String folderName) {
		
		File folderM = new File(folderName);
		folderM.mkdir();

	}
	
	public static void createFile(String file) {
		File fileM = new File(file);
		
		try {
			fileM.createNewFile();
		}catch(Exception e) {
			System.err.println("Error al crear el archivo " + file);
		}
		
	}

	public static void writeProductsFile(String file, int numberOfProducts) {
		File fileM = new File(file);
		
		try {
			FileWriter writer = new FileWriter(fileM);
			
			for (int i = 1; i <= numberOfProducts; i++) {
                String productId = String.valueOf(i + 1000);
                String productName = DataSource.createNewProduct();
                double productPrice = DataSource.createRandomPrice();

                // Escribir la línea en el formato solicitado
                writer.write(productId + ";" + productName + ";" + String.format("%.2f", productPrice) + "\n");
            }
            System.out.println("Documento generado correctamente en " + file);
			
			writer.close();
			System.out.println("Archivo " + fileM + " creado y escrito correctamente!");
		}catch(Exception e) {
			System.err.println("Error al crear el archivo " + file);
		}
	}
	
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
		// TODO Auto-generated method stub
		
		/*Clase Main que al ejecutarse debe generar los archivos 
		planos pseudoaleatorios que servirán como entrada para la ejecución de la segunda clase con 
		método main*/

		String folder = "mainRequiredFiles";
		String fileProducts = "mainRequiredFiles/Products";
		String fileSellers = "mainRequiredFiles/Sellers";
		
		createFolder(folder);
		createFile(fileProducts);
		createFile(fileSellers);
		writeProductsFile(fileProducts, 40);
		writeSellersFile(fileSellers, 10);
		
	}

}

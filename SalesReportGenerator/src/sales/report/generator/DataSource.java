package sales.report.generator;

import java.util.Random;

public class DataSource {

    public static String createNewProduct() {
        String[] products = {"Café", "Azúcar", "Arroz", "Leche", "Té", "Pan", "Mantequilla", "Queso", "Yogur", "Jugo"};
        Random random = new Random();
        return products[random.nextInt(products.length)];
    }

    public static double createRandomPrice() {
        Random random = new Random();
        return 1 + (100 - 1) * random.nextDouble(); 
    }
	
    public static String createSellerRandomName() {
        String[] names = {"Juan", "María", "Carlos", "Ana", "Pedro", "Lucía", "Miguel", "Sofía", "Jorge", "Elena"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static String createSellerLastName() {
        String[] lastNames = {"Gómez", "Pérez", "Rodríguez", "López", "Martínez", "García", "Hernández", "Sánchez", "Díaz", "Ramírez"};
        Random random = new Random();
        return lastNames[random.nextInt(lastNames.length)];
    }

    public static String createRandomDocumentType() {
        String[] documentTypes = {"DNI", "Pasaporte", "Cédula"};
        Random random = new Random();
        return documentTypes[random.nextInt(documentTypes.length)];
    }

    public static String createRandomDocumentNumber() {
        Random random = new Random();
        return String.valueOf(10000000 + random.nextInt(90000000));
    }
	
	
}

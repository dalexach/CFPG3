package sales.report.generator;

import java.util.Random;

/**
 * DataSource provides methods to generate random data for products, sellers, 
 * and document details. This class is used to simulate pseudo-random entries 
 * for testing purposes.
 */
public class DataSource {

	/**
     * Generates a random product name from a predefined list of products.
     *
     * @return a random product name
     */
    public static String createNewProduct() {
        String[] products = {"Cafe", "Azucar", "Arroz", "Leche", "Te", "Pan", "Mantequilla", "Queso", "Yogur", "Jugo"};
        Random random = new Random();
        return products[random.nextInt(products.length)];
    }

    /**
     * Generates a random price between 1 and 100.
     *
     * @return a random price
     */
    public static double createRandomPrice() {
        Random random = new Random();
        return 1 + (100 - 1) * random.nextDouble();
    }

    /**
     * Generates a random seller's first name from a predefined list of names.
     *
     * @return a random seller first name
     */
    public static String createSellerRandomName() {
        String[] names = {"Juan", "Maria", "Carlos", "Ana", "Pedro", "Lucia", "Miguel", "Sofia", "Jorge", "Elena"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    /**
     * Generates a random seller's last name from a predefined list of last names.
     *
     * @return a random seller last name
     */
    public static String createSellerLastName() {
        String[] lastNames = {"Gomez", "Perez", "Rodriguez", "Lopez", "Martinez", "Garcia", "Hernandez", "Sanchez", "Diaz", "Ramirez"};
        Random random = new Random();
        return lastNames[random.nextInt(lastNames.length)];
    }
    
    /**
     * Generates a random document type from a predefined list of document types.
     *
     * @return a random document type
     */
    public static String createRandomDocumentType() {
        String[] documentTypes = {"DNI", "Pasaporte", "Cedula"};
        Random random = new Random();
        return documentTypes[random.nextInt(documentTypes.length)];
    }

    /**
     * Generates a random 8-digit document number.
     *
     * @return a random document number
     */
    public static String createRandomDocumentNumber() {
        Random random = new Random();
        return String.valueOf(10000000 + random.nextInt(90000000));
    }


}

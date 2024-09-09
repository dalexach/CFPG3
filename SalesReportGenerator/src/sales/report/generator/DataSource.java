package sales.report.generator;

import java.util.Random;

public class DataSource {

    public static String createNewProduct() {
        String[] products = {"Caf�", "Az�car", "Arroz", "Leche", "T�", "Pan", "Mantequilla", "Queso", "Yogur", "Jugo"};
        Random random = new Random();
        return products[random.nextInt(products.length)];
    }

    public static double createRandomPrice() {
        Random random = new Random();
        return 1 + (100 - 1) * random.nextDouble(); 
    }
	
    public static String createSellerRandomName() {
        String[] names = {"Juan", "Mar�a", "Carlos", "Ana", "Pedro", "Luc�a", "Miguel", "Sof�a", "Jorge", "Elena"};
        Random random = new Random();
        return names[random.nextInt(names.length)];
    }

    public static String createSellerLastName() {
        String[] lastNames = {"G�mez", "P�rez", "Rodr�guez", "L�pez", "Mart�nez", "Garc�a", "Hern�ndez", "S�nchez", "D�az", "Ram�rez"};
        Random random = new Random();
        return lastNames[random.nextInt(lastNames.length)];
    }

    public static String createRandomDocumentType() {
        String[] documentTypes = {"DNI", "Pasaporte", "C�dula"};
        Random random = new Random();
        return documentTypes[random.nextInt(documentTypes.length)];
    }

    public static String createRandomDocumentNumber() {
        Random random = new Random();
        return String.valueOf(10000000 + random.nextInt(90000000));
    }
	
	
}

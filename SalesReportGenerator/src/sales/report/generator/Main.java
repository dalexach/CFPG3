package sales.report.generator;


/**
 * The Main class is responsible for triggering the generation of sales data
 * and handling the reporting tasks.
 */
public class Main {
	/**
     * Main method that calls the GenerateInfoFiles class to create folders and 
     * generate product and seller data files. Additionally, handles report generation tasks.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        try {
            // Generating required files using GenerateInfoFiles methods
            System.out.println("Generando archivos...");
            GenerateInfoFiles.main(new String[0]); // Call the main method of GenerateInfoFiles
            
            System.out.println("¡Proceso completado exitosamente!");
        } catch (Exception e) {
            System.err.println("Ocurrió un error: " + e.getMessage());
        }
    }

}

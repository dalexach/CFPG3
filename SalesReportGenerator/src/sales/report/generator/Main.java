package sales.report.generator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import com.opencsv.CSVWriter;

import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.http.MediaType;

public class Main {

	private final ObjectMapper objectMapper = new ObjectMapper();

	private final static HttpServletRequest request = null;

	public static ResponseEntity<byte[]> main(String[] args) {

		/* Main function to perform all the project */
		HttpHeaders responseHeaders = new HttpHeaders();
		String accept = request.getHeader("Accept");
		List<String> body = new ArrayList<String>();

		responseHeaders.setContentType(MediaType.parseMediaType("application/vnd.ms-excel"));
		responseHeaders.setContentType(MediaType.APPLICATION_CBOR);
		String fileName = "Archive" + ".csv";
		byte[] excelFileData = generateReport(body);
		responseHeaders.setContentDispositionFormData(fileName, fileName);
		return ResponseEntity.ok().headers(responseHeaders).body(excelFileData);

	}

	private static byte[] generateReport(List<String> list) {
		if (!list.isEmpty()) {

			try {
				StringWriter writer = new StringWriter();
				CSVWriter csvWriter = new CSVWriter(writer);

				csvWriter.writeNext(new String[] { "NombreVendedor", "Cantidad" });

				for (String product : list) {
					String[] data = new String[] {

					};
					csvWriter.writeNext(data);
				}
				csvWriter.close();

				return writer.toString().getBytes();
			} catch (Exception e) {
				System.err.println("Error al crear el archivo ");
				return null;
			}
		}
		return null;
	}

}

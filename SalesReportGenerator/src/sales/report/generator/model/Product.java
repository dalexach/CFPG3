package sales.report.generator.model;

import java.util.Comparator;

import lombok.Data;

@Data
public class Product implements Comparable<Product>{

	private Long id;

	private String name;

	private double price;

	private Integer amount;

	@Override
	public int compareTo(Product o) {
		return Integer.compare(this.amount, o.getAmount());
	}
	
}

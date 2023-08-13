import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("TV", 1899.90));
		list.add(new Product("Smartphone", 3259.90));
		list.add(new Product("Xbox-One", 1250.00));
		list.add(new Product("Notebook", 2999.90));
		list.add(new Product("Acer Nitro", 7280.90));
		
		Comparator<Product> comparator = (p1, p2) -> {
			return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
		};
		list.sort(comparator);
		
		for(Product p: list) {
			System.out.println(p.toString());
		}
	}

}

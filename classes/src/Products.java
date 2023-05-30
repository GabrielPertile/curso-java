import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Products {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com os dados do seu produto:");
		
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();

		Product product = new Product(name, price);
		
		System.out.println(product);
		
		System.out.print("Enter the number of products to add:");
		
		product.addProducts(sc.nextInt());

		System.out.println(product);
		
		sc.close();
	}

}

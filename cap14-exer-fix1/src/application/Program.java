package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		List<Product> products = new ArrayList<>();

		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Product #" + i + "data:");
			System.out.print("Common, used or imported (c/u/i)?");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			sc.nextLine();
			switch (type) {
			case 'c': {
				products.add(new Product(name, price));
				break;
			}
			case 'u': {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date manuDate = sdf.parse(sc.nextLine());
				products.add(new UsedProduct(name, price, manuDate));
				break;
			}
			case 'i': {
				System.out.print("Customs fee: ");
				Double fee = sc.nextDouble();
				sc.nextLine();
				products.add(new ImportedProduct(name, price, fee));
				break;
			}
			default:
				products.add(new Product(name, price));
				break;
			}
		}
		
		for (Product product : products) {
			System.out.println(product.priceTag());
		}
		
		sc.close();

	}
}

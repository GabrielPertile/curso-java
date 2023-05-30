import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		Locale.setDefault(Locale.US);

		System.out.println("Resultado = " + x);
		System.out.printf("Resultado = %.2f metros.%n", x);
		
		String nome = "Gabriel";
		int idade = 29;
		double renda = 10000.00;
		System.out.printf("%s tem %d anos e recebe R$ %.2f reais.%n", nome, idade, renda);
		
		String product1 = "Computer";
		String product2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;

		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.printf("Record: $d years old, code $d and gender %s%n", age, code, gender);
		
	}

}

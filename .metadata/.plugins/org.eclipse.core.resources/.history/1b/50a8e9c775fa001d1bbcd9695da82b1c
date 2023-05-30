package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		double[] vect = new double[n];

		double sum = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Digite a altura da pessoa %d: ", i);
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		System.out.print(sum/vect.length);
		sc.close();
	}

}

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> payers = new ArrayList<>();

		System.out.print("Entre com a quantidade de contribuintes:");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.println("Entre com as informações do #" + i + " contribuinte");
			System.out.print("Tipo do contribuinte (I/C): ");
			char type = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			Double anualIncome = sc.nextDouble();
			sc.nextLine();

			if (type == 'I' || type == 'i') {
				System.out.print("Despesas médicas: ");
				Double healthExpenditures = sc.nextDouble();
				sc.nextLine();
				payers.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Quantidade de funcionários: ");
				Integer numberOfEmployees = sc.nextInt();
				sc.nextLine();
				payers.add(new Company(name, anualIncome, numberOfEmployees));
			}
		}
		
		System.out.println("");
		System.out.println("TAXES PAID: ");
		Double total = 0.0;
		for (TaxPayer payer : payers) {
			total += payer.tax();
			System.out.println(payer.getName() + ": $" + String.format("%.2f", payer.tax()) );
		}
		System.out.println("");
		System.out.println("Total TAXES: $" + String.format("%.2f", total));
		sc.close();
	}

}

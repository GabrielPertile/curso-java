package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//		SimpleDateFormat sdf1 = new SimpleDateFormat("MM/yyyy");
		
		System.out.println("Digite o departamento:");
		String department = sc.nextLine();
		
		System.out.println("Dados trabalhador:");
		
		System.out.println("Nome:");
		String name = sc.nextLine();
		
		System.out.println("Level:");
		WorkerLevel level = WorkerLevel.valueOf(sc.next().toUpperCase());
		
		System.out.println("Salário base:");
		Double baseSalary = sc.nextDouble();
		
		//Trabalhador
		Worker worker = new Worker(name, level, new Department(department), baseSalary);
		
		sc.nextLine();
		System.out.println("Qtd. de contratos:");
		int n = sc.nextInt();
		sc.nextLine();
		
		
		for (int i=1; i <= n; i++) {
			System.out.println("Entre com os dados do contrato #" + i + ":");
			System.out.print("Data (DD/MM/YYYY): ");
			Date date = sdf.parse(sc.next());
			System.out.print("Valor/hora: ");
			Double valuePerHour = sc.nextDouble();
			System.out.print("Duração do contrato: ");
			int hours = sc.nextInt();
			
			HourContract contract = new HourContract(date, valuePerHour, hours);
			
			worker.addContract(contract);			
		}
		
		System.out.print("Digite o mês e ano que deseja calcular a renda (MM/YYYY): ");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Name " + worker.getName());

		System.out.println("Departamento " + worker.getDepartment().getName());
		
		System.out.println("Income for " + monthAndYear + ": " + worker.income(year, month));
		
		sc.close();
	}

}

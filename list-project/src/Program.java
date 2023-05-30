import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos empregados serão regristrados?");

		Integer quantity = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < quantity; i++) {
			System.out.printf("Informações do empregado: %d%n", i);
			System.out.println("ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Name: ");
			String name = sc.nextLine();
			System.out.println("Salary: ");
			Double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary));
		}

		System.out.println("Digite o id do funcionário que terá aumento de salário: ");
		Integer id = sc.nextInt();

		Employee employee = list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);

		if (employee == null) {
			System.out.println("Employee not found!");
		} else {
			System.out.println("Digite a porcentagem de aumento salarial: ");
			Double percent = sc.nextDouble();
			
			employee.increaseSalary(percent);

			for (Employee e : list) {
				System.out.println(e);
			}
		}
		
		sc.close();
	}

}

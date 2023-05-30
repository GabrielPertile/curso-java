package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {
	private String name;
	private Double baseSalary;
	private WorkerLevel level;
	
	// associations
	private Department department;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
		
	}
	
	public Worker(String name, WorkerLevel level, Department department, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.department = department;
		this.baseSalary = baseSalary;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public WorkerLevel getLevel() {
		return level;
	}
	public void setLevel(WorkerLevel level) {
		this.level = level;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		this.contracts.add(contract);
	}
	public void removeContract(HourContract contract) {
		this.contracts.remove(contract);
	}
	
	/**
	 * Total recebido no ano e mês informado
	 * @param year
	 * @param month
	 * @return
	 */
	public double income(Integer year, Integer month) {
		double sum = baseSalary;
		Calendar cal = Calendar.getInstance();
		
		for (HourContract contract : contracts) {
			cal.setTime(contract.getDate());
			int c_year = cal.get(Calendar.YEAR);
			int c_month = cal.get(Calendar.MONTH);
			
			if (c_year == year && c_month + 1 == month) {
				sum += contract.totalValue();
			}
		}
		
		return sum;
	}
}

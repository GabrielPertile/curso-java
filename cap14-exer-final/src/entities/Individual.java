package entities;

public class Individual extends TaxPayer {

	private Double healthExpenditures;
	
	public Individual() {
	}

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	@Override
	public Double tax() {
		if (getAnualIncome() < 20000.0) {
			return (getAnualIncome() * 0.15) - (healthExpenditures * 0.50);
		} else {
			return (getAnualIncome() * 0.25) - (healthExpenditures * 0.50);			
		}
	}
}

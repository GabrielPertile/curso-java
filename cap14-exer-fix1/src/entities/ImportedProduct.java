package entities;

public final class ImportedProduct extends Product {
	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}
	
	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(super.priceTag() + "(Customs fee: $ " + String.format("%.2f", customsFee) + ")");
		
		return sb.toString();
	}
	
	public final Double totalPrice() {
		return price + customsFee;
	}
}

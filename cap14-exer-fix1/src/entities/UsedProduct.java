package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date manufactureDate;

	public UsedProduct() {
		super();
	}

	public UsedProduct(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	@Override
	public final String priceTag() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name + "(used) $ " + String.format("%.2f", price));
		sb.append(" (Manufacture date: " + sdf.format(manufactureDate) + ")");
		return sb.toString();
	}
}

package entities;

public class Triangle {
	public double a;
	public double b;
	public double c;
	
	public double area() {
		double p = this.p();
		return Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));
	}
	
	public double p() {
		return (this.a + this.b + this.c) / 2;
	}
}

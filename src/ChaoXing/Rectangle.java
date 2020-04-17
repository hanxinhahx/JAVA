package ChaoXing;

public class Rectangle extends Shape {
	private double a,b;

	public Rectangle(double a, double b) {
		super();
		this.a = a;
		this.b = b;
	}
	public double getArea() {
		return a*b;
	}
	public double getC() {
		return 2*(a+b);
	}

}

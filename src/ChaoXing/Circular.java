package ChaoXing;

public class Circular {
    static double PI=3.1415;
    private double r;
    public Circular() {
    	r=1;
    }
    public Circular(double r) {
    	this.r=r;
    }
    public double Area() {
    	double s;
    	s=r*r*PI;
    	return s;
    }
    public double Girth() {
    	double c;
    	c=2*r*PI;
    	return c;
    }
}

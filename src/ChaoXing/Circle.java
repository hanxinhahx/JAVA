package ChaoXing;

public class Circle extends Shape{
	private double r;
	public  Circle(double r) {
		super();
    	this.r=r;
    }
    double getArea() {
    	
   	return r*r*Math.PI;
   }
    double getC() {
    
     return 2*r*Math.PI;	
   }
}

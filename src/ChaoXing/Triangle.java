package ChaoXing;

public class Triangle extends Shape {
    private double a,b,c;

	public Triangle(double a, double b, double c) {
		super();
	  if(a+b>c&&a+c>b&&b+c>a&&a-b<c&&a-c<b&&b-c<a) {
			this.a = a;
			this.b = b;
			this.c = c;
	  }
	  else System.out.println("三角形三边长不合法");
	}
    public double getArea() {
    	double s,q;
    	q=(a+b+c)/2.0;
    	s=Math.sqrt(q*(q-a)*(q-b)*(q-c));
    	return s;
    }
}

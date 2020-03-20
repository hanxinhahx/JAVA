package ChaoXing;

public class CircularTest {
    public static void main(String[] args) {
		Circular c1=new Circular();
		Circular c2=new Circular(6.0);
	    System.out.println("c1圆的周长为："+c1.Girth()+"\t面积为："+c1.Area());
		System.out.println("c2圆的周长为："+c2.Girth()+"\t面积为："+c2.Area());
	}
}

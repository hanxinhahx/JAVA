package ChaoXing;

public class CaeTest {
    public static void main(String[] args) {
		Car c1=new Car();
		c1.setID("辽A9752");
		c1.upSpeed();
		Car c2=new Car("辽B5086",150,200.0);
		c2.downSpeed();
		System.out.println("第一辆车的信息为：");
		c1.print();
		System.out.println("第二辆车的信息为：");
		c2.print();
	}
}

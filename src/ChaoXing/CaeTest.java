package ChaoXing;

public class CaeTest {
    public static void main(String[] args) {
		Car c1=new Car();
		c1.setID("��A9752");
		c1.upSpeed();
		Car c2=new Car("��B5086",150,200.0);
		c2.downSpeed();
		System.out.println("��һ��������ϢΪ��");
		c1.print();
		System.out.println("�ڶ���������ϢΪ��");
		c2.print();
	}
}

package JavaDay;

public class carTest {
   public static void main(String[] args) {
	Car c1=new Car("��H123456",60,1800);
	Car c2=new Car("��A56789",80,2000);
	System.out.println("�޸�ǰ��");
	c1.print();
	c2.print();
	System.out.println("�޸ĺ�");
	c1.upSpeed();
	c2.setId("��D778899");
	c1.print();
	c2.print();
	System.out.println("��ѯ���أ�");
	c1.check();
  }
}

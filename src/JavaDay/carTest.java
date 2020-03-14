package JavaDay;

public class carTest {
   public static void main(String[] args) {
	Car c1=new Car("浙H123456",60,1800);
	Car c2=new Car("浙A56789",80,2000);
	System.out.println("修改前：");
	c1.print();
	c2.print();
	System.out.println("修改后");
	c1.upSpeed();
	c2.setId("浙D778899");
	c1.print();
	c2.print();
	System.out.println("查询车重：");
	c1.check();
  }
}

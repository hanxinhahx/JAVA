package ChaoXing;

public class Test1 {
  public static void main(String[] args) {
	 Car c1=new Car();
	 Car c2=new Car();
	 c1.number="A12345";
	 c1.speed=100;
	 c1.weight=2000;
	 c2.number="A45678";
	 c2.speed=80;
	 c2.weight=1800;
	 c1.check();
	 c2.check();
	 System.out.println();
	 System.out.println("改变车牌后：");
	 c1.setnumber("B345678");
	 c1.check();
	 System.out.println("改变车速后:");
	 c2.speedup();
	 c2.check();
  }
}
class Car{
	String number;
	int speed;
	double weight;
	void speedup() {
		speed++;
	}
	void speeddown() {
		speed--;
	}
	void setnumber(String number) {
		this.number=number;
	}
	void check() {
		System.out.println("车牌："+number+"，速度："+speed+"，载重："+weight);
	}
}

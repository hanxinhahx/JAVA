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
	 System.out.println("�ı䳵�ƺ�");
	 c1.setnumber("B345678");
	 c1.check();
	 System.out.println("�ı䳵�ٺ�:");
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
		System.out.println("���ƣ�"+number+"���ٶȣ�"+speed+"�����أ�"+weight);
	}
}

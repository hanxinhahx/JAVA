package ChaoXing;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("������Բ�İ뾶");
		Shape c1 = new Circle(input.nextDouble());
		System.out.println("Բ�����Ϊ��"+c1.getArea()+"\tԲ���ܳ�Ϊ"+c1.getC());
		System.out.println("��������εĳ��Ϳ�");
		Shape r1=new Rectangle(input.nextDouble(),input.nextDouble());
		System.out.println("���ε����Ϊ��"+r1.getArea()+"\t���ε��ܳ�Ϊ"+r1.getC());
		System.out.println("�����������ε����߳���");
		Shape s1=new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println("�����ε����Ϊ��"+s1.getArea()+"\t�����ε��ܳ�Ϊ��"+s1.getC());
	}

}

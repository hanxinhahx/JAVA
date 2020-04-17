package ChaoXing;

import java.util.Scanner;

public class ShapeTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入圆的半径");
		Shape c1 = new Circle(input.nextDouble());
		System.out.println("圆的面积为："+c1.getArea()+"\t圆的周长为"+c1.getC());
		System.out.println("请输入矩形的长和宽");
		Shape r1=new Rectangle(input.nextDouble(),input.nextDouble());
		System.out.println("矩形的面积为："+r1.getArea()+"\t矩形的周长为"+r1.getC());
		System.out.println("请输入三角形的三边长：");
		Shape s1=new Triangle(input.nextDouble(),input.nextDouble(),input.nextDouble());
		System.out.println("三角形的面积为："+s1.getArea()+"\t三角形的周长为："+s1.getC());
	}

}

package BasicKnowge;
import java.util.Scanner;
public class TestClass {
     public static void main(String[] args) {
		student a=new student();
		Scanner input=new Scanner(System.in);
		System.out.println("���������䣺");
		a.age=input.nextInt();
		System.out.println("������������");
		a.name=input.next();
		System.out.println("������ɼ���");
		a.score=input.nextFloat();
		if(a.age!=0&&a.name!=null&&a.score!=0.0) {
			a.sayHello();
			System.out.println("name:"+a.name);
			System.out.println("age:"+a.age);
			System.out.println("score"+a.score);
			Work p1=new Work();
		}
	}
}
class student{
	int age;
	String name;
	float score;
	public void sayHello(){
		System.out.println("����ɹ���");
	}
}

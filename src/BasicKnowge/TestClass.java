package BasicKnowge;
import java.util.Scanner;
public class TestClass {
     public static void main(String[] args) {
		student a=new student();
		Scanner input=new Scanner(System.in);
		System.out.println("请输入年龄：");
		a.age=input.nextInt();
		System.out.println("请输入姓名：");
		a.name=input.next();
		System.out.println("请输入成绩：");
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
		System.out.println("保存成功！");
	}
}

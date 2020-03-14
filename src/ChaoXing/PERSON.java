package ChaoXing;

public class PERSON {
    public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="张三";
		s1.age=20;
		s1.c=6;
		s1.show();
		s2.name="李四";
		s2.age=25;
		s2.c=3;
		s2.show();
		s2.setName("王五");
		s2.show();
	}
}
 class Student{
	String name;
	int age;
	int c;
	void show() {
		System.out.print("姓名："+name+"，");
		System.out.print("年龄："+age+"。");
		System.out.println("班级："+c);
	}
	void setName(String name) {
		this.name=name;
	}
}

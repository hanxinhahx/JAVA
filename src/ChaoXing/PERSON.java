package ChaoXing;

public class PERSON {
    public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.name="����";
		s1.age=20;
		s1.c=6;
		s1.show();
		s2.name="����";
		s2.age=25;
		s2.c=3;
		s2.show();
		s2.setName("����");
		s2.show();
	}
}
 class Student{
	String name;
	int age;
	int c;
	void show() {
		System.out.print("������"+name+"��");
		System.out.print("���䣺"+age+"��");
		System.out.println("�༶��"+c);
	}
	void setName(String name) {
		this.name=name;
	}
}

package EduCoder;

public class Teat2 {
    public static void main(String[] args) {
    		/********* begin *********/
    		// ������ʵ����һPerson����p
             Person p=new Person();
    		// ��p�е����Ը�ֵ
            p.setName("����");
            p.setAge(18);
    		// ����Person���е�talk()����
              p.talk();
    		/********* end *********/
	}
}
//�����ﶨ��Person��
class Person {
	/********* begin *********/
    private int age;
	private  String name;
	/********* end *********/
	public  void setName(String Sname) {
		name=Sname;
	}
	public  void setAge(int a) {
		age=a;
	}
	public  void talk() {
		System.out.println("���ǣ�"+name+"�����꣺"+age+"��");
	}
}


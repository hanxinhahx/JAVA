package EduCoder;

public class Test3 {
	public static void main(String args[]) {
		// ʵ����һ��Cat������������name��age������voice()��eat()�������ٴ�ӡ�����ֺ�������Ϣ
		/********* begin *********/
          Cat cat=new Cat();
          cat.age=6;
          cat.name="С��è";
		  cat.voice();
		  cat.eat();
		  cat.talk();
		/********* end *********/

		// ʵ����һ��Dog������������name��age������voice()��eat()�������ٴ�ӡ�����ֺ�������Ϣ
		/********* begin *********/
         Dog dog=new Dog();
         dog.age=8;
         dog.name="��ڹ�";
         dog.voice();
         dog.eat();
         dog.talk();
		/********* end *********/

	}
}
class Animal {
	/********* begin *********/
	      String name;
	      int age;
	      public void talk() {
	    	System.out.println(name+age+"��");
	    }
	/********* end *********/

}

class Cat extends Animal {
	// ����Cat���voice()��eat()����
	/********* begin *********/
    public void voice() {
    	System.out.println(name+"������");
    }
    public void eat() {
    	System.out.println(name+"����");
    }
	/********* end *********/
    
}

class Dog extends Animal {
	// ����Dog���voice()��eat()����
	/********* begin *********/
	  public void voice() {
	    	System.out.println(name+"������");
	    }
	    public void eat() {
	    	System.out.println(name+"�Թ�ͷ");
	    }
	/********* end *********/
}
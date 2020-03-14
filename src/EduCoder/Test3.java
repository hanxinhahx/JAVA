package EduCoder;

public class Test3 {
	public static void main(String args[]) {
		// 实例化一个Cat对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
		/********* begin *********/
          Cat cat=new Cat();
          cat.age=6;
          cat.name="小花猫";
		  cat.voice();
		  cat.eat();
		  cat.talk();
		/********* end *********/

		// 实例化一个Dog对象，设置属性name和age，调用voice()和eat()方法，再打印出名字和年龄信息
		/********* begin *********/
         Dog dog=new Dog();
         dog.age=8;
         dog.name="大黑狗";
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
	    	System.out.println(name+age+"岁");
	    }
	/********* end *********/

}

class Cat extends Animal {
	// 定义Cat类的voice()和eat()方法
	/********* begin *********/
    public void voice() {
    	System.out.println(name+"喵喵叫");
    }
    public void eat() {
    	System.out.println(name+"吃鱼");
    }
	/********* end *********/
    
}

class Dog extends Animal {
	// 定义Dog类的voice()和eat()方法
	/********* begin *********/
	  public void voice() {
	    	System.out.println(name+"汪汪叫");
	    }
	    public void eat() {
	    	System.out.println(name+"吃骨头");
	    }
	/********* end *********/
}
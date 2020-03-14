package EduCoder;

public class Teat2 {
    public static void main(String[] args) {
    		/********* begin *********/
    		// 声明并实例化一Person对象p
             Person p=new Person();
    		// 给p中的属性赋值
            p.setName("张三");
            p.setAge(18);
    		// 调用Person类中的talk()方法
              p.talk();
    		/********* end *********/
	}
}
//在这里定义Person类
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
		System.out.println("我是："+name+"，今年："+age+"岁");
	}
}


package BasicKnowge;
import java.util.Scanner;
public class Teat2 {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String name = sc.next();
    		String sex = sc.next();
    		//在下面的Begin-End之间添加代码，分别使用两种构造器来创建Person对象。
            /********** Begin **********/
    		Person p1=new Person();
             p1.print();
             p1.student(name, sex);
    		/********** End **********/
    		
    	}
    }

    //在下面的Begin-End之间添加代码，创建Person对象，并创建两种构造方法
    /********** Begin **********/
    class Person{
    	public void student(String name,String sex){
    		
    		System.out.println("姓名："+name+"，性别："+sex+"，被创建了");
    	}
    	public void print(){
    		System.out.println("一个人被创建了");
    	}
    }


    /********** End **********/

	

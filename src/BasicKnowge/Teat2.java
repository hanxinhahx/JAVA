package BasicKnowge;
import java.util.Scanner;
public class Teat2 {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String name = sc.next();
    		String sex = sc.next();
    		//�������Begin-End֮����Ӵ��룬�ֱ�ʹ�����ֹ�����������Person����
            /********** Begin **********/
    		Person p1=new Person();
             p1.print();
             p1.student(name, sex);
    		/********** End **********/
    		
    	}
    }

    //�������Begin-End֮����Ӵ��룬����Person���󣬲��������ֹ��췽��
    /********** Begin **********/
    class Person{
    	public void student(String name,String sex){
    		
    		System.out.println("������"+name+"���Ա�"+sex+"����������");
    	}
    	public void print(){
    		System.out.println("һ���˱�������");
    	}
    }


    /********** End **********/

	

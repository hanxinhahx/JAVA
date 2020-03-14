package BasicKnowge;
import java.util.Random;
public class Work {
	   public static void t1() {
	    	Random random=new Random();//产生随机数也要申明一个新的对象
		     int a;
		     for(int i=1;i<=1000;i++) {
		    	 a=random.nextInt(10);
		    	 System.out.println(a);
		     }
		     
		}
} 

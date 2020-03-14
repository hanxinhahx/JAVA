package EduCoder;
import java.util.Arrays;
import java.util.Scanner;
public class Test1 {
	  /********** Begin **********/
    /**\
    
     * 第一题：定义一个方法 接收两个整数类型的参数 a和b，返回两个数的和  返回值类型为int 方法名为：getSum
     */
      public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int a,b,sum;
		a=input.nextInt();
		b=input.nextInt();
		sum=getSum(a,b);
		System.out.println(sum);
		double e,d,c,ave;
		c=input.nextDouble();
		d=input.nextDouble();
		e=input.nextDouble();
		ave=getAvg(c,d,e);
		System.out.println(ave);
		int f,g;
		f=input.nextInt();
		g=input.nextInt();
		printRect(f,g);
		int arr[]=new int[5];
		int i;
		for(i=0;i<5;i++) {
			arr[i]=input.nextInt();
		}
		sortArr(arr);
		Print99();
		
	}
   public static int getSum(int a,int b) {
	   int sum;
	   sum=a+b;
	   return sum;
   }

    /**
     * 第二题： 定义一个方法 接收三个double类型参数a，b，c， 返回这三个数的平均值 返回值类型为double 方法名为：getAvg
     */
     public static double getAvg(double c,double d,double e) {
    	 double avg;
    	 avg=(c+d+e)/3;
    	 return avg;
     }


    /**
     * 第三题： 定义一个方法 接收两个参数 a 和b 打印a行 b列的一个矩形  不需要返回值   方法名为：printRect
     */
      public static void printRect(int a,int b) {
    	  int i,j;
    	  for(i=1;i<=a;i++) {
    		  for(j=1;j<=b;j++) {
    			  System.out.print('*');
    		  }
    		  System.out.println();
    		  System.out.println();
    	  }
    	  System.out.println();
      }

	
	/**
	 * 第四题：定以一个方法，接收整形数组 为参数  对这个数组进行升序排序  最后输出该数组 不需要返回值 方法名为 sortArr  
	 */
     public static void sortArr(int arr[]) {
    	 Arrays.sort(arr,0,5);
    	 int i;
    	 for(i=0;i<5;i++) {
    		 System.out.println(arr[i]);
    	 }
     }

	
    /**
     *  第五题
     * 你只需要实现for 循环括号的内容就可 ，打印语句系统已经给你完成 
     */
    public static void Print99() {
        for (int j=1;j<=9;j++   ) {
            for(int i=1;i<=j;i++   ) {
                System.out.print(j + " * " + i + " = " + i * j + "\t");
            }
            System.out.println();
        }
    }

    /********** End **********/
}

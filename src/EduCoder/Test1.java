package EduCoder;
import java.util.Arrays;
import java.util.Scanner;
public class Test1 {
	  /********** Begin **********/
    /**\
    
     * ��һ�⣺����һ������ ���������������͵Ĳ��� a��b�������������ĺ�  ����ֵ����Ϊint ������Ϊ��getSum
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
     * �ڶ��⣺ ����һ������ ��������double���Ͳ���a��b��c�� ��������������ƽ��ֵ ����ֵ����Ϊdouble ������Ϊ��getAvg
     */
     public static double getAvg(double c,double d,double e) {
    	 double avg;
    	 avg=(c+d+e)/3;
    	 return avg;
     }


    /**
     * �����⣺ ����һ������ ������������ a ��b ��ӡa�� b�е�һ������  ����Ҫ����ֵ   ������Ϊ��printRect
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
	 * �����⣺����һ�������������������� Ϊ����  ��������������������  ������������ ����Ҫ����ֵ ������Ϊ sortArr  
	 */
     public static void sortArr(int arr[]) {
    	 Arrays.sort(arr,0,5);
    	 int i;
    	 for(i=0;i<5;i++) {
    		 System.out.println(arr[i]);
    	 }
     }

	
    /**
     *  ������
     * ��ֻ��Ҫʵ��for ѭ�����ŵ����ݾͿ� ����ӡ���ϵͳ�Ѿ�������� 
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

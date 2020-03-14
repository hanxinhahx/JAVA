package ChaoXing;

public class Fibonacci {
    public static void main(String[] args) {
		int i,k=0;
		int a[]=new int[25];
		a[0]=a[1]=1;
		for(i=2;i<=19;i++) {
			a[i]=a[i-1]+a[i-2];
		}
		for(i=0;i<20;i++) {
			System.out.printf("%-5d ",a[i]);
			k++;
			if(k%5==0) System.out.println();
		}
	}
}

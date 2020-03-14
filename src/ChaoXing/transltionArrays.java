package ChaoXing;
import java.util.Arrays;
import java.util.Scanner;
public class transltionArrays {
    public static void main(String[] args) {
		int m,n,i,j,t;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		m=input.nextInt();
		int[][] arr=new int[n][m];
		for(i=0;i<n;i++) {
			for(j=0;j<m;j++) {
				arr[i][j]=input.nextInt();
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<=i;j++) {
				t=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=t;
			}
		}
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[0].length;j++)
				System.out.print(arr[i][j]+" ");
			    System.out.println();
			    System.out.println();
		}
	}
}

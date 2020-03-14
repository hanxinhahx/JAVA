package ChaoXing;
import java.util.Arrays;
import java.util.Scanner;

public class RectLength {
    public static  void main(String[] args) {
		int[][] arr=new int[3][3];
		int i,j,sum=0;
		Scanner input=new Scanner(System.in);
		for(i=0;i<arr.length;i++) {
			for(j=0;j<arr[0].length;j++) {
				arr[i][j]=input.nextInt();
				if(i==j) sum+=arr[i][j];
			}
		}
		System.out.println(sum);
	}
}

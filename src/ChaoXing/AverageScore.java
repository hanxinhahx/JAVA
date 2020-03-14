package ChaoXing;

import java.util.Arrays;
import java.util.Scanner;

public class AverageScore {
      public static void main(String[] args) {
		int i;
		double sum=0,average,a,max,min;
		double score[]=new double[10];
		Scanner input=new Scanner(System.in);
		for(i=0;i<10;i++) {
			a=input.nextDouble();
			score[i]=a;
			sum+=a;
		}
		max=min=score[0];
		for(i=1;i<score.length;i++) {
		    if(score[i]>max) max=score[i];
		    if(score[i]<min) min=score[i];
		}
		sum=sum-max-min;
		average=sum/8;
		System.out.printf("%.1f\n",average);
	}
}

package BasicKnowge;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
    	int i,a=2,b=1,t;
    	double sum=0;
    	for(i=1;i<=20;i++){
    		sum+=(double)a/b;
    		t=a;
    		a=a+b;
    		b=t;
    	}
    	System.out.println(sum);
        }
    }


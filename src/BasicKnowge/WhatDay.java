package BasicKnowge;
import java.util.Scanner;
public class WhatDay {
     public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int year,month,day,sum;
		year=input.nextInt();
		month=input.nextInt();
		day=input.nextInt();
		sum=CuloteDa.Culote(year,month,day);
		
		System.out.println(sum);
	}
}
/**
 * 
 * @author HANXINHAHX
 * 
 *
 */
class CuloteDa{
	static int  s;
	public static int Culote(int year,int month,int day) {
		s=0;
		switch(month) {
		//�Ӹ��·���ǰ�ƣ�����ǰһ���µ���������Ϊ�·ݴ��ڵ���1����˿�����1���ϼ��ϸ�����
		   case 12:s+=30;
		   case 11:s+=31;
		   case 10:s+=30;
		   case 9:s+=31;
		   case 8:s+=31;
		   case 7:s+=30;
		   case 6:s+=31;
		   case 5:s+=30;
		   case 4:s+=31;
		   case 3:s+=28;
		   case 2:s+=31;
		   case 1:s+=day;
		}
		if((year%4==0&&year%100!=0)||year%400==0) s++;
		return s;
	}
}
package ChaoXing;

import java.util.Scanner;

public class bankTest {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
		Bank.bankName="����";
		Bank.welcome();
		Bank.help();
		int chose=input.nextInt();
		int k=0;
		boolean b=false;
		double money;
		String name;
		String password;
		System.out.println("�������û����������Ҫ�����Ǯ��");
		  Bank b1=new Bank(input.next(),input.next(),input.nextDouble());Bank.help();
		while(chose!=6) {
		switch(chose) {
		  case 2:System.out.println("�������˺ź����룺");
			     name=input.next();
		         password=input.next();
		         if(name.equals(b1.getName())&&password.equals(b1.getPassword())) b=true;
		         while(b==false&&k<3) {
		        	 System.out.println("�˺Ż�����������������룺");
		        	 name=input.next();
		        	 password=input.next();
		        	 if(name.equals(b1.getName())&&password.equals(b1.getPassword())) b=true;
		        	 else {
		        		 k++;
		        	 }
		         }
		         if(b==false) {
		        	 System.out.println("�����������ѱ����ᣡ��6�˳���");
		        	 break;
		         }
		         else {
		        	 System.out.println("������Ҫȡ�Ľ�");
			         money=input.nextDouble();
			         b1.Withdraw(money); 
			         Bank.help();
		         }
		         break;
		  case 3:System.out.println("������Ҫ����Ľ�");b1.deposit(input.nextDouble());break;
		  case 4:b1.check();break;
		  case 5:System.out.println("���������õ����룺");b1.setPassword(input.next());break;
		}
		chose=input.nextInt();
	}
		Bank.leave();
	}


}

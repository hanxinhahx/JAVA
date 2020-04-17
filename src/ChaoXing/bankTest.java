package ChaoXing;

import java.util.Scanner;

public class bankTest {
    public static void main(String[] args) {
    	Scanner input=new Scanner(System.in);
		Bank.bankName="招商";
		Bank.welcome();
		Bank.help();
		int chose=input.nextInt();
		int k=0;
		boolean b=false;
		double money;
		String name;
		String password;
		System.out.println("请输入用户名和密码和要存入的钱：");
		  Bank b1=new Bank(input.next(),input.next(),input.nextDouble());Bank.help();
		while(chose!=6) {
		switch(chose) {
		  case 2:System.out.println("请输入账号和密码：");
			     name=input.next();
		         password=input.next();
		         if(name.equals(b1.getName())&&password.equals(b1.getPassword())) b=true;
		         while(b==false&&k<3) {
		        	 System.out.println("账号或密码错误，请重新输入：");
		        	 name=input.next();
		        	 password=input.next();
		        	 if(name.equals(b1.getName())&&password.equals(b1.getPassword())) b=true;
		        	 else {
		        		 k++;
		        	 }
		         }
		         if(b==false) {
		        	 System.out.println("多次输入错误，已被冻结！按6退出。");
		        	 break;
		         }
		         else {
		        	 System.out.println("请输入要取的金额：");
			         money=input.nextDouble();
			         b1.Withdraw(money); 
			         Bank.help();
		         }
		         break;
		  case 3:System.out.println("请输入要存入的金额：");b1.deposit(input.nextDouble());break;
		  case 4:b1.check();break;
		  case 5:System.out.println("请输入重置的密码：");b1.setPassword(input.next());break;
		}
		chose=input.nextInt();
	}
		Bank.leave();
	}


}

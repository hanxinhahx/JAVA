package ChaoXing;

import java.util.Scanner;

public class Bank {
	public static String bankName;
    private String name;
    private String password;
    private double banlance=0;
    Scanner input=new Scanner(System.in);
    public static void welcome() {
    	System.out.println("欢迎来到："+bankName+"银行欢迎您！");
    }
    public static void help() {
    	System.out.println("1、开户");
    	System.out.println("2、取款");
    	System.out.println("3、存款");
    	System.out.println("4、余额查询");
    	System.out.println("5、修改密码");
    	System.out.println("6、退出");
    	System.out.println("请输入要办理的业务或者退出系统：");
    }
    public Bank(String name,String password,double money) {
    	
    	this.name=name;
    	this.password=password;
    	banlance+=(money-10);
    	System.out.println("开户成功！存入"+money+"元，手续费10元，余额"+banlance+"元。");
    }
    public void Withdraw(double money) {
    	this.banlance-=money;
    	System.out.println("取出"+money+"元，余额："+this.banlance);
    }
    public void deposit(double money) {
    	this.banlance+=money;
    	System.out.println("存入"+money+"元，余额："+banlance+"元");
    }
    public void check() {
    	System.out.println("余额为："+banlance+"元");
    }
    public void setPassword(String password) {
    	this.password=password;
    }
    public static void leave() {
    	System.out.println("欢迎再次光临！请携带好个人物品");
    }
    public String getName() {
    	return this.name;
    }
    public String getPassword() {
    	return this.password;
    }
}

package ChaoXing;

import java.util.Scanner;

public class Bank {
	public static String bankName;
    private String name;
    private String password;
    private double banlance=0;
    Scanner input=new Scanner(System.in);
    public static void welcome() {
    	System.out.println("��ӭ������"+bankName+"���л�ӭ����");
    }
    public static void help() {
    	System.out.println("1������");
    	System.out.println("2��ȡ��");
    	System.out.println("3�����");
    	System.out.println("4������ѯ");
    	System.out.println("5���޸�����");
    	System.out.println("6���˳�");
    	System.out.println("������Ҫ�����ҵ������˳�ϵͳ��");
    }
    public Bank(String name,String password,double money) {
    	
    	this.name=name;
    	this.password=password;
    	banlance+=(money-10);
    	System.out.println("�����ɹ�������"+money+"Ԫ��������10Ԫ�����"+banlance+"Ԫ��");
    }
    public void Withdraw(double money) {
    	this.banlance-=money;
    	System.out.println("ȡ��"+money+"Ԫ����"+this.banlance);
    }
    public void deposit(double money) {
    	this.banlance+=money;
    	System.out.println("����"+money+"Ԫ����"+banlance+"Ԫ");
    }
    public void check() {
    	System.out.println("���Ϊ��"+banlance+"Ԫ");
    }
    public void setPassword(String password) {
    	this.password=password;
    }
    public static void leave() {
    	System.out.println("��ӭ�ٴι��٣���Я���ø�����Ʒ");
    }
    public String getName() {
    	return this.name;
    }
    public String getPassword() {
    	return this.password;
    }
}

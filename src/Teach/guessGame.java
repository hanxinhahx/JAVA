package Teach;

import java.util.Random;
import java.util.Scanner;

public class guessGame {
	//猜拳小游戏
	public static void main(String[] args) {
		//产生随机数
		Random rand=new Random();
		Scanner input=new Scanner(System.in);
//		int randNumber=rand.nextInt(10);
//		//范围为0~括号内的值减去1
//		System.out.println(randNumber);
		int a,randNumber,number,computer=0,player=0;
		System.out.println("请输入游戏的局数：");
		a=input.nextInt();
		//控制游戏次数
		for(int i=1;i<=a;i++) {
			System.out.println("请输入：0、剪刀  1、石头  2、布");
			//用户输入出拳情况
			number=input.nextInt();
			//接下来判断输入是否合法
			while(number<0||number>2) {
				System.out.println("您的输入不合法，请重新输入：0、剪刀  1、石头  2、布");
				number=input.nextInt();
			}
			//电脑产生随机数
			randNumber=rand.nextInt(3);
			//接下来判断
			if((number==0&&randNumber==2)||(number==1&&randNumber==0)||(number==2&&randNumber==0)) {
				//玩家胜利次数加1
				player+=1;
				//输出各自出拳情况
				System.out.println("你出："+number+"\t电脑出："+randNumber+"\t这一局您赢了！");
				//换行
				System.out.println();
			}
			else if((randNumber==0&&number==2)||(randNumber==1&&number==0)||(randNumber==2&&number==1)) {
				computer+=1;
				System.out.print("电脑出"+number+"\t电脑出"+randNumber+"\t这一局电脑赢了");
				System.out.println();
				System.out.println();
			}
			//平局的情况
			else if(randNumber==number) {
				System.out.println("你出："+number+"\t电脑出："+randNumber+"\t这一局是平局！");
				//换行
				System.out.println();
			}
				
		}
		//最终结果
		System.out.println("最终结果为");
		//获胜次数多的一方赢
		if(player>computer) System.out.println("恭喜您，您赢得了比赛！");
		else if(player==computer) System.out.println("您和电脑打平了！");
		else System.out.println("很遗憾，您被电脑打败了！");
	}

}

package Teach;

import java.util.Random;
import java.util.Scanner;

public class guessGame {
	//��ȭС��Ϸ
	public static void main(String[] args) {
		//���������
		Random rand=new Random();
		Scanner input=new Scanner(System.in);
//		int randNumber=rand.nextInt(10);
//		//��ΧΪ0~�����ڵ�ֵ��ȥ1
//		System.out.println(randNumber);
		int a,randNumber,number,computer=0,player=0;
		System.out.println("��������Ϸ�ľ�����");
		a=input.nextInt();
		//������Ϸ����
		for(int i=1;i<=a;i++) {
			System.out.println("�����룺0������  1��ʯͷ  2����");
			//�û������ȭ���
			number=input.nextInt();
			//�������ж������Ƿ�Ϸ�
			while(number<0||number>2) {
				System.out.println("�������벻�Ϸ������������룺0������  1��ʯͷ  2����");
				number=input.nextInt();
			}
			//���Բ��������
			randNumber=rand.nextInt(3);
			//�������ж�
			if((number==0&&randNumber==2)||(number==1&&randNumber==0)||(number==2&&randNumber==0)) {
				//���ʤ��������1
				player+=1;
				//������Գ�ȭ���
				System.out.println("�����"+number+"\t���Գ���"+randNumber+"\t��һ����Ӯ�ˣ�");
				//����
				System.out.println();
			}
			else if((randNumber==0&&number==2)||(randNumber==1&&number==0)||(randNumber==2&&number==1)) {
				computer+=1;
				System.out.print("���Գ�"+number+"\t���Գ�"+randNumber+"\t��һ�ֵ���Ӯ��");
				System.out.println();
				System.out.println();
			}
			//ƽ�ֵ����
			else if(randNumber==number) {
				System.out.println("�����"+number+"\t���Գ���"+randNumber+"\t��һ����ƽ�֣�");
				//����
				System.out.println();
			}
				
		}
		//���ս��
		System.out.println("���ս��Ϊ");
		//��ʤ�������һ��Ӯ
		if(player>computer) System.out.println("��ϲ������Ӯ���˱�����");
		else if(player==computer) System.out.println("���͵��Դ�ƽ�ˣ�");
		else System.out.println("���ź����������Դ���ˣ�");
	}

}

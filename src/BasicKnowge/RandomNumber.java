package BasicKnowge;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
     public static void main(String[] args) {
		int a=new Random().nextInt(10);
		Scanner input= new Scanner(System.in);
		int b=input.nextInt();
		while(b!=a) {
			if(b<a) System.out.println("��С�ˣ��������");
			else System.out.println("�´��ˣ��������");
			b=input.nextInt();
		}
		System.out.println("�¶��ˣ�");
	}
}

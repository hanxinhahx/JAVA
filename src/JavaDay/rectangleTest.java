package JavaDay;

import java.util.Scanner;

public class rectangleTest {
    public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��������εĿ�͸ߣ�");
		Rectangle1  A=new Rectangle1(input.nextInt(),input.nextInt());
		A.eare();
		A.girth();
	}
}

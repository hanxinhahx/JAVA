package ChaoXing;

public class CircularTest {
    public static void main(String[] args) {
		Circular c1=new Circular();
		Circular c2=new Circular(6.0);
	    System.out.println("c1Բ���ܳ�Ϊ��"+c1.Girth()+"\t���Ϊ��"+c1.Area());
		System.out.println("c2Բ���ܳ�Ϊ��"+c2.Girth()+"\t���Ϊ��"+c2.Area());
	}
}

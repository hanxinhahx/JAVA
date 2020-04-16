package ChaoXing.USB;


public class Mouse implements USB {
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("鼠标已连接");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("鼠标已断开");
	}

}

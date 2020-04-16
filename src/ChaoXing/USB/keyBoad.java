package ChaoXing.USB;


public class keyBoad implements USB {

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("键盘已连接");
		
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("键盘已断开");
	}



}

package ChaoXing.USB;

public class Test {
    public static void main(String[] args) {
		Mouse mouse=new Mouse();
		keyBoad keyBoad=new keyBoad();
	    Computer computer=new Computer();
	    computer.addUsb(mouse);
	    computer.addUsb(keyBoad);
	    computer.power_On();
	    computer.power_OFF();
	}
}

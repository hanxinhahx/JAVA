package ChaoXing.USB;


public class Computer  {
	USB[] uabArrarys=new USB[4];
	public void addUsb(USB usb) {
		for(int i=0;i<uabArrarys.length;i++) {
			if(uabArrarys[i]==null) {
				uabArrarys[i]=usb;
				uabArrarys[i].turnOn();
				break;
			}
		}
	
	}
	public void power_On() {
		System.out.println("电脑已开机……");
	}
    public void power_OFF() {
    	for(int i=0;i<uabArrarys.length;i++) {
    		if(uabArrarys[i]!=null) {
    			uabArrarys[i].turnOff();
    		}
    	}
    	System.out.println("电脑已关机……");
    }
}

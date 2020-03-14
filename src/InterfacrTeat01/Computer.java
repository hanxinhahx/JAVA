package InterfacrTeat01;

public class Computer {
     private USB[] UsbArry=new USB[4];
     public void add(USB usb) {
    	 for(int i=0;i<UsbArry.length;i++) {
    		 if(UsbArry[i]==null) {
    			 UsbArry[i]=usb;
    			 break;
    		 }
    	 }
     }
     public void TurnOn() {
    	 for(int i=0;i<UsbArry.length;i++) {
    		 if(UsbArry[i]!=null) UsbArry[i].Power_ON();
    	 }
    	 System.out.println("电脑已开机");
     }
public void TurnOff() {
	 for(int i=0;i<UsbArry.length;i++) {
		 if(UsbArry[i]!=null) UsbArry[i].Power_OFF();
	 }
	 System.out.println("电脑已关机");
  }
}

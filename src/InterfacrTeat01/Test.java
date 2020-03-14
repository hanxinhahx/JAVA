package InterfacrTeat01;

public class Test {
     public static void main(String[] args) {
		Computer c=new Computer();
		c.add(new KeyBord());
		c.add(new Mouse());
		c.add(new Mic());
		c.TurnOn();
		System.out.println();
	c.TurnOff();
	}
}

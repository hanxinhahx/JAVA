package ChaoXing;
class Car {
    private String ID;
    private int speed;
    private double weight;
    public void upSpeed() {
    	this.speed+=10;
    }
    public void downSpeed() {
    	this.speed-=10;
    }
    public void setID(String ID) {
    	this.ID=ID;
    }
    public void chekWeight() {
    	System.out.println("载重为："+weight);
    }
    public Car() {
    	ID="XX1234";
    	speed=100;
    	weight=100.0;
    }
    public Car(String ID,int speed,double weight) {
    	this.ID=ID;
    	this.speed=speed;
    	this.weight=weight;
    }
	public void print() {
    	System.out.println("车牌："+ID+"车速"+speed+"载重量："+weight);
    }
}

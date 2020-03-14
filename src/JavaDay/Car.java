package JavaDay;

public class Car {
    private String carId;
    private int speed;
    private double weight;
    public Car(String carId,int speed,double weight) {
    	this.carId=carId;
    	this.speed=speed;
    	this.weight=weight;
    }
    public void upSpeed() {
    	speed+=10;
    }
    public void downSpeed() {
    	speed-=10;
    }
    public void check() {
    	System.out.println("重量："+weight);
    }
    public void print() {
    	System.out.println("车牌："+carId+"\t"+"速度："+speed+"\t"+"车重："+weight);
    }
    public void setId(String carId) {
    	this.carId=carId;
    }
}

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
    	System.out.println("������"+weight);
    }
    public void print() {
    	System.out.println("���ƣ�"+carId+"\t"+"�ٶȣ�"+speed+"\t"+"���أ�"+weight);
    }
    public void setId(String carId) {
    	this.carId=carId;
    }
}

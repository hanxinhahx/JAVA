package ChaoXing.Animal;

public class Test {
	public static void main(String[] args) {
		Animal animal1=new Cat();
		Animal animal2=new Dog();
	    show(animal1);
	    show(animal2);
	    Cat cat=(Cat) animal1;
	    Dog dog=(Dog) animal2;
	}
    public static void show(Animal animal) {
    	animal.shout();
    	if(animal instanceof Cat) {
    		((Cat) animal).catchMouse();
    	}
    	else {
    		((Dog)animal).eat();
    	}
    }
}

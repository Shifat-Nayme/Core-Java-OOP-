package super_key;

class Animal {
	String colour = "blue";

	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal {
	String colour = "white";

	void berk() {
		System.out.println("dogs are bearking");
	}

	void eat() {
		System.out.println("eating bread");
	}

	void work() {
		super.eat();
		berk();
	}

	void printcolour() {
		System.out.println(colour);
		System.out.println(super.colour);
	}
}

public class Super_key {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.printcolour();
		d.work();

	}
}

package downcasting_without_instanceof;

class Animal2{
	
}
class Dog2 extends Animal2{
	static void method(Animal2 a) {
		Dog2 obj= (Dog2) a;
		System.out.println("ok downcasting performed");
	}
}

public class Downcasting {

	public static void main(String[] args) {
		Animal2 a=new Dog2();
		Dog2.method(a);

	}

}

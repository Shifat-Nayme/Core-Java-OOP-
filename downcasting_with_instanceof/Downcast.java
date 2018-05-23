package downcasting_with_instanceof;

class Animal{
}
class Dog extends Animal{
		 static void method(Animal a) {
			 if(a instanceof Dog) {
				 Dog d= (Dog)a;
				 System.out.println("downcasting performed");
			 }
		 }
	 }

public class Downcast {

	public static void main(String[] args) {
		Animal a=new Dog();
		Dog.method(a);
		

	}

}

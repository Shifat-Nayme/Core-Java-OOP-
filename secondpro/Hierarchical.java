package secondpro;

class Animal{
	void eat()
	{
		System.out.println("Eating");
	}
}

class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking");
	}
}
class Cat extends Animal{
	void meow()
	{
		System.out.println("meowing....");
	}
}
public class Hierarchical {
	public static void main(String args[])
	{
		Cat c = new Cat();
		c.meow();
		c.eat();
		
	}

}

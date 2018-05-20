package FirstPac;

import org.omg.CORBA.PUBLIC_MEMBER;

class Animal {
	
	public void Dog()
	{
		
		System.out.println("Dog is a faithful animals");
		
	}

} 
class Human extends Animal{
	
	public void Man()
	{
		System.out.println("Man is Mortal");
	}
}
class Bird extends Human{

	public void Birds() {
	System.out.println("Birds can fly");
	
	}
}

 class Mainclass{
	
	public static void main(String args[]) {
		
		
		//Animal ob = new Animal();
		
		Bird ob = new Bird();
		//Human ob1 = new Human();

		ob.Man();
		ob.Dog();
		ob.Birds();	
		
	}
}


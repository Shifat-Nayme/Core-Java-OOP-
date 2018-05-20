package methodOverriding;

class Vehicle{
	void run()
	{
		System.out.println("Vehical runs safely");
	}
}
class Bike extends Vehicle{
	void run()
	{
		System.out.println("Bike is dangerous");
	}
}

public class Overriding1 {

	public static void main(String[] args) {
		Bike obj= new Bike();
		obj.run();
		
	}

}

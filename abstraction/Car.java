package abstraction;

public interface Car {
	
	//100% abstraction no method body
	//build in abstraction nature 
	//always define abstract method
	//can not creat the obj of interface
	//only final and static variable can be define
	
	
	public void start();
	public void stop();
	public void refual();

}

class Bmw implements Car{
	public void start()
	{
		System.out.println("Bmw car is starting");
	}
	public void stop()
	{
		System.out.println("Bmw is stoping");
	}
	public void refual() {
		System.out.println("Bmw --refual");
	}
	
	//non overriden method
	public void theif_sefty() {
		System.out.println("Bmw-- theif safety");
	}
	
}

class Cartest{
	public static void main(String[] args) {
		Bmw obj=new Bmw();
		obj.start();
		obj.stop();
		obj.refual();
		obj.theif_sefty();
	}
}

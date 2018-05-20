package covariant_return;

public class Sum{
	 Sum fun() {
	
		System.out.println("I am in super class sum...");
		return new Sum();
	}
}

class Div extends Sum{
	   Div fun() {
		System.out.println("i am in Sub class div..");
		return new Div();
	}
}

class Covariant{
	Sum object() {
		System.out.println("Covarient");
		return new Div();
	}
}


class Test{
	
	public static void main(String[] args) {

		Sum obj1= new Sum();
		obj1.fun();
		Div obj= new Div();
		obj.fun();
		Covariant obj2=new Covariant();
		obj2.object();
		
		
			
	}
}
package super_key;

class Bird{
	Bird(){
	System.out.println("animals are cute");
	}
}
class Human extends Bird{
	    Human() {
		super();
		System.out.println("Human is created");	
	}
}

public class Testsuper3 {

	public static void main(String[] args) {
		Human d=new Human(); //when creat a object constractor automatically called
		
	}
}

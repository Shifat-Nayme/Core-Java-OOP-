package covariant_return;

class A{
	int x=30;
}
class B extends A{
	int y=20;
}

class Base{
	A getobject() {
		System.out.println("Base class");
		return new A();
	}
}

public class Covariant_Test extends Base {
	
	A getobject() {
		System.out.println("Covariant");
		return new B();
	}

	public static void main(String[] args) {
		Base obj= new Covariant_Test();
		System.out.println(obj.getobject() instanceof B);
		System.out.println(obj.getobject() instanceof A);
	}
}

package abstract_problemslove;

public class Test {

	public static void main(String[] args) {
		Shape obj;
		obj=new Rectangle(10, 20);
		obj.Area();
		obj=new Triangle(10, 20);
		obj.Area();	
		obj=new Circle(10);
		obj.Area();
		
	}

}

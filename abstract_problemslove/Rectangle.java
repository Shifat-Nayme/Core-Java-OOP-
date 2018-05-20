package abstract_problemslove;

public class Rectangle extends Shape{
	
	public Rectangle(double num1, double num2) {
		super(num1, num2);
	}
	@Override
	void Area() {
		double result= num1*num2;
		System.out.println("rectangle area: "+result);
	}

}

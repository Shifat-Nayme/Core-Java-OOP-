package abstract_problemslove;

public class Triangle extends Shape{
	
	public Triangle(double num1, double num2) {
		super(num1, num2);
	}

	@Override
	void Area() {
		double result=.5*num1*num2;
		System.out.println("Triangle area: "+result);
	}

}

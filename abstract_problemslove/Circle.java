package abstract_problemslove;

public class Circle extends Shape {
	public Circle(double num) {
		super(num, num);
	}

	@Override
	void Area() {
		double result= Math.PI*num1*num2;
		System.out.printf("Circle area: %.2f",result);
		
	}

}

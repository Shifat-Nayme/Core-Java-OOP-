package runtime_polymorphysm;

public class Triangle extends Shape {
	double base,hight;
	
	Triangle(double base, double hight) {
		this.base=base;
		this.hight=hight;
	}
	
	@Override
	double area() {
		// TODO Auto-generated method stub
		System.out.println("triangle area");
		return (.5*base*hight);
	}

}

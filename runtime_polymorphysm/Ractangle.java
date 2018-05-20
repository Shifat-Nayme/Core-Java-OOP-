package runtime_polymorphysm;

public class Ractangle extends Shape {
	double length, width;
	
	 Ractangle(double length, double width) {
		this.length=length;
		this.width=width;
	}
	 @Override
	double area() {
		// TODO Auto-generated method stub
		 System.out.println("ractengle area");
		return length*width;
	}

}

package runtime_polymorphysm;


public class Test {
	public static void main(String[] args) {
		Shape obj=new Shape();
		Ractangle obj1=new Ractangle(10,20);
		Triangle obj2=new Triangle(10,20);
		
		System.out.println(obj.area());
		System.out.println(obj1.area());
		System.out.println(obj2.area());
		
		//for runtime polymorphysm or dinamic method dispas
		System.out.println("dinamic method dispas or runtime polymorphysm");
		Shape s1=new Shape();
		Shape s2=new Ractangle(10,20);
		Shape s3= new Triangle(10, 20);
		
		System.out.println(s1.area());
		System.out.println(s2.area());
		System.out.println(s3.area());	
		
		//using array
		System.out.println("using array");
		Shape ara[]=new Shape[3];
		ara[0]=new Shape();
		ara[1]=new Ractangle(10, 20);
		ara[2]=new Triangle(10, 20);
		
		for(int i=0; i<3; i++) {
			System.out.println(ara[i].area());
		}	
	}

}

package thirdpac;

class A extends B{
	void msg()
	{
		System.out.println("Hello");
	}
}
class B{
	void msg()
	{
		System.out.println("Wellcome");
	}
}
class C extends A,B{ //suppose if it were  
	//multiple inheritance

	public static void main(String[] args) {
		
		C obj = new C();
		obj.msg(); //Now which msg() method would be invoked? 
		
	}
}

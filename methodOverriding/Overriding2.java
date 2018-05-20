package methodOverriding;

class Bank{
	int get_interest()
	{
		return 0;
	}
}
class Sonali extends Bank{
	int get_interest()
	{
		return 7;
	}
}
class Datch extends Bank{
	int get_interest()
	{
		return 8;
	}
}
class Rupali extends Bank{
	int get_interest()
	{
		return 9;
	}
}

public class Overriding2 {

	public static void main(String[] args) {
		Sonali s= new Sonali();
		Datch d=new Datch();
		Rupali r= new Rupali();
		System.out.println("Rate of interest: "+s.get_interest());
		System.out.println("Rate of interest: "+d.get_interest());
		System.out.println("Rate of interest: "+r.get_interest());

	}
}

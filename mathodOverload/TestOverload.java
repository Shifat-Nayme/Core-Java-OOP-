package mathodOverload;

public class TestOverload {

	public static void main(String args) {
		System.out.println("main with String");
	}
	public static void main()
	{
		System.out.println("main without String");
	}
	public static void main(String args[])
	{
		System.out.println("main with string[]"); /*overload java main() method recieve string 
													array as arrgument only*/
	}

}

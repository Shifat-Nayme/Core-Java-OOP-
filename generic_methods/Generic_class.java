package generic_methods;

class Generic_class<g> {
	g i;
	public void add(g i) {
		this.i=i;
	}
	public g get(){
		return i;
	}
}
	
class Test_generic{
	public static void main(String[] args) {
		Generic_class<Integer> obj=new Generic_class<Integer>();
		Generic_class<String> obj1=new Generic_class<String>();
		
		obj.add(100);
		System.out.println(obj.get());
		obj1.add("shifat");
		System.out.println(obj1.get());
		
	}
}

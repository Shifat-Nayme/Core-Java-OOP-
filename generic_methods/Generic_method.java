package generic_methods;

class Generic {

	public <G> void printarray(G ara[]) {
		for (G g : ara) {
			System.out.println(g);
		}
	}
}

public class Generic_method {

	public static void main(String[] args) {
		Generic obj = new Generic();
		String countries[] = new String[] { "bangladesh", "indea", "pakistan" };
		Integer num[] = { 12, 13, 15, 45, 78 };

		obj.printarray(countries);
		obj.printarray(num);

	}
}

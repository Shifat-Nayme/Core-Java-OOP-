package aggregation2;

import java.awt.DisplayMode;

class Address{
	String city, state, country;
	
	public Address(String city, String state, String country) {
		this.city=city;
		this.state=state;
		this.country=country;	
	}
}
class Employee{
	int id;
	String name;
	Address address;
	public Employee(int id, String name,Address address) {
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
}


public class Has_A {

	public static void main(String[] args) {
		Address address1=new Address("dhanmondi", "dhaka", "Bangladesh");
		Address address2= new Address("newmarket", "dhaka","Bangladesh");
		
		Employee r1 = new Employee(01, "Shifat", address1);
		Employee r2 = new Employee(02, "Nayme",address2);
		
		r1.display();
		r2.display();	

	}

}

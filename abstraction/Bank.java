package abstraction;

public abstract class Bank {
	
	//partial abstraction
	//can not creat the obj of abstract class
	//
	public abstract void loan(); //abstract method -- no body
	
	//non abstract method
	public void credit() {
		System.out.println("Bank credit--");
	}
	public void debit() {
		System.out.println("Bank--debit");
	}
}

class Sonali_bank extends Bank{

	public void loan() {
		System.out.println("Loan for all");
	}
	public void funds() {
		System.out.println("funds method is only for sonali bank");
	}
}

class Abstraction{
	public static void main(String[] args) {
		Sonali_bank obj= new Sonali_bank();
		obj.credit();
		obj.debit();
		obj.loan();
		obj.funds();
		
		Bank obj1=new Sonali_bank(); //dinamic polymorphysm
		obj1.credit();
		obj1.debit();
		obj1.loan();
		//here funds method not accessable, cause it's only part of sonalibank
		
		//Bank b1= new Bank(); //it is not possible , can't creat of abstract class obj
		
			
	}
}

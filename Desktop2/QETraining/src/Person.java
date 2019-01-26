
public class Person {
	private static String name; // These are instance variable inside the class but outside the method.
	private String address;
	private int id;

	public Person(String n_name, String a_address) { // This is constructor to init the insta variables.

		this.name = n_name;
		this.address = a_address;
	}

	public void setName(String n_name) {// This is setter method.  
		this.name = n_name;
	}

	public static String getName() { // This is  getter method.
		return name;
	}

	public void setAddress(String a_address) {
		this.address = a_address;
	}

	public String getAddress() {
		return address;
	}

}

/*
 * Create a class Person, extend the class and create an accountant.
 * 
 * Create another class account, extend the class account to create savings
 * account and current account
 * 
 * Deposit $5000 into the savings account and $10,000 into current account
 */
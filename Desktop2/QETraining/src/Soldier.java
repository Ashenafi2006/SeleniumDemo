public class Soldier {

	private String name;
	private int age;

	public Soldier(String n_name, int a_age) {// constructor 

		this.name = n_name;
		this.age = a_age;

	}

	public void shooting() {

		System.out.println("hey");

	}

	public void setName(String n_name) {

		n_name = this.name;
	}

	public void setAge(int a_age) {

		a_age = this.age;

	}

	public String getName() {

		return this.name;

	}

	public int getAge() {
		return this.age;
	}

}
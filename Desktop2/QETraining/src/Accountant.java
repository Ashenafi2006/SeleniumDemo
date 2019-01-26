
public class Accountant extends Person {

	private static int id;
	private static float salary;
	private static float comm;
	//private static float cmm;

	public Accountant(int i_id, float s_salary, float c_comm, String a_address, String n_name) {
		super(n_name, a_address);// these two parameters can taken from the supper class Person. 
		this.id = i_id;
		this.salary = s_salary;
		this.comm = c_comm;
	}

	public void setId(int i_id) {
		this.id = i_id;
	}

	public void setSalary(float s_salary) {
		this.salary = s_salary;
	}

	public void setComm(float c_comm) {
		this.comm = c_comm;
	}

	public int getId(int i_id) {

		return id;
	}

	public float getSalary(float s_salary) {

		return salary;
	}

	public static float getComm(float c_comm) {

		return comm;

	}

	public static void main(String[] args) {

		Person p = new Person("custmer name is :Tom", "custmer address:455 kuehnis dr");// Object created.

		Accountant a = new Accountant(101, 300, 12000, "455 kuehnis dr", "Customer Name:Ashenafi");// Object created.
		//Account2  a3 = new Account2("Ashu", "455 kuehnis dr", 10000,5000);
		//System.out.println(a3.savingAccount());
		
		/*System.out.println(p.getName());
		System.out.println(p.getAddress());*/

		/*System.out.println(a.getId(id));
		System.out.println(a.getSalary(salary));
		System.out.println(a.getComm(cmm));*/

		Account a1 = new Account(10000, 5000);
		System.out.println(a1.getSaving());
		System.out.println(a1.getCurrent(0));

	}

}

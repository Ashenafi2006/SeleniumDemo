
public class Student3 {

	int Id = 4;
	String name = "Ashu";
	public static void main(String[] args) {
		Student3 s1 = new Student3();// object created 
		Student3 s2 = new Student3();// we can create multiple object
		s2.name = "Taye";
		System.out.println(s1.Id);// access object 
		System.out.println(s1.name);	
		System.out.println(s2.name);
	}	

}

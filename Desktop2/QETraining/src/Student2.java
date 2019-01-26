
 class Student {
	
	int rollno;
	String name;
	
	public static void main(String[]args){
		
		Student S1 = new Student();
		Student S2 = new Student();
		S1.insertRecord(4,"xxx");
		S2.insertRecord(5, "yyy");
		S1.displayInformation();
		S2.displayInformation();	
		//System.out.println(S1.displayInformation());
	}
	
	void insertRecord(int r,String n){
		rollno = r;
		name = n;	
	}
	
	void displayInformation(){
		System.out.println(rollno +" "+ name);
	}
}
	class Test3{
		
	
	}

public class ChildSoldier extends Soldier {

private  double salary;
private  String title;

  public ChildSoldier(String n_name, int a_age,double s_salary,String t_title){
  super(n_name,a_age);

this.salary = s_salary;
this.title = t_title;

}

public void setSalary(double s_salary){
s_salary = this.salary;
}

public void setTitle(String t_title){

this.title = t_title;
}

public double getSalary(){
	return this.salary;
}

public String getTitle(){
	
	return this.title;
}

public static void main(String[]args){
	
	Soldier s1 = new Soldier("Ashu",34);// object created 
	System.out.println(s1.getAge());
	System.out.println(s1.getName());
	ChildSoldier s2 = new ChildSoldier("kebede",55,500.50,"title");
	System.out.println(s2.getName());
	System.out.println(s2.getAge());
	System.out.println(s2.getSalary());
	System.out.println(s2.getTitle());
		
}



}
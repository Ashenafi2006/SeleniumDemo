public class Student123 extends Person234{
    
    private String height, sex, age;
    
    public Student123(String d_name, String d_address, String d_sex, String d_age) {
        super(d_name, d_address);// constructor to initialize instance variables 
        this.sex = d_sex;// to access private instance variables 
        this.age = d_age;
        // TODO Auto-generated constructor stub
    }
   
    public void setHeight(String d_height){// getter and setter methods encapsulation concepts 
        d_height = this.height;// setter has no return statement 
    }    
    public void setSex(String d_sex){
        this.sex = d_sex;
    }
    
    public void setAge(String d_age){
        this.age = d_age;
    }
    
    public String getHeight(){
        return this.height;
    }
    
    public String getSex(){
        return this.sex;
    }
    
    public String getAge(){
        return this.age;
    }

    public static void main(String [] args){
        Person234 person;// Obj declaration 
        person = new Person234("Femi", "123 City ave, oakland");// Obj creation and declaration 
        System.out.println(person.getAddress());
        System.out.println(person.getName());
        Student123 student = new Student123("Ashu", "Sunnyvale","M", "12");// Obj creation and declaration 
        System.out.println(student.getAge());
        System.out.println(student.getName());
        student.setSex("Male");
        System.out.println(student.getSex());
    }

    

}
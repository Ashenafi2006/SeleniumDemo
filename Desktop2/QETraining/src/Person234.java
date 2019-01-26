public class Person234 {
    
    private String name, address;

    public Person234(String d_name, String d_address) {
        this.name = d_name;
        this.address = d_address;
    }
    
    public void setName(String d_name){// Abstraction concept 
        d_name = this.name;// has no return type 
    }
    
    public void setAddress(String d_address){// Abstraction concept 
        d_address =  this.address;// has no return type
    }
    
    
    public String getName(){// Abstraction concept 
        return this.name;// has return Type 
    }
    
    public String getAddress(){// Abstraction concept 
        return this.address;// has return Type 
    }
}
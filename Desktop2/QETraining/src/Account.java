
public class Account {
	
	private static  int saving; // Instance Variables private to the class
	private static int current; // Instance Variables private to the class
	
	public Account(int s_saving,int c_current){ //Constructor to Init 
		
		this.saving = s_saving;
		this.current = c_current;
	}
	
public void setSaving(int s_saving){
		
	}
	
public void setCurrent(int c_current){
		
	}

public static int getSaving(){
	return saving;
}

public static int getCurrent (int c_current){
	return current;
}

/*public static int  getCurrent() {
	// TODO Auto-generated method stub
	return getCurrent();*/
//}

}

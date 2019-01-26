
public class Account2 extends Person{

	private double balance;
	private double amountdep;
	
	public Account2(String n_name, String a_address,double b_balance,double a_amountdep) {
		super(n_name, a_address);
		
		this.balance = b_balance;
		this.amountdep = a_amountdep;
	}

	public double savingAccount(){
		return amountdep;
		
		
	}
	
	
	
	public void currentAccount(){
		
		
	}
	
	public void depoist(){
		
	}
	
	
}

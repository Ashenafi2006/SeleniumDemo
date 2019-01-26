
public class SavingAccount extends Account {

	private int saving;
	private int current;

	public SavingAccount(int a_saving, int c_current) {
		super(getSaving(), getCurrent(0));
		this.saving = getSaving();
		this.current = getCurrent(c_current);

	}
}

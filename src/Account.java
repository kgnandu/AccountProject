
public class Account {
	private String acctNumber;
	private double balance;
	private String userName;


	public void setBalance(double d) {
		if(d > 0) {
			balance = d;
		}

		//else throw exception
	}
	
	public double getBalance() {
		return balance;
	}

	public void setAcctNumber(String acctNumber) {
		this.acctNumber = acctNumber;
	}

	public String getAcctNumber() {
		return acctNumber;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}


public class Account {
  private int accountNumber;
  private String accountType;
  private double accountBalance;
public Account(int accountNumber, String accountType, double accountBalance) {
	super();
	this.accountNumber = accountNumber;
	this.accountType = accountType;
	this.accountBalance = accountBalance;
}
public double increaseBalance(double amt) {
	return accountBalance+=amt;
}
public int getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(int accountNumber) {
	this.accountNumber = accountNumber;
}
public String getAccountType() {
	return accountType;
}
public void setAccountType(String accountType) {
	this.accountType = accountType;
}
public double getAccountBalance() {
	return accountBalance;
}
public void setAccountBalance(double accountBalance) {
	this.accountBalance = accountBalance;
}
}

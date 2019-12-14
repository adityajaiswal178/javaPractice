package corejava;

public class BankAccount {
	private int accountNum;
	private int balance;
	private String customerName;
	private String email;
	private int phoneNum;
	
	public int getAccountNum(){
		return accountNum;
	}
	public void setAccountNum(int accountNum){
		this.accountNum=accountNum;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public void setBalance(int balance){
		this.balance=balance;
	}
	
	public String getCustomerName(){
		return customerName;
	}
	public void setCustomerName(String customerName){
		this.customerName=customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(int phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	public String depositFunds(int funds){
		return "Total fund; "+(balance+= funds);
	}
	
	public String withdrawFunds(int fund){
		if(balance<fund){
			return "funds are less";
		}
		return "withdrawal amount: "+(balance-fund);
	}
}

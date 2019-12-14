package corejava;

public class VipAccount {
	
	private int credit;
	private String emailAddress;
	private int limit;
	
	//empty constructor
	public VipAccount(){
		this(100,"aditya@gmail.com",12);
		System.out.println("Empty Constructor");
	}
	public VipAccount(int credit,String emailAddress){
		this(credit, emailAddress,1366);
		System.out.println("2nd constructor");
	}
	public VipAccount(int credit,String emailAddress,int limit){
		this.credit=credit;
		this.emailAddress=emailAddress;
		this.limit=limit;
	}
	public int getCredit(){
		return credit;
	}
	public void setCredit(int credit){
		this.credit=credit;
	}
	
	public int getLimit(){
		return limit;
	}
	
	public void setLimit(int limit){
		this.limit=limit;
	}
	public String getEmailAddress(){
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress){
		this.emailAddress=emailAddress;
		
	}
}

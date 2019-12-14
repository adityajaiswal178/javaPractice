package corejava;

public class BankTest {
	
	public static void main(String[] args) {
		
		BankAccount bankAcc = new BankAccount();
		bankAcc.setBalance(10000);
		System.out.println(bankAcc.depositFunds(12));
		System.out.println(bankAcc.withdrawFunds(1000000));
		
		VipAccount vipAcc =new VipAccount(100,"sldjfl@gmail");
		System.out.println("My credit amount and email address : "+vipAcc.getCredit()+", "+vipAcc.getEmailAddress()+", "+vipAcc.getLimit());
		VipAccount vipAcc1 =new VipAccount();
		System.out.println("My credit amount and email address : "+vipAcc1.getCredit()+", "+vipAcc1.getEmailAddress()+", "+vipAcc1.getLimit());
		
	}

}

package task;

public class Bank_account {
	final static String bank ="Akaska Bank";
	final long Account_no;
	final String Account_Holder;
	double current_balance;
	
	public Bank_account(long Account_no, String account_Holder, double current_balance) {
		super();
		this.Account_no = Account_no;
	    this.Account_Holder = account_Holder;
		this.current_balance = current_balance;
	}
	
    void display()
    {
    	System.out.println(" Account No: " + Account_no);
        System.out.println(" Account holder Name: " + Account_Holder);
        System.out.println(" Account balance: " + current_balance);
    }

	public double deposite(double amount)
	{
		current_balance+=amount;
		return current_balance;
	}
	public double withdraw(double amount)
	{
		if(amount > current_balance)
			System.out.println(" Insufficient Balance ");
		else
			current_balance-=amount;
		
	 return current_balance;	
	}

	public static void main(String[] args) {
       System.out.print("     இனிய தமிழ் புத்தாண்டு நல் வாழ்த்துகள்\r\n "+"               "+Bank_account.bank+"\r\n");
       System.out.println("**********************************************");
       Bank_account b1=new Bank_account(9087890,"Daniel",50000);
       b1.display();
       System.out.println("----------------------------------------------");
       double NB=b1.deposite(30000);
       System.out.println(" Your are Deposited 30000 succesfully");
       System.out.println(" Current_Account Balance "+NB);
       System.out.println("----------------------------------------------");
       NB=b1.withdraw(5000);
       System.out.println(" Please bring the case Rupees 5000");
       System.out.println(" current_Account Balance after withdraw "+NB);
       System.out.println("----------------------------------------------");
       System.out.println(" எங்கள் வங்கி கணக்கை பயன்படுத்தியதற்கு நன்றி  ");
	}

}

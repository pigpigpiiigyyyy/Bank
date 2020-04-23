import java.util.Scanner;

public class Application {
	private String name;
	private int balance;
		
	public void setName(String name) {
		this.name=name;	
	}
	
	public void setBalance(int balance) {
		this.balance=balance;	
	}
	public String getName() {
		return name;
	}

	public int getBalance() {
		return balance;
	}
	public Application(String name) {
		// TODO Auto-generated constructor stub
		System.out.println();
		this.name=name;
	}
	public Application(int balance) {
		// TODO Auto-generated constructor stub
		this.balance=balance;
	}
	 
	 public Application( String name, int balance) {
		 System.out.println();
		 this.name=name;
		 this.balance=balance;
		
	 }
	
	

	public  void Meny() {
		System.out.println("Which service can we help you with (1. Withdraw; 2.Put in money; 3.Lock card; 4.Check the balance; 5.Your profile)? Please choose a number to start: ");
	}
	
   
    static void onfirm() {
    	String confirm = null;
		if (  confirm=="Yes")
			System.out.println("Your card is locked now.");
		else if (confirm=="No") {
			System.out.println("It will direct you back to menu page.");
		
		}
		else {
			System.out.println("You entered invalid information.");
		
		}
    	
    }

	private static void extracted() {
		{
			System.out.println("We helped you lock your bankcard.");
		}
	}
	
public static void main(String[] args) {
	Application obj=new Application();
	Application obj3=new Application();
	System.out.println("Dear customer, welcome to RMB Bank!");
	Scanner input=new Scanner(System.in);
	
	
	System.out.println("Please enter your name: ");
	String name=input.nextLine();

	obj.Meny();
	
	int tet=input.nextInt();
	String confirm=input.nextLine();
	switch(tet) {
	case 1:
		System.out.println("How much do you want to withdraw?");
		System.out.println("Please enter the amount:");
		int te=input.nextInt();
		System.out.println("Your bankaccount balance is: ");
//		getbalance()  
		break;
		
	case 2:
		System.out.println("How much do you want to put in?");
		System.out.println("Please enter the amount:");
		int putIn=input.nextInt();
		break;
		
	case 3:
		System.out.println("Do you want to lock your card? Please enter Yes or No.");
	
		obj3.onfirm(); 
		
		
		break;
		
	case 4:
		System.out.println("Your bankaccount balance is: " );
		obj.Meny();
	break;
	case 5:
		System.out.println(" " );
		obj.Info();
	break;
		
		default: System.out.println("You entered invalid number.");
		obj.Meny();
		
		
	
 }
}
}

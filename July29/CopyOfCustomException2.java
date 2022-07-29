package exceptionhandling;

import java.util.Scanner;

class BalanceException extends Exception {
	static int balance =10000;
	static public boolean isEligible(int amount) {
		if (amount < balance)
			return true;
		else
			return false;
	}
	public static int getBalance() {
		return balance;
	}
	public static void setBalance(int balance) {
		BalanceException.balance = balance;
	}
	
	
}

public class CopyOfCustomException2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int amount=sc.nextInt();
		try{
		if(BalanceException.isEligible(amount)){
			BalanceException.setBalance(BalanceException.balance-amount);
			System.out.println("You remaining balance:::"+ BalanceException.getBalance());
		
		else
			throw new BalanceException();
		}catch(BalnceException e){
			e.printStackTrace();
		}
	}
}

//Question- Take amount from user. If amount is less than balance then throw exception otherwise reduce balance
//and show remaining one

	
	/*package ExceptionHandi;
	import java.util.Scanner;
	class LessBalance extends Exception {
	    String message;
	    public LessBalance(String message) {
	        this.message = message.toString();
	    }
	}
	class BankAccount  {
	   static double current_balance = 1000;
	    public static void main(String[] args) throws LessBalance {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter amount to withdrawal");
	        int withdrawl = sc.nextInt();
	        try {
	            if (current_balance < withdrawl) {
	                throw new LessBalance("Insufficient balancew ! your Current balance is " + current_balance);
	            } else {
	                System.out.println("Withdrawl Successfully done,take out ur cash: " +withdrawl);
	                System.out.println("The remaining Balance is:"+(current_balance-withdrawl));
	            }
	        } catch (LessBalance e) {
	            e.printStackTrace();
	          }
	    }
	}
	
	*/



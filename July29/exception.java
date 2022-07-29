package exceptionhandling;

import java.util.Scanner;

class BankValueException extends Exception {
	@Override
	public String toString() {
		return "Bankballance is not suficient enough to make the withddrawl";
	}
}

public class exception {

	static void validate() throws BankValueException {
		Scanner a = new Scanner(System.in);
		System.out.println("enter the amount:");
		int amount = a.nextInt();
		if (amount > 1000) {
			throw new BankValueException();
		} else {
			System.out.println("Amount dedetece and is processed");
		}
	}

	public static void main(String[] args) {
		try {
			validate();
		} catch (BankValueException e) {
			System.out.println(e);
		}
	}

}

package exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("main prg");
			try{
			System.out.println(5/0);
			//throw new ArithmeticException();
			}
			catch(ArithmeticException e){
				e.printStackTrace();
			}
			System.out.println("Hello All!!!");
	}

}

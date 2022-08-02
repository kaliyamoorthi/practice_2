package DataStructure;

public class RecursionExample {
	static int factorial(int num){
		if(num==1 ||num==0)
			return 1;
		return num*factorial(num-1);
	}
	public static void main(String[] args) {
		int ans = factorial(5);
		System.out.println(ans);
	}

}


package Arrays;

public class ArrayExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int array[][]=new int[][]{{23,34,56},{45,67,89}};	
			
			for(int row=0;row<array.length;row++){
				for(int col=0;col<array[row].length;col++){
					System.out.print(array[row][col]+" ");
				}
				System.out.println();
			}
	}

}

package ArraysJava;

public class multiarrays {

	public static void main(String[] args) {
		// declaring and initializing 2D array
		int[][] arr= new int [3][3];
		System.out.println("Array size:"+ arr.length);
				for (int i=0;i<arr.length;i++) {//row count
					for(int j=0;j<arr.length;j++) {//cell count
						System.out.print(arr[i][j] + " ");
					}
					System.out.println();
				}
 
	}

}

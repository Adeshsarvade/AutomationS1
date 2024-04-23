package Assignments;

public class AssignmentMedthods {

	public static void main (String[] args) {
		/* A number that can be only divisible 1 and number itself called as prime number
		if number is divisible any other type of numbers as called non prime number.
		 */
		 int n =7;
		 for (int i=2;i<n;i++) {
			 if (n%i==0) {
				 System.out.println("Not prime number");
				 return;
			 }
			 System.out.println("Prime number");
		break;
		 } 
		 
		
	
	}

}

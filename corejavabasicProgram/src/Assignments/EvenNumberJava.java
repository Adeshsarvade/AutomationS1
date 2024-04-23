package Assignments;
import java.util.Scanner;
public class EvenNumberJava {

	public static void main(String[] args) {
		// if num is divisible by 2, We Print num is even,Else we print num is odd.
  
		int n;
		System.out.println("Enter any number");
		Scanner f=new Scanner(System.in);
		n=f.nextInt();
		if (n%2==0)
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
	}

}

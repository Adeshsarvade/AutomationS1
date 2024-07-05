package Assignments;
import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args) {
		// --->121
int n,c,r,s=0;
System.out.println("Enter any Palindrome number");
Scanner f=new Scanner(System.in);
n=f.nextInt();
c=n;
while (n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}	
if(c==s)
System.out.println("This is Palindrome number");
 else
      System.out.println("This is not Palindrome number");
	}
}

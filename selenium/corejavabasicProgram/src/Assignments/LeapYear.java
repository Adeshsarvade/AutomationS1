package Assignments;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// leapyear 
		//A leapyear is exactly divisible by 4 except for century year
		// (year ending like 00),the century year is a leap year only.
		long year;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter any year");
		year=sc.nextLong();
		if ((year%4==0) && (year%100!=0) || (year%400==0))
System.out.println("this is leap year="+year);
else
	System.out.println("this is not leap year="+year);

	}

}

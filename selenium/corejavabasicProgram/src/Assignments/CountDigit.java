package Assignments;

public class CountDigit {

	public static void main(String[] args) {
		// CountDigit
		int num=1256345, count=0;
		while(num!=0) {
		num=num/10;//123634,12363,1236,123,12,1,0
		count++;
		System.out.println(count);
		
		}
	}

}

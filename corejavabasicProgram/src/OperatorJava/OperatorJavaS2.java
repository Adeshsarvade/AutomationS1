package OperatorJava;

public class OperatorJavaS2 {

	public static void main(String[] args) {
		// operator "&&" only both value true given you condition /"||"any one value
		// true given you condition
		int num1 = 25, num2 = 30;
		boolean result1 = (num1 <= num2);
		boolean result2 = (num1 >= num2);
		boolean result3 = (result1 || result2);
		System.out.println("result1 (num1<=num2) =" + result1);
		System.out.println("result2 (num1!=num2) =" + result2);
		System.out.println("result3 (res1 && res2) =" + result3);
		System.out.println("using && operator=" + ((num1 >= num2) && (num1 <= num2)));
		System.out.println("using || operator=" + ((num1 >= num2) || (num1 <= num2)));

	}

}

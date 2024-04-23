package OperatorJava;

public class OperatorJavaS3 {

	public static void main(String[] args) {
		// ++1 Pre increment 1++ Post-increment
		int num1 = 30, num2;
		num2 = num1;
		System.out.println("Number1=" + num1);
		System.out.println("Number2=" + num2);
		int num3 = ++num1;
		System.out.println("Number3=" + num3);
		System.out.println("Number1=" + num1);
		System.out.println("**********************");
		int a = 20, b;
		 b = ++a + a++;
		//in 21 + 21 B  42
		//fi 21 + 22 A  22
		System.out.println("A="+a);
		System.out.println("B=" + b);

	}

}

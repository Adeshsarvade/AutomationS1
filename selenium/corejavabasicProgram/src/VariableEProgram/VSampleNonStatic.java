package VariableEProgram;

public class VSampleNonStatic {
	int num1 = 5, num2 = 25;
	public static void main(String[] args) {
		// Non static global variable
		int result;
		VSampleNonStatic f1 = new VSampleNonStatic();
		result = f1.num1 * f1.num2;
		System.out.println("VSampleNonStatic=" + f1.num1);
		System.out.println("VSampleNonStatic=" + f1.num2);
		System.out.println("addition value ofnum1&num2="+result);
	}

}

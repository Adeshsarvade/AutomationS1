package constructors;

public class constructorsS2 {
	constructorsS2() {
		System.out.println("This is a zero-para constructor");
	}
	constructorsS2(char c) {
		System.out.println("This is a single-para constructor");
	}
	constructorsS2(int num1, int num2) {
		System.out.println("This is a int-int parameterized constructor");
	}	
	constructorsS2(double num1, int num2) {
		System.out.println("This is a double-int parameterized constructor");
	}
	constructorsS2(int num1, double num2) {
		System.out.println("This is a int-double parameterized constructor");
	}
	public static void main(String[] args) {
		constructorsS2 f1=new constructorsS2();
		constructorsS2 f2=new constructorsS2('M');
		constructorsS2 f3=new constructorsS2(30,25);
		constructorsS2 f4=new constructorsS2(30d,25);
		constructorsS2 f5=new constructorsS2(30,25.0);


	}

}

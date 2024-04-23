package VariableEProgram;

public class VSample5 {

	public static void main(String[] args) {
		// area of rectangle L*W
		int L = 10;
		int W = 25;
		int result = L * W;
		System.out.println("area of rectangle=" + result);
		// area of tritangle = area=(base*hight)/2
		int base, height, area;
		base = 20;
		height = 5;
		area = base * height / 2;
		System.out.println("area of tritangle=" + area);
// area of simple interest
		double principal = 9000;
		double rate = 10;
		int year = 5;
		double simpleinterest = (principal * rate * year) / 100;
		System.out.println("area of simple interest=" + simpleinterest);

	}

}

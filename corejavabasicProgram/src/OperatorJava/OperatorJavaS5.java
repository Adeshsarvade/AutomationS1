package OperatorJava;

public class OperatorJavaS5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = --a + --a + --a + a + ++a + a++;
//initial= 4   + 3   +   2  +    2   +3 + 3
//final=  4     3      2   3     2    3   4
		System.out.println(a);// 4
		System.out.println(b);// 17
		System.out.println("************");
		int c = 10, d;
		d = ++c + c-- + c++;
// initial =11 + 11 + 10 //32
// final=11 + 10 11//11
		System.out.println(c);
		System.out.println(d);
	}

}

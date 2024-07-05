package OperatorJava;
public class OpreratorJavaS4assinment {

	public static void main(String[] args) {
		// ++1 pre incerement, 1++ post incerement
		int a, b = 1;
		a = ++b + b++ + ++b;
		//initial= 2 + 2 + 4 =8 b
		// final=  2   3   4 =4 a
		System.out.println("b="+ b);// 8
		System.out.println("a=" + a);// 4
		
		System.out.println("*****************");
		int c = 0, d;
		d = c++ + ++c + ++c + c;
//initial=   0  + 2   + 3 + 3 =8
//final=     1    2    3+   3 =3
		System.out.println("c=" + c);// 3
		System.out.println("d=" + d);// 8

		System.out.println("****************");
		a = 1;
		b = a-- + --a + --a + a;
//initial=1 + -1 + -0 + -1 -1
//final=  0   -1 + -0 + -1-1
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		System.out.println("****************");
		a = 5;
		b = --a + --a + --a + a + ++a + a++;
//initial= 4 + 3 + 2  +2 + 3 + 3=17
//final= 4    3    2   2   3   4 =4 
		System.out.println(a);//4
		System.out.println(b);//17

	}

}

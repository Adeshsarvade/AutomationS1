package Stringjava;

public class demo1 {

	public static void main(String[] args) {
		String f1 = "Pune";
		System.out.println("String object" + f1);
		String f2="mumbai";
		System.out.println("String object" +f2);
		String f3="Pune";
		System.out.println("String object" + f3);
		System.out.println("String object f1& f2 with equal" + f1.equals(f2));
		System.out.println("String object f1& f2 with equal" + f1.equals(f3));
		System.out.println("String object f1& f2 with ==" + (f1==f2));
		System.out.println("String object f1& f2 with ==" + (f1==f3));


	}

}

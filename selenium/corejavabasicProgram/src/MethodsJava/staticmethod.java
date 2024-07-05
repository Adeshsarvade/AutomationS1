package MethodsJava;

public class staticmethod {

		double x=10,h=20,y=30;  //NSG// method type: NSM
 boolean checkvaule(int a, int b) {
 boolean res= (a==b);
return res;
	}
	public static void main(String[] args) {
System.out.println("name of method");
staticmethod m1= new staticmethod();
System.out.println("num="+m1.h);
System.out.println("num="+m1.x);
System.out.println("num="+m1.y);
boolean res = m1.checkvaule(20,20);
System.out.println("both value ara same="+res);
		
	}
}


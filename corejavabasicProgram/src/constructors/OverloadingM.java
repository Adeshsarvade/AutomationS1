package constructors;

public class OverloadingM {
	void display() {
		System.out.println("disp without param");
	}
	void display(int a, double b) {
		System.out.println("disp with int,double");

	}
	void display(double a,String b) {
		System.out.println("disp with double,String");

	}

	public static void main(String[] args) {
		OverloadingM f1=new OverloadingM();
			f1.display();
		f1.display(10,2.2);
		f1.display(12.5,null);
	}
	

}

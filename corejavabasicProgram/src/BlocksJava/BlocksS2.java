package BlocksJava;

public class BlocksS2 {
	
	
	int age;
	double salary;
	void print() {
		System.out.println("age="+age);
		System.out.println("salary="+salary);
	}

	public static void main(String[] args) {
		System.out.println("main() Starts..");
		BlocksS2 f1= new BlocksS2();
		f1.print();
		System.out.println("program END");
	}
			//non static block SIB
	{
		print();
		age=25;
		salary=15000.20;
	}

}

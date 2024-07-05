package constructors;

public class constructorsS1 {
	
	int age= 36;
	void display() {
		System.out.println("Hi am here");
	}
	public static void main(String[] args) {
		//A member function used to initially an object while creating.
		constructorsS1 f1=new constructorsS1();
		System.out.println(f1.age);
		f1.display();
	}

}
/*
 1.its similar to method
 2.but its name should be same a c name
 3.but it will not any return type and its won't return any value to JVM.
 4.we can't call/execute constructor base our requirement,
   it will be called / executed whenever class object/instance is created.
   */

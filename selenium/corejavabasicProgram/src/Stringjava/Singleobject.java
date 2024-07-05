package Stringjava;

public class Singleobject {
	 /**
	 * 1.constructor should be private 2.create static ref variable of the class
	 * 3.create static method which return current class object
	 */

	private Singleobject() {
		System.out.println("here is singleobjct");
	}
	private static Singleobject obj = new Singleobject();

	public static Singleobject getInstance() {
		return obj;
	}

	int age = 25;
    void display() {
		System.out.println("here is object" + age);
	}
		
public static void main(String[] args) {
			System.out.println("program Start");
			Singleobject f1 = Singleobject.getInstance();
			f1.display();
			f1.age = 30;
			f1.display();
			Singleobject f2 = Singleobject.getInstance();
			f1.display();
			System.out.println("program End");

		}

	}



package OOPsConceptJava;
 abstract class bike {
	 abstract void run();
 }
 
 class honda extends bike{
	 void run() {
		 System.out.println("running sefety");
	}
	 
 }
public class abstraction {

	public static void main(String[] args) {
		// Abstraction in OOPS is used to hide unnecessary information and display only necessary information to the users interacting.
bike f1=new honda();
f1.run();
	}

}

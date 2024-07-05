package Encapsulationjava;

class encapS1 {
	private int pincode=1256;
	private double salary=50000;
	private char grade='A';
	//using getter concept, we can use private to the people to use member from outside the class 
	/*
	 * Getter method: create a public method with-
	 * no argument/parameter 
	 * return type should be same as required private variable datatype
	 */
	public int getpincode() {
		return pincode;
	}
	public double getsalary() {
		return salary;
	}
	public char getgrade() {
		return grade;
	}

	public static void main(String[] args) {
encapS1 f1=new encapS1();
System.out.println(f1.pincode);
System.out.println(f1.salary);
System.out.println(f1.grade);
	}

}

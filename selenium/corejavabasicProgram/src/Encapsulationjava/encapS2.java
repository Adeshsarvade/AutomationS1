package Encapsulationjava;

class encapS2 {
	private int value=256;
	private double phone=12456356;
	private char name='B';
	/*
	 * setter concept: This will help you to modifier parivate data member from outside the class
	 * setter method:
	 * acessmodifier:Public
	 * return type: void 
	 * parameter should be same as required variable datatype.
	 */
	public void setvalue(int value) {
		this.value=value;
	}
	public void setphone(double phone) {
		this.phone=phone;
	}
	public void setname(char name) {
		this.name=name;
	}

	public static void main(String[] args) {
encapS2 f1=new encapS2();
System.out.println(f1.value);
System.out.println(f1.phone);
System.out.println(f1.name);  
{
	
}
	}

}

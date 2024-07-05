package OOPsConceptJava;

class OveridingJava {
void show() {
	System.out.println("Parent show()");
}
}
class childs extends OveridingJava {
	//This method overrides show() of parent
	void show() {
		super.show();
		System.out.println("childs show()");
	}
}
class grandchilds extends childs{
	//This method overrides show() of parent
void show() {
	super.show();
	System.out.println("grandchilds show()");
}
	public static void main(String[] args) {
		OveridingJava f1= new grandchilds();
		f1.show();
	}

}

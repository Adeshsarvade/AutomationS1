package OOPsConceptJava;
interface bank {
	float rateofinterest(); // by defualt --->public abstracat
}
class HDFC1 implements bank {
	public float rateofinterest() {
		return 9.15f;
	}
}
class PNB1 implements bank {
	public float rateofinterest() {
		return 12.5f;
	}
}
class InterfaceJava {
	public static void main(String[] args) {
	HDFC1 f1=new HDFC1();
	System.out.println("ROT"+f1.rateofinterest());
	PNB1 P1= new PNB1();
	System.out.println("ROT"+P1.rateofinterest());
	bank n1=new HDFC1();
	System.out.println("ROT"+n1.rateofinterest());

	}

}

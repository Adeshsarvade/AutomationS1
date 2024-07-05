package Typecasting;
class Pune {
	void kharadi() {
		System.out.println("you are in kharadi ");
	}
}

class mumbai extends Pune {
	void kurla() {
		System.out.println("You are in Kurla");
	}
}
public class UpcastingJava extends mumbai {
 void mycity() {
	 System.out.println("You in city");
 }
	public static void main(String[] args) {
UpcastingJava f1= new UpcastingJava();
f1.kharadi();
f1.kurla();
f1.mycity();

	}

}

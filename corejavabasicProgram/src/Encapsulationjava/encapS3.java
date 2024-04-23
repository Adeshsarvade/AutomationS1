package Encapsulationjava;

public class encapS3 {
private int age =25;
private double year= 1999;
private char name='A';

public void setage(int age) {
	this.age=age;

}
public void setyear (double year) {
	this.year=year;
}
public void getname(char name) {
	this.name=name;
}
	public static void main(String[] args) {
encapS3 f1=new encapS3();
System.out.println(f1.age);
System.out.println(f1.year);
System.out.println(f1.name);
	}

}

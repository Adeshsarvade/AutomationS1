package Stringjava;
/**
 * immutable class: its value can't be change, if you change now object will be created
 * 1.class and java variable should be declared as final.
 * 2.Constructor should be perameterized, to initialize final data variable.
 * 3.use getter method to get final variable value.
 */

final class testimmutableclass {
	final String name;
	final int salary;
testimmutableclass(String name,int salary){
	this.name =name;
	this.salary=salary;
}
public String getName() {
	return name;
}
public int getSalary() {
	return salary;
}

}

public class ImmutableClass {

	public static void main(String[] args) {
testimmutableclass f1=new testimmutableclass("panvel",15000);
System.out.println(f1.getName());
System.out.println(f1.getSalary());
testimmutableclass f2=new testimmutableclass("pune",45000);
System.out.println(f2.name);
System.out.println(f2.salary);

	}

}

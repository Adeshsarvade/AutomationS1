package VariableEProgram;

class VSsampleStatic6 {
	static int num1, num2,num3;
	public static void main(String[] args) {
		// Below global variables are declare but not initialized hence you will get
		// default value
		System.out.println("program start");
		System.out.println("SGV num1=" + num1);
		System.out.println("SGv num2=" + num2);
//initialize SGV
		VSsampleStatic6.num1 = 10;
		VSsampleStatic6.num2 = 25;
		VSsampleStatic6.num3 = 30;
		System.out.println("updated SGV num1=" +VSsampleStatic6.num1);
		System.out.println("updated SGV num2=" +VSsampleStatic6.num2);
		System.out.println("upated SGV num2="+VSsampleStatic6.num3);
		System.out.println("program end");
	}

}

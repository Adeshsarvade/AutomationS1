package Patterns;

public class HalfPyramid {

	public static void main(String[] args) {
int n=5;
//outer loops 
for(int i=1;i<=n;i++) {
	//inner loops
	for (int j=1;j<=i;j++) {
		System.out.print("*");
	}
	System.out.println();
}
	}

}

package Stringjava;

public class Demo2 {

	public static void main(String[] args) {
		// Replace,replaceall,replacefirst,trim,split,toCharArray,subString
		String s1="Panvel";
		System.out.println("Original string s1:"+s1);
		System.out.println("After replaceign 'P' with 'X' in string "+s1.replace('P','X'));
System.out.println("****************************************");
String s2="   Pune      ";
System.out.println("Original string s2"+s2);
System.out.println("char in s2"+s2.length());
System.out.println("After trim s2"+s2.trim());
System.out.println("After trim s2 char count"+s2.trim().length());
System.out.println("***********************************************");
String s3="i am working in IT enviroment in pune";
System.out.println("Orgrinal string" +s3);
String[] words=s3.split(" ");
System.out.println("After split s3 words are: ");
for(String str:words) {
	System.out.println(str);
	
}
	}

}

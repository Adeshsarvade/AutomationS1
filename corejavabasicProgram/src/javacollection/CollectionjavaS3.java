package javacollection;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionjavaS3 {
	public static void main(String[] args) {
		// Generic:with the help of generic we can force collection to store similar
		// type of data
		ArrayList<Integer> P = new ArrayList<Integer>();
		P.add(12);
		P.add(25);
		P.add(30);
		P.add(45);
		System.out.println("Size" + P.size());
		System.out.println("Eelement of collection" + P);
		Collections.sort(P);
		System.out.println("Sorting of collection" + P);
		Collections.reverse(P);
		System.out.println("reversing sorted elements of collection" +P);
	}

}

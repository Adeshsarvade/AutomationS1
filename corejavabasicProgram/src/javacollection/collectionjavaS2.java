package javacollection;

import java.util.ArrayList;

public class collectionjavaS2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list.isEmpty());
		list.add("Mumbai");// string obj-->obj class obj(auto up casting)
		list.add("pune");// int to integer obj (auto)-->objet class(auto up casting)
		list.add(true);
		list.add(null);
		System.out.println("Element count in ArryList" + list.size());
		System.out.println("Elements of arraylist are" + list);
		System.out.println("**********************");
		ArrayList list2 = new ArrayList();
		list2.add("B");// Autoboxing-->auto up casting
		list2.add("E");// Autoboxing-->auto up casting
		list2.add("h");// Autoboxing-->auto up casting
		list2.addAll(list);
		System.out.println("adding list into list2" + list2);
		list2.removeAll(list);
		System.out.println("removing list into list2" +list2);

	}

}

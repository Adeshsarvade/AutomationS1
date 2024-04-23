package javacollection;
import java.util.ArrayList;
public class collectionS1 {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		System.out.println(list.isEmpty());
		list.add ("Mumbai");
		list.add ("pune");
		list.add (true);
		list.add (null);
		System.out.println("Element count in ArryList" +list.size());
		System.out.println("Elements of arraylist are" +list);
		System.out.println("Element at index 3"  +list.get(2));
		list.add(3,"panvel");
		System.out.println("upated element count in arrylist" +list.size());
		System.out.println("upated element count in arrylist" +list);
		System.out.println("***********************************");
        list.set(4,"Goa");
        System.out.println("upated Element coutn in Arrylist" +list.size());
        System.out.println("upated Element coutn in Arrylist" +list);
        
	}
}


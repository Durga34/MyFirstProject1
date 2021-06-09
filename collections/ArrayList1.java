package collections;
import java.util.*;
public class ArrayList1 {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<String>();
		list.add("mango");
		list.add("apple");
		list.add("orange");
		list.add("banana");
		list.add("grapes");
		list.add("pine apple");
		list.add("pomegranate");
		list.add("pear");
		list.add("guava");
		list.add("plum");
		list.add(1,"strawberry");
		list.remove(2);
		list.set(3, "lemon");
		list.indexOf("pear");
		System.out.println(list.size());
		System.out.println(list.contains("guava"));
		list.clear();
		Iterator i=list.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}

package collections;

import java.util.HashMap;

public class CreateHashMap {

	public static void main(String[] args) {
		HashMap<Integer,String>map1=new HashMap<Integer,String>();
		HashMap<Integer,String>map2=new HashMap<Integer,String>();
		map1.put(1, "Aarthi");
		map1.put(2, "Banu");
		map1.put(3, "Durga");
		map1.put(4, "Devika");
		map1.put(5, "Deepa");
		map1.put(6, "Indhu");
		map1.put(7, "Janu");
		map1.put(8, "kani" );
		map1.put(9, "laxmi");
		map1.put(10, "madhu");
		System.out.println(map1.containsKey(4));
		System.out.println(map1.containsValue("laxmi"));
		System.out.println(map1.isEmpty());
		System.out.println(map1.keySet());
		System.out.println(map1.remove(2, "Banu"));
		String val=(String)map1.get(3);
		System.out.println("value:"+val);
		System.out.println(map1.size());
		map2=(HashMap)map1.clone();
		System.out.println("clone:"+map2);

	}

}

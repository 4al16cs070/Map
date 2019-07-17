package pac;

import java.util.*;

public class List {
	public static void main(String[] args) {
		LinkedHashMap l=new LinkedHashMap();
		//Hashtable l=new Hashtable();
		//TreeMap l=new TreeMap();
		l.put(0, "a");
		l.put(1, "k");
		l.put(6, "l");
		System.out.println("element is "+l.get(1));
		System.out.println("doest it have k "+l.containsValue("k"));
		System.out.println("does it have key 3 "+l.containsKey(3));
		System.out.println("removed "+l.remove(1));
		l.put(7, "l");
		l.put(11, null);
		l.put(5, 6);
		System.out.println("seted "+l.keySet());
		System.out.println(l);
		
		
		
		}
}

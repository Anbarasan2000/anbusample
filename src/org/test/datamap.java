package org.test;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class datamap {
	public static void main(String[] args) {
		Map<Integer, String> m = new TreeMap<>();
		m.put(20, "anbu");
		m.put(10, "arul");
		m.put(30, "mani");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get(30));
		System.out.println(m.containsKey(20));
		System.out.println(m.containsValue("mani"));
		
		System.out.println("\nkey  iteraiton");
		Set<Integer> key = m.keySet();
		for (Integer integer : key) {
			System.out.println(integer);

		}
		
		System.out.println("\nvalue iteraiton");
		Collection<String> values = m.values();
		for (String string : values) {
			System.out.println(string);
		}
		System.out.println("\nkey value iteraiton");
		Set<Entry<Integer,String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
			
		}

		for (Entry<Integer, String> entry : entrySet) {
		System.out.println("\nkey:"+entry.getKey());
		System.out.println("value:"+entry.getValue());
		
		
		
		
		
		
	}
}
}
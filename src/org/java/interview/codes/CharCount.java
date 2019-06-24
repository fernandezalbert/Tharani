package org.java.interview.codes;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String name="fernandez";
		char[] ch = name.toCharArray();
		Map<Character, Integer> emp=new LinkedHashMap<>();
		for (char c : ch) {
			if(emp.containsKey(c)) {
				Integer count=emp.get(c);
				emp.put(c, count+1);
			}else {
				emp.put(c, 1);
			}
		}
		System.out.println(emp);
	}

}

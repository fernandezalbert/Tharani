package org.java.interview.codes;

import java.util.LinkedHashMap;
import java.util.Map;

public class WordOccurance {

	public static void main(String[] args) {
		String name="JavaSeleniumJavaSelenium";
		String[] arrst= {name.substring(0, 4),name.substring(4, 12),name.substring(12, 16),name.substring(16, 24)};
		Map<String, Integer> emp=new LinkedHashMap<>();
		for (String c : arrst) {
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

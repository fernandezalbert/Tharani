package org.java.interview.codes;

import java.util.LinkedList;
import java.util.List;

public class ListIndex {

	public static void main(String[] args) {
		int c=10;
List li=new LinkedList<>();
li.add(10);
li.add(20);
li.add(30);
li.add(90);
li.add(10);
li.add(10);
li.add(40);
li.add(50);
li.add(10);
for (int i = 0; i < li.size(); i++) {
	if (li.get(i).equals(10)) {
		System.out.println(li.get(i));
	}
	
}

	}

}

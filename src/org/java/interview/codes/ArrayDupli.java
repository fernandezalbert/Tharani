package org.java.interview.codes;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDupli {

	public static void main(String[] args) {
		int a[]= {10,10,20,50,60,80,60,50};
		Set val=new LinkedHashSet<>();
		for (int i = 0; i < a.length; i++) {
			val.add(a[i]);
			}
		System.out.println(val);
		}
	}



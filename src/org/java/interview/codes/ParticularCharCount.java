package org.java.interview.codes;

public class ParticularCharCount {

	public static void main(String[] args) {
		String name = "fernandez";
		char c='d';
		int count=0;
		System.out.println("the given char occurannce in the string is:"+c);
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)==c) {
				count++;
			}
		}
		System.out.println(count);
	}
}

package org.java.interview.codes;

public class ParticularWord {

	public static void main(String[] args) {
		String name = "JavaSeleniumJavaSelenium";
		String[] arrst= {name.substring(0, 4),name.substring(4, 12),name.substring(12, 16),name.substring(16, 24)};
		String c="Java";
		for (int i = 0; i < arrst.length; i++) {
			if (arrst.equals(c)) {
				System.out.println(arrst);
			}
		}

	}

}

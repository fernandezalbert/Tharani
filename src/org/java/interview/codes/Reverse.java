package org.java.interview.codes;

import java.awt.font.FontRenderContext;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		String name="Fernandez",res="";
		for (int i = name.length()-1; i >=0; i--) {
			res=res+name.charAt(i);
		}
System.out.println(res);
//check palindrome
String palindCheck ="madam",revs="";
for (int i = palindCheck.length()-1; i >=0;i--) {
	revs=revs+palindCheck.charAt(i);
}
if(palindCheck.equals(revs)) {
	System.out.println("palindrome");
}else {
	System.out.println("not palindrome");
}
	}
	
		
	}
	



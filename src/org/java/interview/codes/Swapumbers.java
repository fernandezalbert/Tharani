package org.java.interview.codes;

public class Swapumbers {

	public static void main(String[] args) {
		int a=10,b=20,temp=0;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println(a);
		System.out.println(b);

		//without third variable
		int i=50,j=20;
		i=i+j;
		j=i-j;
		i=i-j;
		System.out.println(i);
		System.out.println(j);
	}

}

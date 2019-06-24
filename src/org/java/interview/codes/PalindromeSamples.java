package org.java.interview.codes;

public class PalindromeSamples {

	public static void main(String[] args) {
		//reverse
		int a=321,i=0,j=0;
		while(a>0) {
			i=a%10;
			j=(j*10)+i;
			a=a/10;
		}
		System.out.println(j);
//palindrome or not
		int b=121,x=0,y=0,temp=0;
		temp=b;
		while(b>0) {
			x=b%10;
			y=(y*10)+x;
			b=b/10;
		}
		if(temp==y) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
		
	}

}

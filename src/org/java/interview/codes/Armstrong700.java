package org.java.interview.codes;

public class Armstrong700 {

	public static void main(String[] args) {
		for(int k=1;k<=700;k++) {
		int a=k,i=0,j=0,temp=0;
		temp=a;
		while(a>0) {
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(temp==j) {
			System.out.println(j);
		}
	
		}
	}

}

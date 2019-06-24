package org.java.interview.codes;

public class ArmsrongNumbers {
public static void main(String[] args) {
	int a=153,i=0,j=0,temp=0;
	temp=a;
	while(a>0) {
		i=a%10;
		j=j+(i*i*i);
		a=a/10;
	}
	if(temp==j) {
		System.out.println("Armstrong Number");
	}else {
		System.out.println("Not an Armstrong number");
	}
}
}

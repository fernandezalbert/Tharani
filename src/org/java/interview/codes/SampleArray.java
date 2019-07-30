package org.java.interview.codes;

public class SampleArray {

	public static void main(String[] args) {
int a[]= {1,2,3,4,5,6,7,8,9,10};
float avg;
int sum=0;
for (int i = 0; i < a.length; i++) {
	sum=sum+a[i];
}
System.out.println("Sum of Array is"+sum);
avg=(float)sum/a.length;
System.out.println(avg);
	}

}

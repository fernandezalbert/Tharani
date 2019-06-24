package org.java.interview.codes;

public class OddorEven {

	public static void main(String[] args) {
	int a=10;
	if(a%2==0) {
		System.out.println("Even Number");
	}else {
		System.out.println("Odd number");
	}
// even 1 to 10
	for(int i=1;i<=10;i++) {
		if(i%2==0) {
			System.out.println(i);
		}
	}
	// odd 1 to 600
	System.out.println("odd 1 to 600");
		for(int i=1;i<=600;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		//count of even numbers 1 to 10
		System.out.println("sum of even numbers 1 to 10");
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				sum=sum+i;
			}
		}
		System.out.println("sum of even numbers 1 to 10 is\n"+sum);
		
		//even number count 1 to 10
		System.out.println("count of even numbers 1 to 10");
		int count=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0) {
				count++;
			}
		}
		System.out.println("count of even numbers 1 to 10 is\n"+count);
		//count of odd number 1 to 500
		System.out.println("count of odd numbers 1 to 10");
		int countOdd=0;
		for(int i=1;i<=500;i++) {
			if(i%2!=0) {
				countOdd++;
			}
		}
		System.out.println("count of odd numbers 1 to 10 is\n"+countOdd);
		//count of odd numbers 1 to 10
				System.out.println("sum of odd numbers 1 to 500");
				int sumOdd=0;
				for(int i=1;i<=500;i++) {
					if(i%2!=0) {
						sumOdd=sumOdd+i;
					}
				}
				System.out.println("sum of odd numbers 1 to 500 is\n"+sumOdd);
		
	}

}

package com.tns.conditions;

import java.util.*;

public class palindrome {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		int org=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10+n%10;
			n=n/10;
		}
		if(org==n) {
			System.out.println(org+" is a palindrome");
		}else {
			System.out.println(org+" is not a plaindrome");
		}
		
	}

}

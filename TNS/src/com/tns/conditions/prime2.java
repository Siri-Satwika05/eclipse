package com.tns.conditions;

import java.util.*;

public class prime2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=sc.nextInt();
		boolean prime=true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				prime=false;
			}
			
		}
		System.out.println(prime);
		
	}

}

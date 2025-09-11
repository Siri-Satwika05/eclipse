package com.tns.second;

public class vaRiable {
	int var=10;
	public static void main(String args[]) {
		int temp=30;
		System.out.println("Local variable: "+temp);
		vaRiable obj=new vaRiable();
		System.out.println("Instance variable: "+obj.var);
	}

}

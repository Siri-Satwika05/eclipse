package com.tns.second;

public class dataTypes {
    public static void main(String[] args) {
        
        // Primitive Data Types
        byte b = 100;                 
        short s = 32000;              
        int i = 100000;               
        long l = 10000000000L;        
        float f = 3.14f;         
        double d = 99.999;            
        char c = 'A';                 
        boolean flag = true;        

        // Printing primitive types
        System.out.println("=== Primitive Data Types ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        // Non-Primitive Data Types
        String str = "Hello, Java!";
        int[] arr = {10, 20, 30};     
        Integer objInt = 500;          

        // Printing non-primitive types
        System.out.println("\n=== Non-Primitive Data Types ===");
        System.out.println("String: " + str);
        System.out.println("Array element [0]: " + arr[0]);
        System.out.println("Wrapper class Integer: " + objInt);
        
    }
}

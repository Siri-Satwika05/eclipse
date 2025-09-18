package constructors;

//1. Final variable
class Constants {
 final double PI = 3.14159; // constant value

 void showPI() {
     System.out.println("Value of PI: " + PI);

     // PI = 3.14;
 }
}

//2. Final method
class Parent {
 final void display() {
     System.out.println("This is a final method in Parent class");
 }
}

class Child extends Parent {
 // Cannot override final method
 // void display() { 
 //     System.out.println("Trying to override..."); 
 // }
}

//3. Final class
final class Vehicle {
 void run() {
     System.out.println("Vehicle is running");
 }
}

//Cannot extend final class
//class Car extends Vehicle {}

public class FinalKey {
 public static void main(String[] args) {
     // Final variable
     Constants c = new Constants();
     c.showPI();

     // Final method
     Child ch= new Child();
     ch.display();

     // Final class
     Vehicle v = new Vehicle();
     v.run();
 }
}

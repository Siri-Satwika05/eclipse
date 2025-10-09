package lambda;

//Functional interface
@FunctionalInterface
interface Calculator {
int calculate(int a, int b);
}

public class WithPara {

public static void main(String[] args) {
   // Lambda with parameters
   Calculator add = (a, b) -> a + b;
   Calculator multiply = (a, b) -> a * b;

   System.out.println("Addition: " + add.calculate(10, 5));
   System.out.println("Multiplication: " + multiply.calculate(10, 5));
}
}

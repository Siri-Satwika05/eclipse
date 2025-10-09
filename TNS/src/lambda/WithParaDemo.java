package lambda;

//Functional interface
@FunctionalInterface
interface StringProcessor {
String process(String input);
}

public class WithParaDemo {

public static void main(String[] args) {
   StringProcessor toUpperCase = str -> str.toUpperCase();
   StringProcessor greetUser = str -> "Hello, " + str + "!";

   System.out.println(toUpperCase.process("lambda expressions"));
   System.out.println(greetUser.process("Manisha"));
}
}
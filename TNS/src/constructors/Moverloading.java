package constructors;



class Calculator{
	int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
    double add(double a, double b) {
        return a + b;
    }
    String add(String a, int b) {
        return a + " " + b;
    }

    String add(int a, String b) {
        return a + " " + b;
    }
}
public class Moverloading {
	 public static void main(String[] args) {
	        Calculator calc = new Calculator();
	        System.out.println("add(10, 20): " + calc.add(10, 20));
	        System.out.println("add(10, 20, 30): " + calc.add(10, 20, 30));
	        System.out.println("add(5.5, 4.5): " + calc.add(5.5, 4.5));
	        System.out.println("add(\"Number\", 100): " + calc.add("Number", 100));
	        System.out.println("add(100, \"Number\"): " + calc.add(100, "Number"));
	        	    }

}

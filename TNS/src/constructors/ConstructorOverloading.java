package constructors;

class Student {

    String name;
    int age;
    String course;

    // 1. Constructor with no parameters (default)
    Student() {
        System.out.println("Default constructor called");
        name = "Unknown";
        age = 0;
        course = "Not Assigned";
    }

    // 2. Constructor with one parameter
    Student(String n) {
        System.out.println("Constructor with 1 parameter called");
        name = n;
        age = 0;
        course = "Not Assigned";
    }

    // 3. Constructor with two parameters
    Student(String n, int a) {
        System.out.println("Constructor with 2 parameters called");
        name = n;
        age = a;
        course = "Not Assigned";
    }

    // 4. Constructor with three parameters
    Student(String n, int a, String c) {
        System.out.println("Constructor with 3 parameters called");
        name = n;
        age = a;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Course: " + course);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        // Calls different constructors
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("Siri");
        s2.display();

        Student s3 = new Student("Prasanna", 21);
        s3.display();

        Student s4 = new Student("Satwika", 22, "Java Programming");
        s4.display();
    }
}

package constructors;

class College {

    // Static variable
    static String collegeName = "ABC College";

    String name;
    int age;

    // Constructor
    College(String n, int a) {
        name = n;
        age = a;
    }

    // Static method
    static void changeCollege(String newCollege) {
        collegeName = newCollege;
        System.out.println("College changed to: " + collegeName);
    }

    // Method to display student details
    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", College: " + collegeName);
    }

    // Static block
    static {
        System.out.println("Static block executed – Class is loaded into memory");
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        
        // Static block runs first when class is loaded
        College s1 = new College("Siri", 21);
        College s2 = new College("Hasine", 22);

        // Display details (college shared by all)
        s1.display();
        s2.display();

        // Call static method without object
        College.changeCollege("XYZ University");

        // Display details after college name change
        s1.display();
        s2.display();
    }
}

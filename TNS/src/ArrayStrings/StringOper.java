package ArrayStrings;

public class StringOper {
	public static void main(String[] args) {
        // -------------------- String --------------------
        String s1 = "Hello";
        String s2 = "World";
        
        // Concatenation using '+' operator
        String result1 = s1 + " " + s2;
        System.out.println("Concatenation using + : " + result1);

        // concat() method
        String result2 = s1.concat(" ").concat(s2);
        System.out.println("Concatenation using concat(): " + result2);

        // Comparison
        System.out.println("s1 equals s2? " + s1.equals(s2));  // content check
        System.out.println("s1 == s2? " + (s1 == s2));         // reference check
        System.out.println("CompareTo result: " + s1.compareTo(s2)); // lexicographical compare

        // Length and charAt
        System.out.println("Length of s1: " + s1.length());
        System.out.println("Character at index 1 of s1: " + s1.charAt(1));

        // Substring
        System.out.println("Substring of s1 from index 1: " + s1.substring(1));

        // Uppercase and Lowercase
        System.out.println("Uppercase s1: " + s1.toUpperCase());
        System.out.println("Lowercase s2: " + s2.toLowerCase());

        // -------------------- StringBuffer --------------------
        StringBuffer sb = new StringBuffer("Java");
        System.out.println("\n--- StringBuffer Operations ---");
        sb.append(" Programming");   // append
        System.out.println("After append: " + sb);

        sb.insert(4, " Language");   // insert
        System.out.println("After insert: " + sb);

        sb.replace(0, 4, "C++");     // replace
        System.out.println("After replace: " + sb);

        sb.delete(0, 3);             // delete
        System.out.println("After delete: " + sb);

        sb.reverse();                // reverse
        System.out.println("After reverse: " + sb);

        // -------------------- StringBuilder --------------------
        StringBuilder sbuilder = new StringBuilder("Hello");
        System.out.println("\n--- StringBuilder Operations ---");
        sbuilder.append(" Java");     // append
        System.out.println("After append: " + sbuilder);

        sbuilder.insert(5, " World"); // insert
        System.out.println("After insert: " + sbuilder);

        sbuilder.replace(0, 5, "Hi"); // replace
        System.out.println("After replace: " + sbuilder);

        sbuilder.delete(0, 2);        // delete
        System.out.println("After delete: " + sbuilder);

        sbuilder.reverse();           // reverse
        System.out.println("After reverse: " + sbuilder);
	}

}

package Lab2Exercise3;

public class OverloadAddition {

    // Method for adding two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method for adding three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method for adding two doubles
    public static double add(double a, double b) {
        return a + b;
    }

    // Method for adding three doubles
    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    // Method for concatenating two strings
    public static String add(String a, String b) {
        return a + b;
    }

    // Method for concatenating three strings
    public static String add(String a, String b, String c) {
        return a + b + c;
    }
    //main method
    public static void main(String[] args) {
        // Testing integer addition
        System.out.println("Integer addition (2 parameters): " + add(5, 7));
        System.out.println("Integer addition (3 parameters): " + add(5, 7, 3));

        // Testing double addition
        System.out.println("Double addition (2 parameters): " + add(3.14, 6.77));
        System.out.println("Double addition (3 parameters): " + add(1.13, 2.289, 3.344));

        // Testing string concatenation
        System.out.println("String concatenation (2 parameters): " + add("Hello, ", "world!"));
        System.out.println("String concatenation (3 parameters): " + add("My Name is Ka Chuen David LEE, ", "Learning Java seems like ", "learning C#"));
    }
}


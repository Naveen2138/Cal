 public class Calculator {
    public static int add(int a, int b) { return a + b; }
    public static int subtract(int a, int b) { return a - b; }
    public static int multiply(int a, int b) { return a * b; }
    public static double divide(int a, int b) {
        return (b == 0) ? 0 : (double) a / b;
    }
    public static void performOperations() {
        int a = 12, b = 6;
        System.out.println("Add: " + add(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        System.out.println("Divide: " + divide(a, b));
    }
    public static void main(String[] args) {
        performOperations();
    }
 }
public class type_conversion {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add two doubles - type conversion 01: int ==> double
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to add two floats - type conversion 02: float ==> double
    public double add(float a, float b) {
        return (double) a + b; // Casting float to double for addition
    }
    
    // Method to add two longs - type conversion 03: long ==> double
    public double add(long a, long b) {
        return (double) a + b; // Casting long to double for addition
    }
    
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Method to multiply three doubles - type conversion 04: int ==> double
    public double multiply(double a, double b, double c) {
        return a * b * c;
    }
    
    // Method to multiply two floats - type conversion 05: float ==> double
    public double multiply(float a, float b) {
        return (double) a * b; // Casting float to double for multiplication
    }
    
    // Overloaded method to multiply an integer and a double
    public double multiply(int a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Main calc = new Main();
        
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of 2.5 and 3: " + calc.add(2.5, 3)); // Calls add(double, double)
        System.out.println("Sum of 2.5f and 3.5f: " + calc.add(2.5f, 3.5f)); // Calls add(float, float)
        System.out.println("Sum of 10000000000L and 20000000000L: " + calc.add(10000000000L, 20000000000L)); // Calls add(long, long)
        
        System.out.println("Product of 4 and 6: " + calc.multiply(4, 6)); // Calls multiply(int, int)
        System.out.println("Product of 2.5, 3.5, and 4.5: " + calc.multiply(2.5, 3.5, 4.5)); // Calls multiply(double, double, double)
        System.out.println("Product of 2.5f and 3.5f: " + calc.multiply(2.5f, 3.5f)); // Calls multiply(float, float)
        System.out.println("Product of 3 and 2.5: " + calc.multiply(3, 2.5)); // Calls multiply(int, double)
    }
}

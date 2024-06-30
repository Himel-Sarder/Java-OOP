public class Method_overloading  {
    
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }
    
    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }
    
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // Overloaded method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    // Overloaded method to multiply two doubles
    public double multiply(double a, double b) {
        return a * b;
    }
    
    // Overloaded method to multiply an integer and a double
    public double multiply(int a, double b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        Method_overloading calc = new Method_overloading();
        
        // Examples of method overloading
        System.out.println("Sum of 5 and 10: " + calc.add(5, 10)); // Calls add(int, int)
        System.out.println("Sum of 5, 10, and 15: " + calc.add(5, 10, 15)); // Calls add(int, int, int)
        System.out.println("Sum of 2.5 and 3.5: " + calc.add(2.5, 3.5)); // Calls add(double, double)
        System.out.println("Concatenated string: " + calc.add("Hello ", "World")); // Calls add(String, String)
        
        System.out.println("Product of 4 and 6: " + calc.multiply(4, 6)); // Calls multiply(int, int)
        System.out.println("Product of 2, 3, and 4: " + calc.multiply(2, 3, 4)); // Calls multiply(int, int, int)
        System.out.println("Product of 2.5 and 3.5: " + calc.multiply(2.5, 3.5)); // Calls multiply(double, double)
        System.out.println("Product of 3 and 2.5: " + calc.multiply(3, 2.5)); // Calls multiply(int, double)
    }
}

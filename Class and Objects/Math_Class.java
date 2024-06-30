public class Math_Class {
    public static void main(String[] args) {
        int a = -10;
        int b = 5;
        
        // Absolute value
        int absA = Math.abs(a); // absA = 10
        
        // Maximum and minimum
        int maxVal = Math.max(a, b); // maxVal = 5
        int minVal = Math.min(a, b); // minVal = -10
        
        // Power and square root
        double power = Math.pow(b, 2); // power = 25.0
        double sqrtB = Math.sqrt(b);   // sqrtB = 2.236...
        
        // Rounding
        double roundA = Math.round(Math.PI); // roundA = 3.0
        
        // Trigonometric functions (in radians)
        double angle = Math.PI / 4; // 45 degrees in radians
        double sineValue = Math.sin(angle); // sineValue = 0.707...
        double cosineValue = Math.cos(angle); // cosineValue = 0.707...
        
        // Random number between 0.0 and 1.0
        double randomValue = Math.random(); // randomValue = (some value between 0.0 and 1.0)
        
        System.out.println("Absolute value of a: " + absA);
        System.out.println("Maximum value between a and b: " + maxVal);
        System.out.println("Square root of b: " + sqrtB);
        System.out.println("Sine of " + angle + " radians: " + sineValue);
        System.out.println("Random value between 0.0 and 1.0: " + randomValue);
    }
}

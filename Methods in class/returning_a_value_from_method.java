public class Example {
    
    // Method that returns an integer
    public int addNumbers(int a, int b) {
        int sum = a + b;
        return sum; // Returning the calculated sum
    }

    public static void main(String[] args) {
        Example example = new Example();
        
        // Calling the method and storing the returned value
        int result = example.addNumbers(5, 7);
        
        // Printing the returned value
        System.out.println("Sum: " + result); // Output: Sum: 12
    }
}

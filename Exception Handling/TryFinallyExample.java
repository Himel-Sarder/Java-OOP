public class TryFinallyExample {
    public static void main(String[] args) {
        System.out.println("Opening a file...");

        try {
            // Simulate an exception
            int result = 10 / 0;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero");
        } finally {
            // Code in this block will always execute
            System.out.println("Closing the file...");
        }

        System.out.println("End of the program.");
    }
}

public class Factorial {

    // Method to calculate factorial recursively
    public int factorial(int n) {
        // Base case: factorial of 0 or 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Factorial factorialCalculator = new Factorial();

        // Calculate factorial of 5
        int result = factorialCalculator.factorial(5);
        System.out.println("Factorial of 5 is: " + result);

        // Calculate factorial of 0
        int resultZero = factorialCalculator.factorial(0);
        System.out.println("Factorial of 0 is: " + resultZero);

        // Calculate factorial of 1
        int resultOne = factorialCalculator.factorial(1);
        System.out.println("Factorial of 1 is: " + resultOne);
    }
}

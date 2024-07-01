public class VarargsExample {

    public static int sum(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }


  public static void main(String[] args) {
        System.out.println(sum(1, 2, 3));      // Outputs: 6
        System.out.println(sum(1, 2, 3, 4));   // Outputs: 10
        System.out.println(sum(1));            // Outputs: 1
        System.out.println(sum());             // Outputs: 0
    }
}

// Explanation
// Method Definition: sum(int... numbers) defines a method sum that accepts a variable number of integers (int... numbers).
// Calling the Method: You can call sum with any number of integers as arguments. Internally, numbers is treated as an array of int.

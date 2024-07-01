public class call_by_reference_with_array02 {
    public static void modifyArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] *= 2; // modifying elements of the array
        }
        
        System.out.println("Inside method, modified arr is:");
        printArray(array);
    }
    
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.println("Before calling method, arr is:");
        printArray(arr);
        
        modifyArray(arr);
        
        System.out.println("After calling method, arr is:");
        printArray(arr);
    }
}

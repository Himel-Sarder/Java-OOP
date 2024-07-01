class call_by_reference_with_array01 {
    // pass array of type int as a parameter
    public static void increment(int[] number){
        number[0] = number[0] + 1;  // increment first element of an array by 1
        System.out.println("value in method: "+number[0]);
    }
    
    
    public static void main(String[] args) {
        int[] number=new int[1]; // create an array of size 1
        number[0]=10; // assign value to fist element of an array
        System.out.println("value before method call: "+number[0]);
        increment(number);
        System.out.println("value after method call: "+number[0]);
        
    }
}

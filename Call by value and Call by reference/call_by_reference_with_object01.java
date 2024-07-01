class call_by_reference_with_object01 {
    
    int number = 10;
    
    // pass object as parameter
    static void increment(call_by_reference_with_object01 n){
        n.number = n.number + 1;  // increment variable by 1
        System.out.println("value in method: " + n.number);
    }
    
    public static void main(String[] args) {
     call_by_reference_with_object01 n = new call_by_reference_with_object01(); // pb is an object of class 'call_by_reference_with_object01'
        
        System.out.println("value before method call: "+ n.number);
        
        increment(n); // pass object of the class call_by_reference_with_object01
        
        System.out.println("value after method call: "+ n.number);
    }
}

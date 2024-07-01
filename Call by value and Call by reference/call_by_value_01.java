class call_by_value_01 {
    public static void increment(int number){
        
        number = number + 100;  // increment variable by 100
        
        System.out.println("value in method: " + number);
        
    }
    
    public static void main(String[] args) {
        int number=10;
        
        System.out.println("value before method call : "+number);
        
        increment(number);
        
        System.out.println("value after method call: "+number);
    }
}

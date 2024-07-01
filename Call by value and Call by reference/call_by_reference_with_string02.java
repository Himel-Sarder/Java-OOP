class call_by_reference_with_string02 {
    
    // pass an object of StringBuilder as a parameter
    public static void change(StringBuilder s){
        s.append(" world!"); // add word in s
        System.out.println("value in method: " + s.toString());
    }
    
    
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Hello");
        
        System.out.println("value before method call: " + s.toString());
      
        change(s);
      
        System.out.println("value after method call: " + s.toString());
        
    }
}

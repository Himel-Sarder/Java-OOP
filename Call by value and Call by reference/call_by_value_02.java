
class call_by_value_02 {
    public static void change(String name) {
        name = "Abonti";  // Setting name to "Abonti"
        System.out.println("Name in method: " + name);
    }

    public static void main(String[] args) {
        String name = "Himel";  // Initializing name
        
        System.out.println("value before method call : " + name);  // Printing initialized variable
        
        change(name);  // Calling the method
        
        System.out.println("value after method call: " + name);  // Printing original value
    }
}

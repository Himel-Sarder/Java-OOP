public class call_by_reference_with_string01 {
    public static void main(String[] args) {
        String str = "Hello";
        
        System.out.println("Before calling method, str is: " + str);
        
        modifyString(str);
        
        System.out.println("After calling method, str is: " + str);
    }
    
    public static void modifyString(String s) {
        s = s + " Himel"; // concatenating a new string
        System.out.println("Inside method, modified str is: " + s);
    }
}

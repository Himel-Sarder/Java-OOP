import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int divided = s.nextInt();
        int divisor = s.nextInt();
        try{
            int result = divided / divisor;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divided by zero!"); // System.out.println(e.getMessage());
        }
    }
}


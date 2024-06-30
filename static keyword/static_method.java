class student{
    void display1() {
        System.out.println("I am non-static method");
    }
    
    static void display2() {
        System.out.println("I am static method");
    }
}


public class static_method
{
	public static void main(String[] args) {
		student s = new student();  // Need to create Object for non-static method call 
		s.display1();
		
		student.display2();  // Don't Need to create Object for non-static method call, can call automatically
	}
}

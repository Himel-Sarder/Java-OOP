class Box {
    double height; // instance variable
    double width;  // instance variable
    double depth;  // instance variable
    static int count = 0; // instance variable
    
    Box(double height, double width, double depth) {  // Local variable
        this.height = height;  // Local variable is storing in this instance variable 
        this.width = width;
        this.depth = depth;
    }
    
    void displayVol(){
        count++;
        System.out.println("Volumn of " + count + " Box is " + (height * width * depth));
    }
}
public class To_refer_to_instance_variables
{
	public static void main(String[] args) {
		Box b1 = new Box(10, 10, 10);
		b1.displayVol();
		Box b2 = new Box(20, 30, 10);
		b2.displayVol();
	}
}

// Write a Java program to create a class called Circle with a private instance variable radius. 
// Provide public getter and setter methods to access and modify the radius variable. However, 
// provide two methods called calculateArea() and calculatePerimeter() that return the calculated area and perimeter based on the current radius value.



class Circle {
    private double redius;
    
    public double getter(){
        return redius;
    }
    
    public void setter(double redius){
        this.redius = redius;
    }
    
    public double calculateArea(){
        return Math.PI * redius * redius;
    }
    
    public double calculatePerimeter(){
        return 2 * Math.PI * redius;
    }
}

public class Problem_01 {
  public static void main(String[] args) {
      
    // Create an instance of Circle
    
    Circle c = new Circle();
    
    c.setter(7.0);
    
    double result1 =c.calculateArea();
    double result2 =c.calculatePerimeter();
    
    System.out.println("Area of circle is " + result1);
    System.out.println("Perimeter of circle is " + result2);
  }
}  

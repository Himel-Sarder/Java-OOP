class Teacher {
    String name;
    int id;
    double semester;
    double CGPA;
    
    void Display(){
        // Printing out the details using println statements
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Semester : " + semester);
        System.out.println("CGPA : " + CGPA);
        System.out.println("\n");
    }
}

public class voidMethod {
    public static void main(String[] args) {
        Teacher test1 = new Teacher(); // Creating an object of Teacher class

        // Assigning values to the instance variables of Teacher object
        test1.name = "Himel Sarder";
        test1.id = 22111121;
        test1.semester = 2.1;
        test1.CGPA = 3.55;
        test1.Display();
        
        Teacher test2 = new Teacher();
        
        test2.name = "Abonti Sana";
        test2.id = 22211122;
        test2.semester = 1.2;
        test2.CGPA = 3.35;
        test2.Display();

        
    }
}

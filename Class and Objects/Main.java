class Teacher {
    String name;
    int id;
    double semester;
    double CGPA;
}

public class Main {
    public static void main(String[] args) {
        Teacher test = new Teacher(); // Creating an object of Teacher class

        // Assigning values to the instance variables of Teacher object
        test.name = "Himel Sarder";
        test.id = 22111121;
        test.semester = 2.1;
        test.CGPA = 3.55;

        // Printing out the details using println statements
        System.out.println("Name : " + test.name);
        System.out.println("ID : " + test.id);
        System.out.println("Semester : " + test.semester);
        System.out.println("CGPA : " + test.CGPA);
    }
}

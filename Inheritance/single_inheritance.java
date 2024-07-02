class parent {
    String name;
    int age;
    
    void printMe_01() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class child extends parent {
    double dateOfbirth;
    
    void printMe_02() {
        System.out.println("Date of birth: " + dateOfbirth);
    }
}

public class single_inheritance {
    public static void main(String[] args) {
        child c = new child();
        
        c.name = "Himel sarder";
        c.age = 22;
        c.dateOfbirth = 2002.5; // Example date of birth
        
        c.printMe_01(); // Print parent's data
        c.printMe_02(); // Print child's data
    }
}
